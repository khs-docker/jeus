/* this ALWAYS GENERATED file contains the definitions for the interfaces */


/* File created by MIDL compiler version 5.01.0164 */
/* at Thu Oct 11 00:58:39 2001
 */
/* Compiler settings for .\EnterpriseServices.idl:
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

#ifndef __EnterpriseServices_h__
#define __EnterpriseServices_h__

#ifdef __cplusplus
extern "C"{
#endif 

/* Forward Declarations */ 

#ifndef __IEnterpriseServices_FWD_DEFINED__
#define __IEnterpriseServices_FWD_DEFINED__
typedef interface IEnterpriseServices IEnterpriseServices;
#endif 	/* __IEnterpriseServices_FWD_DEFINED__ */


/* header files for imported files */
#include "oaidl.h"
#include "ocidl.h"

void __RPC_FAR * __RPC_USER MIDL_user_allocate(size_t);
void __RPC_USER MIDL_user_free( void __RPC_FAR * ); 

#ifndef __IEnterpriseServices_INTERFACE_DEFINED__
#define __IEnterpriseServices_INTERFACE_DEFINED__

/* interface IEnterpriseServices */
/* [unique][helpstring][dual][uuid][object] */ 


EXTERN_C const IID IID_IEnterpriseServices;

#if defined(__cplusplus) && !defined(CINTERFACE)
    
    MIDL_INTERFACE("1814779A-EE1A-447A-9AF3-75B3C565C28C")
    IEnterpriseServices : public IDispatch
    {
    public:
        virtual /* [helpstring][id][propget] */ HRESULT STDMETHODCALLTYPE get_ProviderURL( 
            /* [retval][out] */ BSTR __RPC_FAR *pVal) = 0;
        
        virtual /* [helpstring][id][propput] */ HRESULT STDMETHODCALLTYPE put_ProviderURL( 
            /* [in] */ BSTR newVal) = 0;
        
        virtual /* [helpstring][id][propget] */ HRESULT STDMETHODCALLTYPE get_SecurityPrincipal( 
            /* [retval][out] */ BSTR __RPC_FAR *pVal) = 0;
        
        virtual /* [helpstring][id][propput] */ HRESULT STDMETHODCALLTYPE put_SecurityPrincipal( 
            /* [in] */ BSTR newVal) = 0;
        
        virtual /* [helpstring][id][propget] */ HRESULT STDMETHODCALLTYPE get_SecurityCredentials( 
            /* [retval][out] */ BSTR __RPC_FAR *pVal) = 0;
        
        virtual /* [helpstring][id][propput] */ HRESULT STDMETHODCALLTYPE put_SecurityCredentials( 
            /* [in] */ BSTR newVal) = 0;
        
        virtual /* [helpstring][id] */ HRESULT STDMETHODCALLTYPE LookupEjbHome( 
            /* [in] */ BSTR jndiName,
            /* [in] */ BSTR homeClassName,
            /* [retval][out] */ IDispatch __RPC_FAR *__RPC_FAR *ppHome) = 0;
        
    };
    
#else 	/* C style interface */

    typedef struct IEnterpriseServicesVtbl
    {
        BEGIN_INTERFACE
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *QueryInterface )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [iid_is][out] */ void __RPC_FAR *__RPC_FAR *ppvObject);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *AddRef )( 
            IEnterpriseServices __RPC_FAR * This);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *Release )( 
            IEnterpriseServices __RPC_FAR * This);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfoCount )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [out] */ UINT __RPC_FAR *pctinfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfo )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ UINT iTInfo,
            /* [in] */ LCID lcid,
            /* [out] */ ITypeInfo __RPC_FAR *__RPC_FAR *ppTInfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetIDsOfNames )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [size_is][in] */ LPOLESTR __RPC_FAR *rgszNames,
            /* [in] */ UINT cNames,
            /* [in] */ LCID lcid,
            /* [size_is][out] */ DISPID __RPC_FAR *rgDispId);
        
        /* [local] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *Invoke )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ DISPID dispIdMember,
            /* [in] */ REFIID riid,
            /* [in] */ LCID lcid,
            /* [in] */ WORD wFlags,
            /* [out][in] */ DISPPARAMS __RPC_FAR *pDispParams,
            /* [out] */ VARIANT __RPC_FAR *pVarResult,
            /* [out] */ EXCEPINFO __RPC_FAR *pExcepInfo,
            /* [out] */ UINT __RPC_FAR *puArgErr);
        
        /* [helpstring][id][propget] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *get_ProviderURL )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [retval][out] */ BSTR __RPC_FAR *pVal);
        
        /* [helpstring][id][propput] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *put_ProviderURL )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ BSTR newVal);
        
        /* [helpstring][id][propget] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *get_SecurityPrincipal )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [retval][out] */ BSTR __RPC_FAR *pVal);
        
        /* [helpstring][id][propput] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *put_SecurityPrincipal )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ BSTR newVal);
        
        /* [helpstring][id][propget] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *get_SecurityCredentials )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [retval][out] */ BSTR __RPC_FAR *pVal);
        
        /* [helpstring][id][propput] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *put_SecurityCredentials )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ BSTR newVal);
        
        /* [helpstring][id] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *LookupEjbHome )( 
            IEnterpriseServices __RPC_FAR * This,
            /* [in] */ BSTR jndiName,
            /* [in] */ BSTR homeClassName,
            /* [retval][out] */ IDispatch __RPC_FAR *__RPC_FAR *ppHome);
        
        END_INTERFACE
    } IEnterpriseServicesVtbl;

    interface IEnterpriseServices
    {
        CONST_VTBL struct IEnterpriseServicesVtbl __RPC_FAR *lpVtbl;
    };

    

