/* this ALWAYS GENERATED file contains the definitions for the interfaces */


/* File created by MIDL compiler version 5.01.0164 */
/* at Mon Dec 02 21:47:31 2002
 */
/* Compiler settings for Math.idl:
    Os (OptLev=s), W1, Zp8, env=Win32, ms_ext, c_ext
    error checks: allocation ref bounds_check enum stub_data 
*/
//@@MIDL_FILE_HEADING(  )


/* verify that the <rpcndr.h> version is high enough to compile this file*/
#ifndef __REQUIRED_RPCNDR_H_VERSION__
#define __REQUIRED_RPCNDR_H_VERSION__ 440
#endif

#include "rpc.h"
#include "rpcndr.h"

#ifndef __RPCNDR_H_VERSION__
#error this stub requires an updated version of <rpcndr.h>
#endif // __RPCNDR_H_VERSION__

#ifndef COM_NO_WINDOWS_H
#include "windows.h"
#include "ole2.h"
#endif /*COM_NO_WINDOWS_H*/

#ifndef __Math_h__
#define __Math_h__

#ifdef __cplusplus
extern "C"{
#endif 

/* Forward Declarations */ 

#ifndef __IArithmetic_FWD_DEFINED__
#define __IArithmetic_FWD_DEFINED__
typedef interface IArithmetic IArithmetic;
#endif 	/* __IArithmetic_FWD_DEFINED__ */


#ifndef __Arithmetic_FWD_DEFINED__
#define __Arithmetic_FWD_DEFINED__

#ifdef __cplusplus
typedef class Arithmetic Arithmetic;
#else
typedef struct Arithmetic Arithmetic;
#endif /* __cplusplus */

#endif 	/* __Arithmetic_FWD_DEFINED__ */


/* header files for imported files */
#include "oaidl.h"
#include "ocidl.h"

void __RPC_FAR * __RPC_USER MIDL_user_allocate(size_t);
void __RPC_USER MIDL_user_free( void __RPC_FAR * ); 

#ifndef __IArithmetic_INTERFACE_DEFINED__
#define __IArithmetic_INTERFACE_DEFINED__

/* interface IArithmetic */
/* [unique][helpstring][dual][uuid][object] */ 


EXTERN_C const IID IID_IArithmetic;

#if defined(__cplusplus) && !defined(CINTERFACE)
    
    MIDL_INTERFACE("9DA6E3FD-0A77-489A-82D9-FACDB294A4E5")
    IArithmetic : public IDispatch
    {
    public:
        virtual /* [helpstring][id] */ HRESULT STDMETHODCALLTYPE Sum( 
            int x,
            int y,
            /* [retval][out] */ int __RPC_FAR *sum) = 0;
        
    };
    
#else 	/* C style interface */

    typedef struct IArithmeticVtbl
    {
        BEGIN_INTERFACE
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *QueryInterface )( 
            IArithmetic __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [iid_is][out] */ void __RPC_FAR *__RPC_FAR *ppvObject);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *AddRef )( 
            IArithmetic __RPC_FAR * This);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *Release )( 
            IArithmetic __RPC_FAR * This);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfoCount )( 
            IArithmetic __RPC_FAR * This,
            /* [out] */ UINT __RPC_FAR *pctinfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfo )( 
            IArithmetic __RPC_FAR * This,
            /* [in] */ UINT iTInfo,
            /* [in] */ LCID lcid,
            /* [out] */ ITypeInfo __RPC_FAR *__RPC_FAR *ppTInfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetIDsOfNames )( 
            IArithmetic __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [size_is][in] */ LPOLESTR __RPC_FAR *rgszNames,
            /* [in] */ UINT cNames,
            /* [in] */ LCID lcid,
            /* [size_is][out] */ DISPID __RPC_FAR *rgDispId);
        
        /* [local] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *Invoke )( 
            IArithmetic __RPC_FAR * This,
            /* [in] */ DISPID dispIdMember,
            /* [in] */ REFIID riid,
            /* [in] */ LCID lcid,
            /* [in] */ WORD wFlags,
            /* [out][in] */ DISPPARAMS __RPC_FAR *pDispParams,
            /* [out] */ VARIANT __RPC_FAR *pVarResult,
            /* [out] */ EXCEPINFO __RPC_FAR *pExcepInfo,
            /* [out] */ UINT __RPC_FAR *puArgErr);
        
        /* [helpstring][id] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *Sum )( 
            IArithmetic __RPC_FAR * This,
            int x,
            int y,
            /* [retval][out] */ int __RPC_FAR *sum);
        
        END_INTERFACE
    } IArithmeticVtbl;

    interface IArithmetic
    {
        CONST_VTBL struct IArithmeticVtbl __RPC_FAR *lpVtbl;
    };

    

#ifdef COBJMACROS


#define IArithmetic_QueryInterface(This,riid,ppvObject)	\
    (This)->lpVtbl -> QueryInterface(This,riid,ppvObject)

#define IArithmetic_AddRef(This)	\
    (This)->lpVtbl -> AddRef(This)

#define IArithmetic_Release(This)	\
    (This)->lpVtbl -> Release(This)


#define IArithmetic_GetTypeInfoCount(This,pctinfo)	\
    (This)->lpVtbl -> GetTypeInfoCount(This,pctinfo)

#define IArithmetic_GetTypeInfo(This,iTInfo,lcid,ppTInfo)	\
    (This)->lpVtbl -> GetTypeInfo(This,iTInfo,lcid,ppTInfo)

#define IArithmetic_GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)	\
    (This)->lpVtbl -> GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)

#define IArithmetic_Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)	\
    (This)->lpVtbl -> Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)


#define IArithmetic_Sum(This,x,y,sum)	\
    (This)->lpVtbl -> Sum(This,x,y,sum)

#endif /* COBJMACROS */


#endif 	/* C style interface */



/* [helpstring][id] */ HRESULT STDMETHODCALLTYPE IArithmetic_Sum_Proxy( 
    IArithmetic __RPC_FAR * This,
    int x,
    int y,
    /* [retval][out] */ int __RPC_FAR *sum);


void __RPC_STUB IArithmetic_Sum_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);



#endif 	/* __IArithmetic_INTERFACE_DEFINED__ */



#ifndef __MATHLib_LIBRARY_DEFINED__
#define __MATHLib_LIBRARY_DEFINED__

/* library MATHLib */
/* [helpstring][version][uuid] */ 


EXTERN_C const IID LIBID_MATHLib;

EXTERN_C const CLSID CLSID_Arithmetic;

#ifdef __cplusplus

class DECLSPEC_UUID("50354DC9-E6FF-4A88-9CB7-8C1C4BE1E5BE")
Arithmetic;
#endif
#endif /* __MATHLib_LIBRARY_DEFINED__ */

/* Additional Prototypes for ALL interfaces */

/* end of Additional Prototypes */

#ifdef __cplusplus
}
#endif

#endif
