/*
 * $Id: EnterpriseService.h,v 1.2 2001/04/17 20:32:39 dkohlert Exp $
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
	
// EnterpriseService.h : Declaration of the EnterpriseService

#ifndef __ENTERPRISESERVICE_H_
#define __ENTERPRISESERVICE_H_


// The _com_issue_errorex function seems to unset or overwrite
// the error info set by the method that failed.
// Because we don't want to lose the error info provided by the
// failed method, we redirect calls to _com_issue_errorex to
// an error handler of our own that doesn't modify the error info.
#define _com_issue_errorex j2eecas_com_error_handler

#ifdef COMBRIDGE_SAMPLE
#import	"com-bridge.dll"
#elif defined DEBUG
#import	"com-bridge_g.dll"
#else
#import	"com-bridge.dll"
#endif



#include "StdAfx.h"
#include "EnterpriseServices.h"
#include "Util.h"


/////////////////////////////////////////////////////////////////////////////
// EnterpriseService
class EnterpriseService 
{
public:
	EnterpriseService( CLSID clsid )
	{
		m_securityCredentials = L"";
		m_securityPrincipal = L"";
		m_providerURL = L"";
		m_context = NULL;
		m_systemClassLoader = NULL;
		m_jvm = NULL;
		m_serviceClsid = clsid;
	}

	virtual ~EnterpriseService()
	{}


// EnterpriseService
public:
// IEnterpriseServices
	virtual BSTR get_ProviderURL();
	virtual void put_ProviderURL(BSTR pVal);
	virtual BSTR get_SecurityPrincipal();
	virtual void put_SecurityPrincipal(BSTR pVal);
	virtual BSTR get_SecurityCredentials();
	virtual void put_SecurityCredentials(BSTR pVal);
	virtual IDispatchPtr LookupEjbHome(BSTR jndiName, BSTR homeClassName);
protected:
   ComBridgeEngine::IJavaProxyPtr GetJavaProxy(IDispatch * javaObj);
	virtual void PreContextCreation() {}
	virtual void InitContext();
	virtual IDispatchPtr GetInitialContextProperties();
	virtual void SetInitialContextFactory( ComBridgeEngine::IJavaProxyPtr &props );
	virtual void SetContextProviderURL( ComBridgeEngine::IJavaProxyPtr &props );
	virtual void SetContextSecurity( ComBridgeEngine::IJavaProxyPtr &props );
	virtual void PostContextCreation() {}
	virtual void InitJvm();
	virtual void InitSystemClassLoader();
	virtual IDispatchPtr FindJavaClass( BSTR typeName );
	virtual IDispatchPtr GetJavaStaticsFor( BSTR typeName );
	virtual BSTR InitialContextFactory() = 0;
//	virtual CLSID GetServiceCLSID() = 0;

	CComBSTR m_providerURL;
	CComBSTR m_securityCredentials;
	CComBSTR m_securityPrincipal;
	ComBridgeEngine::IJavaProxyPtr m_context;
   ComBridgeEngine::IJavaVirtualMachinePtr m_jvm;
   IDispatchPtr m_systemClassLoader;
	CLSID m_serviceClsid;
};

#endif //__ENTERPRISESERVICE_H_