#ifdef COBJMACROS


#define IEnterpriseServices_QueryInterface(This,riid,ppvObject)	\
    (This)->lpVtbl -> QueryInterface(This,riid,ppvObject)

#define IEnterpriseServices_AddRef(This)	\
    (This)->lpVtbl -> AddRef(This)

#define IEnterpriseServices_Release(This)	\
    (This)->lpVtbl -> Release(This)


#define IEnterpriseServices_GetTypeInfoCount(This,pctinfo)	\
    (This)->lpVtbl -> GetTypeInfoCount(This,pctinfo)

#define IEnterpriseServices_GetTypeInfo(This,iTInfo,lcid,ppTInfo)	\
    (This)->lpVtbl -> GetTypeInfo(This,iTInfo,lcid,ppTInfo)

#define IEnterpriseServices_GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)	\
    (This)->lpVtbl -> GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)

#define IEnterpriseServices_Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)	\
    (This)->lpVtbl -> Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)


#define IEnterpriseServices_get_ProviderURL(This,pVal)	\
    (This)->lpVtbl -> get_ProviderURL(This,pVal)

#define IEnterpriseServices_put_ProviderURL(This,newVal)	\
    (This)->lpVtbl -> put_ProviderURL(This,newVal)

#define IEnterpriseServices_get_SecurityPrincipal(This,pVal)	\
    (This)->lpVtbl -> get_SecurityPrincipal(This,pVal)

#define IEnterpriseServices_put_SecurityPrincipal(This,newVal)	\
    (This)->lpVtbl -> put_SecurityPrincipal(This,newVal)

#define IEnterpriseServices_get_SecurityCredentials(This,pVal)	\
    (This)->lpVtbl -> get_SecurityCredentials(This,pVal)

#define IEnterpriseServices_put_SecurityCredentials(This,newVal)	\
    (This)->lpVtbl -> put_SecurityCredentials(This,newVal)

#define IEnterpriseServices_LookupEjbHome(This,jndiName,homeClassName,ppHome)	\
    (This)->lpVtbl -> LookupEjbHome(This,jndiName,homeClassName,ppHome)

#endif /* COBJMACROS */


#endif 	/* C style interface */



/* [helpstring][id][propget] */ HRESULT STDMETHODCALLTYPE IEnterpriseServices_get_ProviderURL_Proxy( 
    IEnterpriseServices __RPC_FAR * This,
    /* [retval][out] */ BSTR __RPC_FAR *pVal);


void __RPC_STUB IEnterpriseServices_get_ProviderURL_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);


/* [helpstring][id][propput] */ HRESULT STDMETHODCALLTYPE IEnterpriseServices_put_ProviderURL_Proxy( 
    IEnterpriseServices __RPC_FAR * This,
    /* [in] */ BSTR newVal);


void __RPC_STUB IEnterpriseServices_put_ProviderURL_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);


/* [helpstring][id][propget] */ HRESULT STDMETHODCALLTYPE IEnterpriseServices_get_SecurityPrincipal_Proxy( 
    IEnterpriseServices __RPC_FAR * This,
    /* [retval][out] */ BSTR __RPC_FAR *pVal);


void __RPC_STUB IEnterpriseServices_get_SecurityPrincipal_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);


/* [helpstring][id][propput] */ HRESULT STDMETHODCALLTYPE IEnterpriseServices_put_SecurityPrincipal_Proxy( 
    IEnterpriseServices __RPC_FAR * This,
    /* [in] */ BSTR newVal);


void __RPC_STUB IEnterpriseServices_put_SecurityPrincipal_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);


/* [helpstring][id][propget] */ HRESULT STDMETHODCALLTYPE IEnterpriseServices_get_SecurityCredentials_Proxy( 
    IEnterpriseServices __RPC_FAR * This,
    /* [retval][out] */ BSTR __RPC_FAR *pVal);


void __RPC_STUB IEnterpriseServices_get_SecurityCredentials_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);


/* [helpstring][id][propput] */ HRESULT STDMETHODCALLTYPE IEnterpriseServices_put_SecurityCredentials_Proxy( 
    IEnterpriseServices __RPC_FAR * This,
    /* [in] */ BSTR newVal);


void __RPC_STUB IEnterpriseServices_put_SecurityCredentials_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);


/* [helpstring][id] */ HRESULT STDMETHODCALLTYPE IEnterpriseServices_LookupEjbHome_Proxy( 
    IEnterpriseServices __RPC_FAR * This,
    /* [in] */ BSTR jndiName,
    /* [in] */ BSTR homeClassName,
    /* [retval][out] */ IDispatch __RPC_FAR *__RPC_FAR *ppHome);


void __RPC_STUB IEnterpriseServices_LookupEjbHome_Stub(
    IRpcStubBuffer *This,
    IRpcChannelBuffer *_pRpcChannelBuffer,
    PRPC_MESSAGE _pRpcMessage,
    DWORD *_pdwStubPhase);



#endif 	/* __IEnterpriseServices_INTERFACE_DEFINED__ */


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
