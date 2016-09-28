/* this ALWAYS GENERATED file contains the proxy stub code */


/* File created by MIDL compiler version 5.01.0164 */
/* at Thu Oct 11 00:53:56 2001
 */
/* Compiler settings for D:\util\java\com-bridge\cas\jeus-services\JeusServices.idl:
    Os (OptLev=s), W1, Zp8, env=Win32, ms_ext, c_ext
    error checks: allocation ref bounds_check enum stub_data 
*/
//@@MIDL_FILE_HEADING(  )


/* verify that the <rpcproxy.h> version is high enough to compile this file*/
#ifndef __REDQ_RPCPROXY_H_VERSION__
#define __REQUIRED_RPCPROXY_H_VERSION__ 440
#endif


#include "rpcproxy.h"
#ifndef __RPCPROXY_H_VERSION__
#error this stub requires an updated version of <rpcproxy.h>
#endif // __RPCPROXY_H_VERSION__


#include "JeusServices.h"

#define TYPE_FORMAT_STRING_SIZE   3                                 
#define PROC_FORMAT_STRING_SIZE   1                                 

typedef struct _MIDL_TYPE_FORMAT_STRING
    {
    short          Pad;
    unsigned char  Format[ TYPE_FORMAT_STRING_SIZE ];
    } MIDL_TYPE_FORMAT_STRING;

typedef struct _MIDL_PROC_FORMAT_STRING
    {
    short          Pad;
    unsigned char  Format[ PROC_FORMAT_STRING_SIZE ];
    } MIDL_PROC_FORMAT_STRING;


extern const MIDL_TYPE_FORMAT_STRING __MIDL_TypeFormatString;
extern const MIDL_PROC_FORMAT_STRING __MIDL_ProcFormatString;


/* Object interface: IUnknown, ver. 0.0,
   GUID={0x00000000,0x0000,0x0000,{0xC0,0x00,0x00,0x00,0x00,0x00,0x00,0x46}} */


/* Object interface: IDispatch, ver. 0.0,
   GUID={0x00020400,0x0000,0x0000,{0xC0,0x00,0x00,0x00,0x00,0x00,0x00,0x46}} */


/* Object interface: IEnterpriseServices, ver. 0.0,
   GUID={0x1814779A,0xEE1A,0x447A,{0x9A,0xF3,0x75,0xB3,0xC5,0x65,0xC2,0x8C}} */


/* Object interface: IJeusServices, ver. 0.0,
   GUID={0x422801D8,0x9B42,0x49f9,{0xBE,0x23,0x01,0xB3,0x5C,0xC1,0x3C,0xB9}} */


extern const MIDL_STUB_DESC Object_StubDesc;


#pragma code_seg(".orpc")

static const MIDL_STUB_DESC Object_StubDesc = 
    {
    0,
    NdrOleAllocate,
    NdrOleFree,
    0,
    0,
    0,
    0,
    0,
    __MIDL_TypeFormatString.Format,
    1, /* -error bounds_check flag */
    0x10001, /* Ndr library version */
    0,
    0x50100a4, /* MIDL Version 5.1.164 */
    0,
    0,
    0,  /* notify & notify_flag routine table */
    1,  /* Flags */
    0,  /* Reserved3 */
    0,  /* Reserved4 */
    0   /* Reserved5 */
    };

CINTERFACE_PROXY_VTABLE(14) _IJeusServicesProxyVtbl = 
{
    &IID_IJeusServices,
    IUnknown_QueryInterface_Proxy,
    IUnknown_AddRef_Proxy,
    IUnknown_Release_Proxy ,
    0 /* IDispatch_GetTypeInfoCount_Proxy */ ,
    0 /* IDispatch_GetTypeInfo_Proxy */ ,
    0 /* IDispatch_GetIDsOfNames_Proxy */ ,
    0 /* IDispatch_Invoke_Proxy */ ,
    0 /* IEnterpriseServices_get_ProviderURL_Proxy */ ,
    0 /* IEnterpriseServices_put_ProviderURL_Proxy */ ,
    0 /* IEnterpriseServices_get_SecurityPrincipal_Proxy */ ,
    0 /* IEnterpriseServices_put_SecurityPrincipal_Proxy */ ,
    0 /* IEnterpriseServices_get_SecurityCredentials_Proxy */ ,
    0 /* IEnterpriseServices_put_SecurityCredentials_Proxy */ ,
    0 /* IEnterpriseServices_LookupEjbHome_Proxy */
};


static const PRPC_STUB_FUNCTION IJeusServices_table[] =
{
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION,
    STUB_FORWARDING_FUNCTION
};

CInterfaceStubVtbl _IJeusServicesStubVtbl =
{
    &IID_IJeusServices,
    0,
    14,
    &IJeusServices_table[-3],
    CStdStubBuffer_DELEGATING_METHODS
};

#pragma data_seg(".rdata")

#if !defined(__RPC_WIN32__)
#error  Invalid build platform for this stub.
#endif

static const MIDL_PROC_FORMAT_STRING __MIDL_ProcFormatString =
    {
        0,
        {

			0x0
        }
    };

static const MIDL_TYPE_FORMAT_STRING __MIDL_TypeFormatString =
    {
        0,
        {
			NdrFcShort( 0x0 ),	/* 0 */

			0x0
        }
    };

const CInterfaceProxyVtbl * _JeusServices_ProxyVtblList[] = 
{
    ( CInterfaceProxyVtbl *) &_IJeusServicesProxyVtbl,
    0
};

const CInterfaceStubVtbl * _JeusServices_StubVtblList[] = 
{
    ( CInterfaceStubVtbl *) &_IJeusServicesStubVtbl,
    0
};

PCInterfaceName const _JeusServices_InterfaceNamesList[] = 
{
    "IJeusServices",
    0
};

const IID *  _JeusServices_BaseIIDList[] = 
{
    &IID_IEnterpriseServices,
    0
};


#define _JeusServices_CHECK_IID(n)	IID_GENERIC_CHECK_IID( _JeusServices, pIID, n)

int __stdcall _JeusServices_IID_Lookup( const IID * pIID, int * pIndex )
{
    
    if(!_JeusServices_CHECK_IID(0))
        {
        *pIndex = 0;
        return 1;
        }

    return 0;
}

const ExtendedProxyFileInfo JeusServices_ProxyFileInfo = 
{
    (PCInterfaceProxyVtblList *) & _JeusServices_ProxyVtblList,
    (PCInterfaceStubVtblList *) & _JeusServices_StubVtblList,
    (const PCInterfaceName * ) & _JeusServices_InterfaceNamesList,
    (const IID ** ) & _JeusServices_BaseIIDList,
    & _JeusServices_IID_Lookup, 
    1,
    1,
    0, /* table of [async_uuid] interfaces */
    0, /* Filler1 */
    0, /* Filler2 */
    0  /* Filler3 */
};
