/* this ALWAYS GENERATED file contains the definitions for the interfaces */


/* File created by MIDL compiler version 5.01.0164 */
/* at Thu Dec 05 13:57:17 2002
 */
/* Compiler settings for D:\src\Email\Email.idl:
    Oicf (OptLev=i2), W1, Zp8, env=Win32, ms_ext, c_ext
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

#ifndef __Email_h__
#define __Email_h__

#ifdef __cplusplus
extern "C"{
#endif 

/* Forward Declarations */ 

#ifndef __InewMail_FWD_DEFINED__
#define __InewMail_FWD_DEFINED__
typedef interface InewMail InewMail;
#endif 	/* __InewMail_FWD_DEFINED__ */


#ifndef __newMail_FWD_DEFINED__
#define __newMail_FWD_DEFINED__

#ifdef __cplusplus
typedef class newMail newMail;
#else
typedef struct newMail newMail;
#endif /* __cplusplus */

#endif 	/* __newMail_FWD_DEFINED__ */


/* header files for imported files */
#include "oaidl.h"
#include "ocidl.h"

void __RPC_FAR * __RPC_USER MIDL_user_allocate(size_t);
void __RPC_USER MIDL_user_free( void __RPC_FAR * ); 

#ifndef __InewMail_INTERFACE_DEFINED__
#define __InewMail_INTERFACE_DEFINED__

/* interface InewMail */
/* [unique][helpstring][dual][uuid][object] */ 


EXTERN_C const IID IID_InewMail;

#if defined(__cplusplus) && !defined(CINTERFACE)
    
    MIDL_INTERFACE("2434BC8E-56C9-4B47-9884-703300A3AB27")
    InewMail : public IDispatch
    {
    public:
        virtual /* [helpstring][id] */ HRESULT STDMETHODCALLTYPE mail( 
            /* [in] */ BSTR company,
            /* [in] */ BSTR name) = 0;
        
    };
    
#else 	/* C style interface */

    typedef struct InewMailVtbl
    {
        BEGIN_INTERFACE
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *QueryInterface )( 
            InewMail __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [iid_is][out] */ void __RPC_FAR *__RPC_FAR *ppvObject);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *AddRef )( 
            InewMail __RPC_FAR * This);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *Release )( 
            InewMail __RPC_FAR * This);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfoCount )( 
            InewMail __RPC_FAR * This,
            /* [out] */ UINT __RPC_FAR *pctinfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfo )( 
            InewMail __RPC_FAR * This,
            /* [in] */ UINT iTInfo,
            /* [in] */ LCID lcid,
            /* [out] */ ITypeInfo __RPC_FAR *__RPC_FAR *ppTInfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetIDsOfNames )( 
            InewMail __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [size_is][in] */ LPOLESTR __RPC_FAR *rgszNames,
            /* [in] */ UINT cNames,
            /* [in] */ LCID lcid,
            /* [size_is][out] */ DISPID __RPC_FAR *rgDispId);
        
        /* [local] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *Invoke )( 
            InewMail __RPC_FAR * This,
            /* [in] */ DISPID dispIdMember,
            /* [in] */ REFIID riid,
            /* [in] */ LCID lcid,
            /* [in] */ WORD wFlags,
            /* [out][in] */ DISPPARAMS __RPC_FAR *pDispParams,
            /* [out] */ VARIANT __RPC_FAR *pVarResult,
            /* [out] */ EXCEPINFO __RPC_FAR *pExcepInfo,
            /* [out] */ UINT __RPC_FAR *puArgErr);
        
        /* [helpstring][id] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *mail )( 
            InewMail __RPC_FAR * This,
            /* [in] */ BSTR company,
            /* [in] */ BSTR name);
        
        END_INTERFACE
    } InewMailVtbl;

    interface InewMail
    {
        CONST_VTBL struct InewMailVtbl __RPC_FAR *lpVtbl;
    };

    

#ifdef COBJMACROS


#define InewMail_QueryInterface(This,riid,ppvObject)	\
    (This)->lpVtbl -> QueryInterface(This,riid,ppvObject)

#define InewMail_AddRef(This)	\
    (This)->lpVtbl -> AddRef(This)

#define InewMail_Release(This)	\
    (This)->lpVtbl -> Release(This)


#define InewMail_GetTypeInfoCount(This,pctinfo)	\
    (This)->lpVtbl -> GetTypeInfoCount(This,pctinfo)

#define InewMail_GetTypeInfo(This,iTInfo,lcid,ppTInfo)	\
    (This)->lpVtbl -> GetTypeInfo(This,iTInfo,lcid,ppTInfo)

#define InewMail_GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)	\
    (This)->lpVtbl -> GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)

#define InewMail_Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)	\
    (This)->lpVtbl -> Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)


#define InewMail_mail(This,company,name)	\
    (This)->lpVtbl -> mail(This,company,name)

#endif /* COBJMACROS */


#endif 	/* C style interface */



/* [helpstring][id] */ HRESULT STDMETHODCALLTYPE InewMail_mail_Proxy( 
    InewMail __RPC_FAR * This,
    /* [in] */ BSTR company,
    /* [in] */ BSTR name);


void __RPC_STUB InewMail_mail_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);



#endif 	/* __InewMail_INTERFACE_DEFINED__ */



#ifndef __EMAILLib_LIBRARY_DEFINED__
#define __EMAILLib_LIBRARY_DEFINED__

/* library EMAILLib */
/* [helpstring][version][uuid] */ 


EXTERN_C const IID LIBID_EMAILLib;

EXTERN_C const CLSID CLSID_newMail;

#ifdef __cplusplus

class DECLSPEC_UUID("16B17112-D1A1-4971-93CC-5D42D77F95F3")
newMail;
#endif
#endif /* __EMAILLib_LIBRARY_DEFINED__ */

/* Additional Prototypes for ALL interfaces */

unsigned long             __RPC_USER  BSTR_UserSize(     unsigned long __RPC_FAR *, unsigned long            , BSTR __RPC_FAR * ); 
unsigned char __RPC_FAR * __RPC_USER  BSTR_UserMarshal(  unsigned long __RPC_FAR *, unsigned char __RPC_FAR *, BSTR __RPC_FAR * ); 
unsigned char __RPC_FAR * __RPC_USER  BSTR_UserUnmarshal(unsigned long __RPC_FAR *, unsigned char __RPC_FAR *, BSTR __RPC_FAR * ); 
void                      __RPC_USER  BSTR_UserFree(     unsigned long __RPC_FAR *, BSTR __RPC_FAR * ); 

/* end of Additional Prototypes */

#ifdef __cplusplus
}
#endif

#endif
