/*
 * $Id: JeusServicesImpl.cpp,v 1.3 2001/03/29 18:07:38 dkohlert Exp $
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

// JeusServicesImpl.cpp : Implementation of CJeusServices
#include "stdafx.h"
#include "JeusServices.h"
#include "JeusServicesImpl.h"

/////////////////////////////////////////////////////////////////////////////
// CJeusServices

STDMETHODIMP CJeusServices::InterfaceSupportsErrorInfo(REFIID riid)
{
	static const IID* arr[] = 
	{
		&IID_IJeusServices
	};
	for (int i=0; i < sizeof(arr) / sizeof(arr[0]); i++)
	{
		if (InlineIsEqualGUID(*arr[i],riid))
			return S_OK;
	}
	return S_FALSE;
}


// IEnterpriseServices

STDMETHODIMP CJeusServices::get_ProviderURL(BSTR *pVal)
{
   COM_METHOD_PROLOG(CJeusServices, __uuidof(JeusServices), 
			__uuidof(IEnterpriseServices), get_ProviderURL)

	if ( pVal == NULL )
	{
      ReportInvalidArgument(_classID, _interfaceID, _methodName);
		return E_INVALIDARG;
	}

	*pVal = m_service.get_ProviderURL();

	return S_OK;
   COM_METHOD_EPILOG()
}

STDMETHODIMP CJeusServices::put_ProviderURL(BSTR pVal)
{
   COM_METHOD_PROLOG(CJeusServices, __uuidof(JeusServices), 
			__uuidof(IEnterpriseServices), put_ProviderURL)

	if ( pVal == NULL )
	{
      ReportInvalidArgument(_classID, _interfaceID, _methodName);
		return E_INVALIDARG;
	}
	if ( pVal[0] == L'\0' )
	{
		ReportError(_classID, _interfaceID, 
			L"ProviderURL must not be empty or NULL in JeusServices::put_ProviderURL",
			E_INVALIDARG);
		return E_INVALIDARG;
	}

	m_service.put_ProviderURL(pVal);

	return S_OK;
   COM_METHOD_EPILOG()
}

STDMETHODIMP CJeusServices::get_SecurityPrincipal(BSTR * pVal)
{
   COM_METHOD_PROLOG(CJeusServices, __uuidof(JeusServices), 
			__uuidof(IEnterpriseServices), get_SecurityPrincipal)

	if ( pVal == NULL )
	{
      ReportInvalidArgument(_classID, _interfaceID, _methodName);
		return E_INVALIDARG;
	}

	*pVal = m_service.get_SecurityPrincipal();

	return S_OK;
   COM_METHOD_EPILOG()
}

STDMETHODIMP CJeusServices::put_SecurityPrincipal(BSTR pVal)
{
   COM_METHOD_PROLOG(CJeusServices, __uuidof(JeusServices), 
			__uuidof(IEnterpriseServices), put_SecurityPrincipal)

	if ( pVal == NULL )
	{
      ReportInvalidArgument(_classID, _interfaceID, _methodName);
		return E_INVALIDARG;
	}

	m_service.put_SecurityPrincipal(pVal);

	return S_OK;
   COM_METHOD_EPILOG()
}

STDMETHODIMP CJeusServices::get_SecurityCredentials(BSTR * pVal)
{
   COM_METHOD_PROLOG(CJeusServices, __uuidof(JeusServices), 
			__uuidof(IEnterpriseServices), get_SecurityCredentials)

	if ( pVal == NULL )
	{
      ReportInvalidArgument(_classID, _interfaceID, _methodName);
		return E_INVALIDARG;
	}

	*pVal = m_service.get_SecurityCredentials();
	
	return S_OK;
   COM_METHOD_EPILOG()
}

STDMETHODIMP CJeusServices::put_SecurityCredentials(BSTR pVal)
{
   COM_METHOD_PROLOG(CJeusServices, __uuidof(JeusServices), 
			__uuidof(IEnterpriseServices), put_SecurityCredentials)

	if ( pVal == NULL )
	{
      ReportInvalidArgument(_classID, _interfaceID, _methodName);
		return E_INVALIDARG;
	}

	m_service.put_SecurityCredentials(pVal);

	return S_OK;
   COM_METHOD_EPILOG()
}

STDMETHODIMP CJeusServices::LookupEjbHome(BSTR jndiName, BSTR homeClassName, IDispatch **ppHome)
{
	COM_METHOD_PROLOG(CJeusServices, __uuidof(JeusServices), 
			__uuidof(IEnterpriseServices), LookupEjbHome)

	if ( jndiName == NULL || homeClassName == NULL || ppHome == NULL )
	{
      ReportInvalidArgument(_classID, _interfaceID, _methodName);
		return E_INVALIDARG;
	}
 
	*ppHome = m_service.LookupEjbHome(jndiName, homeClassName);

	return S_OK;
   COM_METHOD_EPILOG()
}
