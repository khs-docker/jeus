
/* ------------------------ usrinc/wbapi.h -------------------- */
/*                                                              */
/*              Copyright (c) 2000 Tmax Soft Co., Ltd           */
/*                   All Rights Reserved                        */
/*                                                              */
/* ------------------------------------------------------------ */

#ifndef _WEBTOB_HTTPEXT_H_
#define _WEBTOB_HTTPEXT_H_

/*!
 * \file
 * \brief ISAPI Extension interface, v4.0

   This header file contains all the constants and types needed to write
   ISAPI filters.  This file will be given to API developers and is also
   included in the server source code.

   Note: this file should contain only ANSI C, no C++ comments! */
#include "wintypes.h"

#ifndef MAX_PATH
# include <limits.h>
# ifndef PATH_MAX       /* _OSR5 */
#  include <sys/param.h>
#  define PATH_MAX PATHSIZE
# endif
# define MAX_PATH PATH_MAX
#endif /* MAX_PATH */

#ifdef __cplusplus
extern "C" {
#endif

#define   HSE_VERSION_MAJOR           4
#define   HSE_VERSION_MINOR           0
#define   HSE_LOG_BUFFER_LEN         80
#define   HSE_MAX_EXT_DLL_NAME_LEN  256

#define   HSE_VERSION     MAKELONG( HSE_VERSION_MINOR, HSE_VERSION_MAJOR )

/* the following are the status codes returned by the Extension .DLL */
/* typedef enum { ... */
#define   HSE_STATUS_SUCCESS	                1
#define   HSE_STATUS_SUCCESS_AND_KEEP_CONN	2
#define   HSE_STATUS_PENDING	                3
#define   HSE_STATUS_ERROR	                4
/* ... } HSE_STATUS_T; */

/* The following are the values to request services with the
   ServerSupportFunction.  Values from 0 to 1000 are reserved for
   future versions of the interface */

/* typedef enum { ... */
#define HSE_REQ_BASE                   	0
#define HSE_REQ_SEND_URL_REDIRECT_RESP	( HSE_REQ_BASE + 1 )
#define HSE_REQ_SEND_URL	        ( HSE_REQ_BASE + 2 )
#define HSE_REQ_SEND_RESPONSE_HEADER    ( HSE_REQ_BASE + 3 )
#define HSE_REQ_DONE_WITH_SESSION	( HSE_REQ_BASE + 4 )
#define HSE_REQ_END_RESERVED            1000

/*  These are Microsoft-specific extensions */
#define HSE_REQ_MAP_URL_TO_PATH         (HSE_REQ_END_RESERVED+1)
#define HSE_REQ_GET_SSPI_INFO           (HSE_REQ_END_RESERVED+2)
#define HSE_APPEND_LOG_PARAMETER        (HSE_REQ_END_RESERVED+3)
#define HSE_REQ_SEND_URL_EX             (HSE_REQ_END_RESERVED+4) /* not in MS .h */
#define HSE_REQ_IO_COMPLETION           (HSE_REQ_END_RESERVED+5)
#define HSE_REQ_TRANSMIT_FILE           (HSE_REQ_END_RESERVED+6)
#define HSE_REQ_REFRESH_ISAPI_ACL       (HSE_REQ_END_RESERVED+7)
#define HSE_REQ_IS_KEEP_CONN            (HSE_REQ_END_RESERVED+8) /* not in v2.0 */
#define HSE_REQ_ASYNC_READ_CLIENT       (HSE_REQ_END_RESERVED+10) /* not in v2.0 */
#define HSE_REQ_GET_IMPERSONATION_TOKEN (HSE_REQ_END_RESERVED+11) /* not in v2.0 */
#define HSE_REQ_MAP_URL_TO_PATH_EX      (HSE_REQ_END_RESERVED+12) /* not in v2.0 */
#define HSE_REQ_ABORTIVE_CLOSE          (HSE_REQ_END_RESERVED+14) /* not in v2.0 */
#define HSE_REQ_GET_CERT_INFO_EX        (HSE_REQ_END_RESERVED+15) /* not in v2.0 */
#define HSE_REQ_SEND_RESPONSE_HEADER_EX (HSE_REQ_END_RESERVED+16)
#define HSE_REQ_CLOSE_CONNECTION        (HSE_REQ_END_RESERVED+17) /* not in v2.0 */
#define HSE_REQ_IS_CONNECTED            (HSE_REQ_END_RESERVED+18) /* not in v2.0 */

/* ... } HSE_REQUEST_T; */

/* flags passed to TerminateExtension */
#define   HSE_TERM_ADVISORY_UNLOAD                   0x00000001
#define   HSE_TERM_MUST_UNLOAD                       0x00000002

/* flags for IO Functions, support for IO Funcs
   TF means ServerSupportFunction( HSE_REQ_TRANSMIT_FILE ) */

#define HSE_IO_SYNC                      0x00000001   /* for WriteClient */
#define HSE_IO_ASYNC                     0x00000002   /* for WriteClient/TF */
#define HSE_IO_DISCONNECT_AFTER_SEND     0x00000004   /* for TF */
#define HSE_IO_SEND_HEADERS              0x00000008   /* for TF */

/* ------------------------ ISAPI Extension types --------------------- */
/* HCONN is defined in wintypes.h as void* but is really an HTTP_FILTER_CONTEXT* */

/*! \brief passed to GetExtensionVersion */
typedef struct   _HSE_VERSION_INFO {
   DWORD  dwExtensionVersion;
   CHAR   lpszExtensionDesc[HSE_MAX_EXT_DLL_NAME_LEN];
} HSE_VERSION_INFO, *LPHSE_VERSION_INFO;

/*! \brief passed to extension procedure on a new request */
typedef struct _EXTENSION_CONTROL_BLOCK {
   DWORD     cbSize;                 /* Size of this struct. */
   DWORD     dwVersion;              /* Version info of this spec */
   HCONN     ConnID;                 /* Context number not to be modified! */
   DWORD     dwHttpStatusCode;       /* HTTP Status code */

   /* null terminated log info specific to this Extension DLL */
   CHAR lpszLogData[HSE_LOG_BUFFER_LEN];

   /* these LPCSTR fields (also ContentType) should be LPSTR ... */
   LPCSTR     lpszMethod;             /* REQUEST_METHOD */
   LPCSTR     lpszQueryString;        /* QUERY_STRING */
   LPCSTR     lpszPathInfo;           /* PATH_INFO */
   LPCSTR     lpszPathTranslated;     /* PATH_TRANSLATED */

   DWORD     cbTotalBytes;           /* Total bytes indicated from client */
   DWORD     cbAvailable;            /* Available number of bytes */
   LPBYTE    lpbData;                /* Pointer to cbAvailable bytes */

   LPCSTR     lpszContentType;        /* Content type of client data */

   BOOL (WINAPI * GetServerVariable) ( HCONN       hConn,
				       LPSTR       lpszVariableName,
				       LPVOID      lpvBuffer,
				       LPDWORD     lpdwSizeofBuffer );

   BOOL (WINAPI * WriteClient)  ( HCONN      ConnID,
				  LPVOID     Buffer,
				  LPDWORD    lpdwBytes,
				  DWORD      dwReserved );

   BOOL (WINAPI * ReadClient)  ( HCONN      ConnID,
				 LPVOID     lpvBuffer,
				 LPDWORD    lpdwSize );

   BOOL (WINAPI * ServerSupportFunction)( HCONN      hConn,
					  DWORD      dwHSERRequest,
					  LPVOID     lpvBuffer,
					  LPDWORD    lpdwSize,
					  LPDWORD    lpdwDataType );
} EXTENSION_CONTROL_BLOCK, *LPEXTENSION_CONTROL_BLOCK;

#define HSE_URL_FLAGS_READ              0x00000001
#define HSE_URL_FLAGS_WRITE             0x00000002
#define HSE_URL_FLAGS_EXECUTE           0x00000004
#define HSE_URL_FLAGS_SSL               0x00000008
#define HSE_URL_FLAGS_DONT_CACHE        0x00000010
#define HSE_URL_FLAGS_NEGO_CERT         0x00000020
#define HSE_URL_FLAGS_REQUIRE_CERT      0x00000040
#define HSE_URL_FLAGS_MAP_CERT          0x00000080
#define HSE_URL_FLAGS_SSL128            0x00000100
#define HSE_URL_FLAGS_SCRIPT            0x00000200
#define HSE_URL_FLAGS_MASK              0x000003ff

typedef struct _HSE_URL_MAPEX_INFO {
   CHAR         lpszPath[MAX_PATH]; /* Physical path root mapped to */
   DWORD        dwFlags;         /* HSE_URL_FLAGS associated with this URL path */
   DWORD        cchMatchingPath; /* Number of matching characters in physical path */
   DWORD        cchMatchingURL;  /* Number of matching characters in URL */

   DWORD        dwReserved1;
   DWORD        dwReserved2;
} HSE_URL_MAPEX_INFO, *LPHSE_URL_MAPEX_INFO;

typedef VOID
  (WINAPI * PFN_HSE_IO_COMPLETION)( EXTENSION_CONTROL_BLOCK * pECB,
                                    PVOID    pContext,
                                    DWORD    cbIO,
                                    DWORD    dwError );

/*!
   \brief ISAPI defined structure

   HSE_TF_INFO defines the type for HTTP SERVER EXTENSION support for
   ISAPI applications to send files using 'TransmitFile' or its equivalent.
   A pointer to this object shoudl be used with ServerSupportFunction()
   for HSE_REQ_TRANSMIT_FILE */

typedef struct _HSE_TF_INFO {
   /* Callback and context information
      the calllback function will be called when IO is completed.
      the context specified will be used during such as callback.

      These values (if non-NULL) will override the one set by calling
      ServerSupportFunction() with HSE_REQ_IO_COMPLETION.

      Note: In WebtoB Server, all async IO completed immediately, no
      callback routines will be called, callbacks should not be used.
      Any routine requiring a callback will return failure.
      Because of this, all data segments passed to write out should
      be valid for the life time of the connection (e.g. allocated in
      AllocMem memory).
      */

   PFN_HSE_IO_COMPLETION pfnHseIO;
   PVOID pContext;

   /* File handle */
   HANDLE hFile;

   /* HTTP header and status code
      These fields are used only if HSE_IO_SEND_HEADERS is present in
      dwFlags */
   LPCSTR pszStatusCode; /* HTTP status code, eg. "200 OK" */

   DWORD BytesToWrite;  /* special value of "0" means write entire file */
   DWORD Offset;        /* offset value within the file to start from */

   PVOID pHead;         /* Head buffer to be sent before file data */
   DWORD HeadLength;    /* header length */
   PVOID pTail;         /* Tail buffer to be sent after file data */
   DWORD TailLength;    /* Tail length */

   DWORD dwFlags;       /* includes HSE_IO_DISCONNECT_AFTER_SEND ... */

} HSE_TF_INFO, *LPHSE_TF_INFO;

/*! Used by the ServerSupportFunction HSE_REQ_SEND_RESPONSE_HEADER_EX. */

typedef struct _HSE_SEND_HEADER_EX_INFO {
   LPCSTR pszStatus; /* HTTP status code; for example "200 OK". */
   LPCSTR pszHeader; /* HTTP header. */
   DWORD cchStatus;  /* Number of characters in status code. */
   DWORD cchHeader;  /* Number of characters in header. */
   BOOL  fKeepConn;  /* Keep client connection alive ? */
} HSE_SEND_HEADER_EX_INFO, *LPHSE_SEND_HEADER_EX_INFO;

/* The three interface functions of the extension library: */

extern BOOL  WINAPI
GetExtensionVersion( HSE_VERSION_INFO *pVer );
extern /* HSE_STATUS_T */ DWORD WINAPI
HttpExtensionProc( EXTENSION_CONTROL_BLOCK *pECB );
extern BOOL  WINAPI
TerminateExtension( DWORD dwFlags );

#ifdef __cplusplus
}
#endif
#endif  /* _WEBTOB_HTTPEXT_H_ */
