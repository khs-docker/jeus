/* this ALWAYS GENERATED file contains the definitions for the interfaces */


/* File created by MIDL compiler version 5.01.0164 */
/* at Thu Oct 11 00:53:56 2001
 */
/* Compiler settings for D:\util\java\com-bridge\cas\jeus-services\JeusServices.idl:
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

#ifndef __JeusServices_h__
#define __JeusServices_h__

#ifdef __cplusplus
extern "C"{
#endif 

/* Forward Declarations */ 

#ifndef __IJeusServices_FWD_DEFINED__
#define __IJeusServices_FWD_DEFINED__
typedef interface IJeusServices IJeusServices;
#endif 	/* __IJeusServices_FWD_DEFINED__ */


#ifndef __JeusServices_FWD_DEFINED__
#define __JeusServices_FWD_DEFINED__

#ifdef __cplusplus
typedef class JeusServices JeusServices;
#else
typedef struct JeusServices JeusServices;
#endif /* __cplusplus */

#endif 	/* __JeusServices_FWD_DEFINED__ */


/* header files for imported files */
#include "oaidl.h"
#include "ocidl.h"
#include "enterpriseservices.h"

void __RPC_FAR * __RPC_USER MIDL_user_allocate(size_t);
void __RPC_USER MIDL_user_free( void __RPC_FAR * ); 

#ifndef __IJeusServices_INTERFACE_DEFINED__
#define __IJeusServices_INTERFACE_DEFINED__

/* interface IJeusServices */
/* [unique][helpstring][dual][uuid][object] */ 


EXTERN_C const IID IID_IJeusServices;

#if defined(__cplusplus) && !defined(CINTERFACE)
    
    MIDL_INTERFACE("422801D8-9B42-49f9-BE23-01B35CC13CB9")
    IJeusServices : public IEnterpriseServices
    {
    public:
    };
    
#else 	/* C style interface */

    typedef struct IJeusServicesVtbl
    {
        BEGIN_INTERFACE
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *QueryInterface )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [iid_is][out] */ void __RPC_FAR *__RPC_FAR *ppvObject);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *AddRef )( 
            IJeusServices __RPC_FAR * This);
        
        ULONG ( STDMETHODCALLTYPE __RPC_FAR *Release )( 
            IJeusServices __RPC_FAR * This);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfoCount )( 
            IJeusServices __RPC_FAR * This,
            /* [out] */ UINT __RPC_FAR *pctinfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetTypeInfo )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ UINT iTInfo,
            /* [in] */ LCID lcid,
            /* [out] */ ITypeInfo __RPC_FAR *__RPC_FAR *ppTInfo);
        
        HRESULT ( STDMETHODCALLTYPE __RPC_FAR *GetIDsOfNames )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ REFIID riid,
            /* [size_is][in] */ LPOLESTR __RPC_FAR *rgszNames,
            /* [in] */ UINT cNames,
            /* [in] */ LCID lcid,
            /* [size_is][out] */ DISPID __RPC_FAR *rgDispId);
        
        /* [local] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *Invoke )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ DISPID dispIdMember,
            /* [in] */ REFIID riid,
            /* [in] */ LCID lcid,
            /* [in] */ WORD wFlags,
            /* [out][in] */ DISPPARAMS __RPC_FAR *pDispParams,
            /* [out] */ VARIANT __RPC_FAR *pVarResult,
            /* [out] */ EXCEPINFO __RPC_FAR *pExcepInfo,
            /* [out] */ UINT __RPC_FAR *puArgErr);
        
        /* [helpstring][id][propget] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *get_ProviderURL )( 
            IJeusServices __RPC_FAR * This,
            /* [retval][out] */ BSTR __RPC_FAR *pVal);
        
        /* [helpstring][id][propput] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *put_ProviderURL )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ BSTR newVal);
        
        /* [helpstring][id][propget] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *get_SecurityPrincipal )( 
            IJeusServices __RPC_FAR * This,
            /* [retval][out] */ BSTR __RPC_FAR *pVal);
        
        /* [helpstring][id][propput] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *put_SecurityPrincipal )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ BSTR newVal);
        
        /* [helpstring][id][propget] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *get_SecurityCredentials )( 
            IJeusServices __RPC_FAR * This,
            /* [retval][out] */ BSTR __RPC_FAR *pVal);
        
        /* [helpstring][id][propput] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *put_SecurityCredentials )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ BSTR newVal);
        
        /* [helpstring][id] */ HRESULT ( STDMETHODCALLTYPE __RPC_FAR *LookupEjbHome )( 
            IJeusServices __RPC_FAR * This,
            /* [in] */ BSTR jndiName,
            /* [in] */ BSTR homeClassName,
            /* [retval][out] */ IDispatch __RPC_FAR *__RPC_FAR *ppHome);
        
        END_INTERFACE
    } IJeusServicesVtbl;

    interface IJeusServices
    {
        CONST_VTBL struct IJeusServicesVtbl __RPC_FAR *lpVtbl;
    };

    

