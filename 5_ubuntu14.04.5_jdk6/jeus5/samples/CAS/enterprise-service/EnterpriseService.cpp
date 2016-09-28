/*
 * $Id: EnterpriseService.cpp,v 1.1 2001/03/31 00:38:20 dkohlert Exp $
 *
 * Copyright (c) 1999 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 *
 * CopyrightVersion ejb 1.0
 *
 * @author Doug Kohlert
 */

#include "stdafx.h"
#include "EnterpriseService.h"


/////////////////////////////////////////////////////////////////////////////
// EnterpriseService

ComBridgeEngine::IJavaProxyPtr EnterpriseService::GetJavaProxy(IDispatch * javaObj)
{
	ComBridgeEngine::IJavaProxyPtr javaProxy( javaObj );

	if ( javaProxy == NULL )
	{
		AtlReportError(m_serviceClsid, L"Could not get IJavaProxy interface", 
			__uuidof(IEnterpriseServices), E_NOINTERFACE);
		_com_raise_error(E_NOINTERFACE);
	}

	return javaProxy;
}

BSTR EnterpriseService::get_ProviderURL()
{
	return m_providerURL;
}

void EnterpriseService::put_ProviderURL(BSTR pVal)
{
 	m_providerURL = pVal;
}

BSTR EnterpriseService::get_SecurityPrincipal()
{
	return m_securityPrincipal;
}

void EnterpriseService::put_SecurityPrincipal(BSTR pVal)
{
	m_securityPrincipal = pVal;
}

BSTR EnterpriseService::get_SecurityCredentials()
{
	return m_securityCredentials;
}

void EnterpriseService::put_SecurityCredentials(BSTR pVal)
{
	m_securityCredentials = pVal;
}

IDispatchPtr EnterpriseService::LookupEjbHome(BSTR jndiName, BSTR homeClassName)
{
	IDispatchPtr retDisp = NULL;
	ComBridgeEngine::IJavaProxyPtr portable;
	IDispatchPtr theClass, home, narrowedHome;

	InitContext();
	portable = GetJavaProxy(GetJavaStaticsFor(L"javax.rmi.PortableRemoteObject"));
	home = m_context->Invoke(L"lookup", L"(Ljava/lang/String;)Ljava/lang/Object",
			_variant_t(jndiName));
	theClass = FindJavaClass(homeClassName);
	narrowedHome = portable->Invoke(L"narrow", 
			L"(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;",
			_variant_t(home.GetInterfacePtr()),
			_variant_t(theClass.GetInterfacePtr())); 
	retDisp = narrowedHome.Detach();

	return retDisp;
}

void EnterpriseService::InitContext()
{
	ComBridgeEngine::IJavaProxyPtr props;
	IDispatchPtr theClass;

	InitSystemClassLoader();

	PreContextCreation();

	theClass = m_jvm->FindClass(m_systemClassLoader, L"javax.naming.InitialContext");

	if ( (props = GetInitialContextProperties()) != NULL )
	{
		SetInitialContextFactory(props);
		SetContextProviderURL(props);
		SetContextSecurity(props);
		m_context = GetJavaProxy(m_jvm->New(theClass, _variant_t(props.GetInterfacePtr())));
	}
	else
	{
		m_context = GetJavaProxy(m_jvm->New(theClass));
	}
	PostContextCreation();
}

IDispatchPtr EnterpriseService::GetInitialContextProperties()
{
	ComBridgeEngine::IJavaProxyPtr props;
	IDispatchPtr theClass;

	theClass = m_jvm->FindClass(m_systemClassLoader, L"java.util.Properties");
	props = GetJavaProxy(m_jvm->New(theClass));


	return props.Detach();
}

void EnterpriseService::SetInitialContextFactory( ComBridgeEngine::IJavaProxyPtr &props )
{
	props->Invoke(L"setProperty", 
			L"(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 
			_variant_t(L"java.naming.factory.initial"), 
			_variant_t(InitialContextFactory()));
}

void EnterpriseService::SetContextProviderURL( ComBridgeEngine::IJavaProxyPtr &props )
{
	props->Invoke(L"setProperty",  
			L"(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 
			_variant_t(L"java.naming.provider.url"), 
			_variant_t(m_providerURL));
}

void EnterpriseService::SetContextSecurity(ComBridgeEngine::IJavaProxyPtr &props)
{
	if ( m_securityPrincipal.Length() > 0 )
	{
		props->Invoke(L"setProperty",  
				L"(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 
				_variant_t(L"java.naming.security.principal"), 
				_variant_t(m_securityPrincipal));
		props->Invoke(L"setProperty",  
				L"(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 
				_variant_t(L"java.naming.security.credentials"), 
				_variant_t(m_securityCredentials));
	}
}

void EnterpriseService::InitJvm()
{
	if ( m_jvm == NULL )
	{
		ComBridgeEngine::IJvmStarterPtr jvmStarter(__uuidof(ComBridgeEngine::JvmStarter));
		if ( jvmStarter == NULL )
		{
			AtlReportError(m_serviceClsid, L"Could not get JvmStarter", 
				__uuidof(IEnterpriseServices), E_NOINTERFACE);
			_com_raise_error(E_NOINTERFACE);
		}

		m_jvm = jvmStarter->StartJvm();
		if ( m_jvm == NULL )
		{
			AtlReportError(m_serviceClsid, L"Could not get Jvm", 
				__uuidof(IEnterpriseServices), E_FAIL);
			_com_raise_error(E_FAIL);
		}
	}
}


void EnterpriseService::InitSystemClassLoader()
{
	if ( m_systemClassLoader == NULL )
	{
		InitJvm();

		m_systemClassLoader = m_jvm->GetSystemClassLoader();
		if ( m_systemClassLoader == NULL )
		{
			AtlReportError(m_serviceClsid, L"Could not get SystemClassLoader", 
				__uuidof(IEnterpriseServices), E_FAIL);
			_com_raise_error(E_FAIL);
		}
	}
}


IDispatchPtr EnterpriseService::FindJavaClass( BSTR typeName )
{
	InitSystemClassLoader();
	return m_jvm->FindClass(m_systemClassLoader, typeName);
}


IDispatchPtr EnterpriseService::GetJavaStaticsFor( BSTR typeName )
{
	IDispatchPtr theClass = FindJavaClass(typeName);
	return m_jvm->GetStatics(theClass);
}


