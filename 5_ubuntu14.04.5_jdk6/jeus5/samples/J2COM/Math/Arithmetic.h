// Arithmetic.h : Declaration of the CArithmetic

#ifndef __ARITHMETIC_H_
#define __ARITHMETIC_H_

#include "resource.h"       // main symbols

/////////////////////////////////////////////////////////////////////////////
// CArithmetic
class ATL_NO_VTABLE CArithmetic : 
	public CComObjectRootEx<CComSingleThreadModel>,
	public CComCoClass<CArithmetic, &CLSID_Arithmetic>,
	public IDispatchImpl<IArithmetic, &IID_IArithmetic, &LIBID_MATHLib>
{
public:
	CArithmetic()
	{
	}

DECLARE_REGISTRY_RESOURCEID(IDR_ARITHMETIC)

DECLARE_PROTECT_FINAL_CONSTRUCT()

BEGIN_COM_MAP(CArithmetic)
	COM_INTERFACE_ENTRY(IArithmetic)
	COM_INTERFACE_ENTRY(IDispatch)
END_COM_MAP()

// IArithmetic
public:
	STDMETHOD(Sum)(int x, int y, /*[out retval]*/ int *sum);
};

#endif //__ARITHMETIC_H_