#ifdef COBJMACROS


#define IJeusServices_QueryInterface(This,riid,ppvObject)	\
    (This)->lpVtbl -> QueryInterface(This,riid,ppvObject)

#define IJeusServices_AddRef(This)	\
    (This)->lpVtbl -> AddRef(This)

#define IJeusServices_Release(This)	\
    (This)->lpVtbl -> Release(This)


#define IJeusServices_GetTypeInfoCount(This,pctinfo)	\
    (This)->lpVtbl -> GetTypeInfoCount(This,pctinfo)

#define IJeusServices_GetTypeInfo(This,iTInfo,lcid,ppTInfo)	\
    (This)->lpVtbl -> GetTypeInfo(This,iTInfo,lcid,ppTInfo)

#define IJeusServices_GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)	\
    (This)->lpVtbl -> GetIDsOfNames(This,riid,rgszNames,cNames,lcid,rgDispId)

#define IJeusServices_Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)	\
    (This)->lpVtbl -> Invoke(This,dispIdMember,riid,lcid,wFlags,pDispParams,pVarResult,pExcepInfo,puArgErr)


#define IJeusServices_get_ProviderURL(This,pVal)	\
    (This)->lpVtbl -> get_ProviderURL(This,pVal)

#define IJeusServices_put_ProviderURL(This,newVal)	\
    (This)->lpVtbl -> put_ProviderURL(This,newVal)

#define IJeusServices_get_SecurityPrincipal(This,pVal)	\
    (This)->lpVtbl -> get_SecurityPrincipal(This,pVal)

#define IJeusServices_put_SecurityPrincipal(This,newVal)	\
    (This)->lpVtbl -> put_SecurityPrincipal(This,newVal)

#define IJeusServices_get_SecurityCredentials(This,pVal)	\
    (This)->lpVtbl -> get_SecurityCredentials(This,pVal)

#define IJeusServices_put_SecurityCredentials(This,newVal)	\
    (This)->lpVtbl -> put_SecurityCredentials(This,newVal)

#define IJeusServices_LookupEjbHome(This,jndiName,homeClassName,ppHome)	\
    (This)->lpVtbl -> LookupEjbHome(This,jndiName,homeClassName,ppHome)


#endif /* COBJMACROS */


#endif 	/* C style interface */




#endif 	/* __IJeusServices_INTERFACE_DEFINED__ */



#ifndef __ComBridgeJeusServices_LIBRARY_DEFINED__
#define __ComBridgeJeusServices_LIBRARY_DEFINED__

/* library ComBridgeJeusServices */
/* [helpstring][version][uuid] */ 


EXTERN_C const IID LIBID_ComBridgeJeusServices;

EXTERN_C const CLSID CLSID_JeusServices;

#ifdef __cplusplus

class DECLSPEC_UUID("9478E828-10AF-487d-AAB0-2580357B0E02")
JeusServices;
#endif
#endif /* __ComBridgeJeusServices_LIBRARY_DEFINED__ */

/* Additional Prototypes for ALL interfaces */

/* end of Additional Prototypes */

#ifdef __cplusplus
}
#endif

#endif
