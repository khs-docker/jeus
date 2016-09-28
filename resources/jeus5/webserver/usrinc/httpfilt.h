
/* ------------------------ usrinc/wbapi.h -------------------- */
/*                                                              */
/*              Copyright (c) 2000 Tmax Soft Co., Ltd           */
/*                   All Rights Reserved                        */
/*                                                              */
/* ------------------------------------------------------------ */

#ifndef _WEBTOB_HTTPFILT_H
#define _WEBTOB_HTTPFILT_H

/*!
 * \file
 * \brief ISAPI Filter interface, v4.0

   This header file contains all the constants and types needed to write
   ISAPI filters.  This file will be given to API developers and is also
   included in the server source code.

   Note: this file should contain only ANSI C, no C++ comments! */

#include "wintypes.h"

#define HTTP_FILTER_MAJOR       4
#define HTTP_FILTER_MINOR       0
#define HTTP_FILTER_REVISION  MAKELONG( HTTP_FILTER_MINOR, HTTP_FILTER_MAJOR );
/* HTTP_FILTER_REVISION requres the ; at the end for compatability with MS */

/* powers of 2, plus 1 (in each case) for the '\0' on the end ... */
#define SF_MAX_USERNAME        257
#define SF_MAX_PASSWORD        257
#define SF_MAX_AUTH_TYPE        33
#define SF_MAX_FILTER_DESC_LEN 257

typedef enum SF_REQ_TYPE {
   SF_REQ_SEND_RESPONSE_HEADER = 0,
   SF_REQ_ADD_HEADERS_ON_DENIAL,
   SF_REQ_SET_NEXT_READ_SIZE,
   SF_REQ_SET_PROXY_INFO,
   SF_REQ_GET_CONNID,
   SF_REQ_SET_CERTIFICATE_INFO,
   SF_REQ_GET_PROPERTY,
   SF_REQ_NORMALISE_URL,
   SF_REQ_DISABLE_NOTIFICATIONS,

   /* WebtoB-specific extensions */
   SF_REQ_GET_NOTES = 3000,
   SF_REQ_SET_NOTES,
   SF_REQ_ADD_NOTES,
   SF_REQ_READ_CLIENT,
   SF_REQ_SET_SERVER_VARIABLE
} SF_REQUEST_TYPE;

typedef enum SF_PROPERTY_IIS {
   SF_PROPERTY_SSL_CTXT,
   SF_PROPERTY_INSTANCE_NUM_ID
} SF_PROP_IIS;

typedef enum SF_STATUS_TYPE {
   /* compatibility warning: earlier (2.0) versions of this .h file said:

        #define SF_STATUS_TYPE  0x8000000

      which might present problems for some code compiled against it.  Use the
      (WebtoB) SF_STATUS type name instead of (MS) `enum SF_STATUS_TYPE' to 
      be on the safe side; but note that contexts using it tend to treat 
      this type as DWORD regardless (for hysterical reasons). */

   SF_STATUS_REQ_FINISHED = 0x8000000,
   SF_STATUS_REQ_FINISHED_KEEP_CONN,
   SF_STATUS_REQ_NEXT_NOTIFICATION,
   SF_STATUS_REQ_HANDLED_NOTIFICATION,
   SF_STATUS_REQ_ERROR,
   SF_STATUS_REQ_READ_NEXT

} SF_STATUS;

typedef struct _HTTP_FILTER_CONTEXT HTTP_FILTER_CONTEXT, *PHTTP_FILTER_CONTEXT;

/*! \brief ISAPI defined structure */
struct _HTTP_FILTER_CONTEXT {
   DWORD    cbSize;          /* the size of this structure */
   DWORD    Revision;        /* the revision number of this structure */
   PVOID    ServerContext;   /* reserved for server use */
   DWORD    ulReserved;      /* reserved for server use */
   BOOL     fIsSecurePort;   /* True if the connection is on a secure port */
   PVOID    pFilterContext;  /* a pointer to information the filter wants
                                to associate with the request */

   BOOL (WINAPI * GetServerVariable)     (PHTTP_FILTER_CONTEXT pfc,
					  LPSTR      lpszVariableName,
					  LPVOID     lpvBuffer,
					  LPDWORD    lpdwSize);
   BOOL (WINAPI * AddResponseHeaders)    (PHTTP_FILTER_CONTEXT pfc,
                                          LPSTR      lpszHeaders,
                                          DWORD      dwReserved);
   BOOL (WINAPI * WriteClient)           (PHTTP_FILTER_CONTEXT pfc,
                                          LPVOID     Buffer,
                                          LPDWORD    lpdwBytes,
                                          DWORD      dwReserved);
   LPVOID (WINAPI * AllocMem)            (PHTTP_FILTER_CONTEXT pfc,
                                          DWORD      cbSize,
                                          DWORD      dwReserved);
   BOOL (WINAPI * ServerSupportFunction) (PHTTP_FILTER_CONTEXT pfc,
                                          DWORD      sfReq,
                                          LPVOID     pData,
                                          LPDWORD    ul1,
                                          LPDWORD    ul2);
};

/*! \brief ISAPI defined structure */
typedef struct _HTTP_FILTER_RAW_DATA
{
   PVOID pvInData;      /* data buffer */
   DWORD cbInData;      /* number of valid bytes in buffer */
   DWORD cbInBuffer;    /* total size of buffer */
   DWORD dwReserved;
} HTTP_FILTER_RAW_DATA, *PHTTP_FILTER_RAW_DATA;

