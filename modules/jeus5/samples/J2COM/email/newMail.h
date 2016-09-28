// newMail.h : Declaration of the CnewMail

#ifndef __NEWMAIL_H_
#define __NEWMAIL_H_

#include "resource.h"       // main symbols

/////////////////////////////////////////////////////////////////////////////
// CnewMail
class ATL_NO_VTABLE CnewMail : 
	public CComObjectRootEx<CComSingleThreadModel>,
	public CComCoClass<CnewMail, &CLSID_newMail>,
	public IDispatchImpl<InewMail, &IID_InewMail, &LIBID_EMAILLib>
{
public:
	CnewMail()
	{
	}

DECLARE_REGISTRY_RESOURCEID(IDR_NEWMAIL)

DECLARE_PROTECT_FINAL_CONSTRUCT()

BEGIN_COM_MAP(CnewMail)
	COM_INTERFACE_ENTRY(InewMail)
	COM_INTERFACE_ENTRY(IDispatch)
END_COM_MAP()

// InewMail
public:
	STDMETHOD(mail)(/*[in]*/ BSTR company, /*[in]*/ BSTR name);
};

#endif //__NEWMAIL_H_
