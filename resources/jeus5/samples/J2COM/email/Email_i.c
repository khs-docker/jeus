/* this file contains the actual definitions of */
/* the IIDs and CLSIDs */

/* link this file in with the server and any clients */


/* File created by MIDL compiler version 5.01.0164 */
/* at Thu Dec 05 13:57:17 2002
 */
/* Compiler settings for D:\src\Email\Email.idl:
    Oicf (OptLev=i2), W1, Zp8, env=Win32, ms_ext, c_ext
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

const IID IID_InewMail = {0x2434BC8E,0x56C9,0x4B47,{0x98,0x84,0x70,0x33,0x00,0xA3,0xAB,0x27}};


const IID LIBID_EMAILLib = {0xF757774E,0xC679,0x4673,{0x91,0x6A,0x73,0xDD,0x9E,0xED,0x1F,0xE3}};


const CLSID CLSID_newMail = {0x16B17112,0xD1A1,0x4971,{0x93,0xCC,0x5D,0x42,0xD7,0x7F,0x95,0xF3}};


#ifdef __cplusplus
}
#endif

