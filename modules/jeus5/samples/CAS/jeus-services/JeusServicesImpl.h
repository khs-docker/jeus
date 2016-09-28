/*
 * $Id: JeusServicesImpl.h,v 1.2 2001/04/06 20:40:56 krodham Exp $
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
	
// JeusServicesImpl.h : Declaration of the CJeusServices

#ifndef __JEUSSERVICES_H_
#define __JEUSSERVICES_H_

#include "resource.h"       // main symbols
#include "JeusService.h"

/////////////////////////////////////////////////////////////////////////////
// CJeusServices
class ATL_NO_VTABLE CJeusServices : 
	public CComObjectRootEx<CComMultiThreadModel>,
	public CComCoClass<CJeusServices, &CLSID_JeusServices>,
	public ISupportErrorInfo,
	public IDispatchImpl<IJeusServices, &IID_IJeusServices, &LIBID_ComBridgeJeusServices>
{
public:
	CJeusServices()
	{
		m_pUnkMarshaler = NULL;
	}

DECLARE_REGISTRY_RESOURCEID(IDR_JEUSSERVICES)
DECLARE_GET_CONTROLLING_UNKNOWN()

DECLARE_PROTECT_FINAL_CONSTRUCT()

BEGIN_COM_MAP(CJeusServices)
	COM_INTERFACE_ENTRY(IJeusServices)
	COM_INTERFACE_ENTRY(IDispatch)
	COM_INTERFACE_ENTRY(ISupportErrorInfo)
	COM_INTERFACE_ENTRY_AGGREGATE(IID_IMarshal, m_pUnkMarshaler.p)
END_COM_MAP()

	HRESULT FinalConstruct()
	{
		return CoCreateFreeThreadedMarshaler(
			GetControllingUnknown(), &m_pUnkMarshaler.p);
	}

	void FinalRelease()
	{
		m_pUnkMarshaler.Release();
	}

	CComPtr<IUnknown> m_pUnkMarshaler;

// ISupportsErrorInfo
	STDMETHOD(InterfaceSupportsErrorInfo)(REFIID riid);

// IJeusServices
public:
// IEnterpriseServices
	STDMETHOD(get_ProviderURL)(BSTR *pVal);
	STDMETHOD(put_ProviderURL)(BSTR pVal);
	STDMETHOD(get_SecurityPrincipal)(BSTR * pVal);
	STDMETHOD(put_SecurityPrincipal)(BSTR pVal);
	STDMETHOD(get_SecurityCredentials)(BSTR * pVal);
	STDMETHOD(put_SecurityCredentials)(BSTR pVal);
	STDMETHOD(LookupEjbHome)(BSTR jndiName, BSTR homeClassName, IDispatch **ppHome);

private:
	JeusService m_service;
};

#endif //__JEUSSERVICES_H_
