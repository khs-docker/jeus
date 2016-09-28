/* this file contains the actual definitions of */
/* the IIDs and CLSIDs */

/* link this file in with the server and any clients */


/* File created by MIDL compiler version 5.01.0164 */
/* at Mon Dec 02 21:47:31 2002
 */
/* Compiler settings for Math.idl:
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

const IID IID_IArithmetic = {0x9DA6E3FD,0x0A77,0x489A,{0x82,0xD9,0xFA,0xCD,0xB2,0x94,0xA4,0xE5}};


const IID LIBID_MATHLib = {0xE318B006,0xA72E,0x429E,{0x92,0xBB,0x4C,0x59,0xCD,0x2D,0x53,0xB9}};


const CLSID CLSID_Arithmetic = {0x50354DC9,0xE6FF,0x4A88,{0x9C,0xB7,0x8C,0x1C,0x4B,0xE1,0xE5,0xBE}};


#ifdef __cplusplus
}
#endif

