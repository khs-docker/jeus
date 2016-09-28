
/* ------------------------ usrinc/wintypes.h ----------------- */
/*                                                              */
/*              Copyright (c) 2000 Tmax Soft Co., Ltd           */
/*                   All Rights Reserved                        */
/*                                                              */
/* ------------------------------------------------------------ */

#ifndef _WEBTOB_WINTYPES_H
#define _WEBTOB_WINTYPES_H

/*!
 * \file
 * \brief Windows data types

   This file is basically for additions and alterations to the
   standard ISAPI header files.  A lot of the stuff is for defining
   Windows types on Unix. */

#ifndef _WIN32
/* define windows types on Unix  */
typedef int   BOOL;
typedef char* LPSTR;
typedef const char * LPCSTR;
typedef void* LPVOID;
typedef void* PVOID;
typedef void  VOID;
typedef int*  LPDWORD;
typedef int   DWORD;
typedef char  CHAR;
typedef unsigned char* LPBYTE;
typedef short WORD;
typedef char  BYTE;
typedef long  LONG;
typedef void* HANDLE;

#define TRUE  1
#define FALSE 0

#define WINAPI

int GetLastError();
int SetLastError();

#define NO_ERROR		    0
#define ERROR_INVALID_PARAMETER	    EINVAL
#define ERROR_INVALID_INDEX	    EINVAL
#define ERROR_INSUFFICIENT_BUFFER   ENOMEM
#define ERROR_MORE_DATA		    ENOMEM
#define ERROR_NO_DATA		    ENOENT

#define MAKEWORD(a, b) ((WORD) (((BYTE) (a)) | ((WORD)  ((BYTE) (b))) << 8))
#define MAKELONG(a, b) ((LONG) (((WORD) (a)) | ((DWORD) ((WORD) (b))) << 16))

#else
#include <windows.h>
#endif /* !_WIN32 */


typedef void* HCONN;

#ifndef HINSTANCE
#define HINSTANCE void*
#endif

#endif	/* _WEBTOB_WINTYPES_H */
