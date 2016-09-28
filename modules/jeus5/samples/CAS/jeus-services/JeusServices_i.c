/* this file contains the actual definitions of */
/* the IIDs and CLSIDs */

/* link this file in with the server and any clients */


/* File created by MIDL compiler version 5.01.0164 */
/* at Thu Oct 11 00:53:56 2001
 */
/* Compiler settings for D:\util\java\com-bridge\cas\jeus-services\JeusServices.idl:
    Os (OptLev=s), W1, Zp8, env=Win32, ms_ext, c_ext
    error checks: allocation ref bounds_check enum stub_data 
*/
//@@MIDL_FILE_HEADING(  )
#ifdef __cplusplus
extern "C"{
#endif 


#ifndef __IID_DEFINED__
#define __IID_DEFINED__

typedef struct _IID
{
    unsigned long x;
    unsigned short s1;
    unsigned short s2;
    unsigned char  c[8];
} IID;

#endif // __IID_DEFINED__

#ifndef CLSID_DEFINED
#define CLSID_DEFINED
typedef IID CLSID;
#endif // CLSID_DEFINED

const IID IID_IJeusServices = {0x422801D8,0x9B42,0x49f9,{0xBE,0x23,0x01,0xB3,0x5C,0xC1,0x3C,0xB9}};


const IID LIBID_ComBridgeJeusServices = {0xE8C2EDEB,0xE251,0x4e03,{0x8D,0xF5,0x02,0xEE,0xCF,0x13,0x6E,0xD0}};


const CLSID CLSID_JeusServices = {0x9478E828,0x10AF,0x487d,{0xAA,0xB0,0x25,0x80,0x35,0x7B,0x0E,0x02}};


#ifdef __cplusplus
}
#endif