/*! \brief ISAPI defined structure */
typedef struct _HTTP_FILTER_PREPROC_HEADERS
{
   BOOL    (WINAPI * GetHeader) (PHTTP_FILTER_CONTEXT pfc,
				 LPSTR    lpszName,
				 LPVOID   lpvBuffer,
				 LPDWORD  lpdwSize);
   BOOL    (WINAPI * SetHeader) (PHTTP_FILTER_CONTEXT pfc,
				 LPSTR    lpszName,
				 LPSTR    lpszValue);
   BOOL    (WINAPI * AddHeader) (PHTTP_FILTER_CONTEXT pfc,
				 LPSTR    lpszName,
				 LPSTR    lpszValue);
   DWORD    HttpStatus; /* For SEND_RESPONSE */ 
   DWORD    dwReserved;
} HTTP_FILTER_PREPROC_HEADERS, *PHTTP_FILTER_PREPROC_HEADERS,
   HTTP_FILTER_SEND_RESPONSE, *PHTTP_FILTER_SEND_RESPONSE;

/*! \brief ISAPI defined structure */
typedef struct _HTTP_FILTER_AUTHENT
{
    CHAR *    pszUser;
    DWORD     cbUserBuff;
    CHAR *    pszPassword;
    DWORD     cbPasswordBuff;
} HTTP_FILTER_AUTHENT, *PHTTP_FILTER_AUTHENT;

/*! \brief ISAPI defined structure */
typedef struct _HTTP_FILTER_URL_MAP
{
    const CHAR *    pszURL;
    CHAR *          pszPhysicalPath;
    DWORD           cbPathBuff;
} HTTP_FILTER_URL_MAP, *PHTTP_FILTER_URL_MAP;

#define SF_DENIED_LOGON         0x00000001
#define SF_DENIED_RESOURCE      0x00000002
#define SF_DENIED_FILTER        0x00000004
#define SF_DENIED_APPLICATION   0x00000008
#define SF_DENIED_BY_CONFIG     0x00010000

/*! \brief ISAPI defined structure */
typedef struct _HTTP_FILTER_ACCESS_DENIED
{
   const CHAR * pszURL;           /* Requesting URL */
   const CHAR * pszPhysicalPath;  /* Physical path of resource */
   DWORD        dwReason;         /* Bitfield of SF_DENIED_* flags */
} HTTP_FILTER_ACCESS_DENIED, *PHTTP_FILTER_ACCESS_DENIED;

/*! \brief ISAPI defined structure */
typedef struct _HTTP_FILTER_LOG
{
   const CHAR  *pszClientHostName;
   const CHAR  *pszClientUserName;
   const CHAR  *pszServerName;
   const CHAR  *pszOperation;
   const CHAR  *pszTarget;
   const CHAR  *pszParameters;
   DWORD        dwHttpStatus;
   DWORD        dwWin32Status;
   /* Added in ISAPI/4.0 */
   DWORD        dwBytesSent;
   DWORD        dwBytesRecvd;
   DWORD        msTimeForProcessing;
} HTTP_FILTER_LOG, *PHTTP_FILTER_LOG;

#define SF_NOTIFY_SECURE_PORT           0x00000001
#define SF_NOTIFY_NONSECURE_PORT        0x00000002

/* #define SF_NOTIFY_AUTH_COMPLETE ... new in IIS 5.0 */
#define SF_NOTIFY_SEND_RESPONSE         0x00000040
#define SF_NOTIFY_END_OF_REQUEST        0x00000080
#define SF_NOTIFY_END_OF_NET_SESSION    0x00000100
#define SF_NOTIFY_LOG                   0x00000200
#define SF_NOTIFY_SEND_RAW_DATA         0x00000400
#define SF_NOTIFY_ACCESS_DENIED         0x00000800
#define SF_NOTIFY_URL_MAP               0x00001000
#define SF_NOTIFY_AUTHENTICATION        0x00002000
#define SF_NOTIFY_PREPROC_HEADERS       0x00004000
#define SF_NOTIFY_READ_RAW_DATA         0x00008000
/* those are in bit order: see man 3 GetFilterVersion for event order */

#define SF_NOTIFY_ORDER_LOW             0x00020000
#define SF_NOTIFY_ORDER_MEDIUM          0x00040000
#define SF_NOTIFY_ORDER_HIGH            0x00080000
#define SF_NOTIFY_ORDER_DEFAULT         SF_NOTIFY_ORDER_LOW

#define SF_NOTIFY_ORDER_MASK          ( SF_NOTIFY_ORDER_HIGH | \
                                        SF_NOTIFY_ORDER_MEDIUM | \
                                        SF_NOTIFY_ORDER_LOW )

/*! \brief ISAPI defined structure */
typedef struct _HTTP_FILTER_VERSION
{
    DWORD     dwServerFilterVersion;
    DWORD     dwFilterVersion;
    CHAR      lpszFilterDesc[SF_MAX_FILTER_DESC_LEN+1];
    DWORD     dwFlags;
} HTTP_FILTER_VERSION, *PHTTP_FILTER_VERSION;

extern BOOL WINAPI
GetFilterVersion( HTTP_FILTER_VERSION *pVer );
extern /* SF_STATUS */ DWORD WINAPI
HttpFilterProc( HTTP_FILTER_CONTEXT *pfc,
                DWORD NotificationType,
                VOID *pvNotification );
extern BOOL WINAPI
TerminateFilter( DWORD dwFlags );

#endif /* _WEBTOB_HTTPFILT_H */
