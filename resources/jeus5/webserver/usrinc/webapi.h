
/* ------------------------ usrinc/wbapi.h -------------------- */
/*                                                              */
/*              Copyright (c) 2000 Tmax Soft Co., Ltd           */
/*                   All Rights Reserved                        */
/*                                                              */
/* ------------------------------------------------------------ */

#ifndef _WEBTOB_WBAPI_H
#define _WEBTOB_WBAPI_H

#include <sys/types.h>
#include <usrinc/atmi.h>
#ifdef _WIN32
#include <winsock2.h>
#else
#include <sys/socket.h>
#define __cdecl
#endif

#ifndef SVC_NAME_SIZE
#define SVC_NAME_SIZE   16
#endif

#define WBFAIL		0x0001	/* [rollback +] internal server error */
#define WBSUCCESS	0x0002	/* [commit +] user-defined page */
#define WBEXIT	        0x0004	/* abnormal server exit */
#define WBDOWN		0x0008	/* normal server down */
#define WBERROR		0x0010	/* [rollback +] user-defined page */

/* ----- HTTP Status Codes ---- */
#define HTTP_CONTINUE                      100
#define HTTP_SWITCHING_PROTOCOLS           101
#define HTTP_OK                            200
#define HTTP_CREATED                       201
#define HTTP_NO_CONTENT                    204
#define HTTP_PARTIAL_CONTENT               206
#define HTTP_MOVED_TEMPORARILY             302
#define HTTP_REDIRECT                      HTTP_MOVED_TEMPORARILY
#define HTTP_NOT_MODIFIED                  304
#define HTTP_BAD_REQUEST                   400
#define HTTP_UNAUTHORIZED                  401
#define HTTP_FORBIDDEN                     403
#define HTTP_NOT_FOUND                     404
#define HTTP_METHOD_NOT_ALLOWED            405
#define HTTP_PROXY_AUTHENTICATION_REQUIRED 407
#define HTTP_CONFLICT                      409
#define HTTP_LENGTH_REQUIRED               411
#define HTTP_PRECONDITION_FAILED           412
#define HTTP_REQUEST_ENTITY_TOO_LARGE      413
#define HTTP_REQUEST_URI_TOO_LARGE         414
#define HTTP_INTERNAL_SERVER_ERROR         500
#define HTTP_NOT_IMPLEMENTED               501
#define HTTP_VERSION_NOT_SUPPORTED         505

/* --- for compatability with Webtob/1.0 --- */
#define wbgethdr(wbsvc, key)     wbGetHdr(wbsvc, key)
#define wbgetdata(wbsvc, key)    wbGetData(wbsvc, key)
#define wbgetnthkey(wbsvc, nth)  wbGetNthKey(wbsvc, nth)
#define wbgetnthdata(wbsvc, nth) wbGetNthData(wbsvc, nth)
#define wbgetdatacnt(wbsvc, nth) wbGetDataCount(wbsvc, nth)
#define wbgetval(wbsvc, key, nth) wbGetValue(wbsvc, key, nth)
#define wbkeyoccur(wbsvc, key)   wbKeyOccur(wbsvc, key)
#define wbgetenv(wbsvc, key)     wbGetEnv(wbsvc, key)

#define wbputhdr(wbsvc, key, value)  wbPutHdr(wbsvc, key, value)
#define wbputstr(wbsvc, value)  wbPutStr(wbsvc, value)
#define wbput(wbsvc, value, len)  wbPut(wbsvc, value, len)

#define wbreturn(wbsvc, rval)    wbReturn(wbsvc, rval)

#define wbPutProtocolStatus(wbsvc, sc, sm)  wbSetStatus(wbsvc, sc, sm)

struct wbsvcinfo {
  char name[SVC_NAME_SIZE];
  int  method;
  int  protono;
  int  flags;
  int  len;
  char *uri;
  char *data;
  void *hthcp;
};
typedef struct wbsvcinfo WBSVCINFO;

typedef struct {
  char   *name;
  char   *value;
  char   *domain;
  char   *path;
  char	 *comment;
  int    maxage;
  int	 version;
  int	 secure;
} cookie_t;

typedef struct session_s SESSION;

#if defined (__cplusplus)
extern "C" {
#endif

/* ------------------ INIT/DONE API ------------------ */
#ifdef _WIN32
__declspec(dllexport) int __cdecl wbSvrInit(int argc, char *argv[]);
__declspec(dllexport) int __cdecl wbSvrDone(void);
#else
int __cdecl wbSvrInit(int argc, char *argv[]);
int __cdecl wbSvrDone(void);
#endif

/* ------------------ ALLOC API ------------------ */
void *__cdecl wbMalloc(WBSVCINFO *wbsvc, int size);
int __cdecl wbFree(WBSVCINFO *wbsvc, void *ptr);

/* ------------------ GET API ------------------- */
#define wbGetAuthType(wbsvc)	    wbGetEnv(wbsvc, "AUTH_TYPE")
#define wbGetContentLength(wbsvc)   wbGetEnv(wbsvc, "CONTENT_LENGTH")
#define wbGetContentType(wbsvc)	    wbGetEnv(wbsvc, "CONTENT_TYPE")
#define wbGetDocumentRoot(wbsvc)    wbGetEnv(wbsvc, "DOCUMENT_ROOT")
#define wbGetMethod(wbsvc)	    wbGetEnv(wbsvc, "REQUEST_METHOD")
#define wbGetParsedURI(wbsvc)	    wbGetEnv(wbsvc, "PARSED_URI")
#define wbGetPathInfo(wbsvc)	    wbGetEnv(wbsvc, "PATH_INFO")
#define wbGetPathTranslated(wbsvc)  wbGetEnv(wbsvc, "PATH_TRANSLATED")
#define wbGetProtocol(wbsvc)	    wbGetEnv(wbsvc, "SERVER_PROTOCOL")
#define wbGetQueryString(wbsvc)	    wbGetEnv(wbsvc, "QUERY_STRING")
#define wbGetRemoteAddr(wbsvc)	    wbGetEnv(wbsvc, "REMOTE_ADDR")
#define wbGetRemoteHost(wbsvc)	    wbGetEnv(wbsvc, "REMOTE_HOST")
#define wbGetRemoteIdent(wbsvc)	    wbGetEnv(wbsvc, "REMOTE_IDENT")
#define wbGetRemoteUser(wbsvc)	    wbGetEnv(wbsvc, "REMOTE_USER")
#define wbGetRequestURI(wbsvc)	    wbGetEnv(wbsvc, "REQUEST_URI")
#define wbGetScheme(wbsvc)	    wbGetEnv(wbsvc, "REQUEST_SCHEME")
#define wbGetScriptFilename(wbsvc)  wbGetEnv(wbsvc, "SCRIPT_FILENAME")
#define wbGetScriptName(wbsvc)	    wbGetEnv(wbsvc, "SCRIPT_NAME")
#define wbGetServerName(wbsvc)	    wbGetEnv(wbsvc, "SERVER_NAME")
#define wbGetServerPort(wbsvc)	    wbGetEnv(wbsvc, "SERVER_PORT")
#define wbGetServerSoftware(wbsvc)  wbGetEnv(wbsvc, "SERVER_SOFTWARE")
#define wbGetTranslatedURI(wbsvc)   wbGetEnv(wbsvc, "TRANSLATED_URI")
int __cdecl wbGetAttr(WBSVCINFO *wbsvc, const char *name, void **data, long *len);
char *__cdecl wbGetData(WBSVCINFO *wbsvc, char *name);
int __cdecl wbGetDataCount(WBSVCINFO *wbsvc);
long __cdecl wbGetDateHdr(WBSVCINFO *wbsvc, char *name);
char *__cdecl wbGetEnv(WBSVCINFO *wbsvc, char *name);
long __cdecl wbGetFileLen(WBSVCINFO *wbsvc, char *name);  
char *__cdecl wbGetFileName(WBSVCINFO *wbsvc, char *name);
char *__cdecl wbGetHdr(WBSVCINFO *wbsvc, char *name);
int __cdecl wbGetHdrCount(WBSVCINFO *wbsvc);
int __cdecl wbGetIntHdr(WBSVCINFO *wbsvc, char *name);
char *__cdecl wbGetNthData(WBSVCINFO *wbsvc, int nth);
char *__cdecl wbGetNthHdr(WBSVCINFO *wbsvc, int nth);
char *__cdecl wbGetNthKey(WBSVCINFO *wbsvc, int nth);
char *__cdecl wbGetReqLine(WBSVCINFO *wbsvc);
char *__cdecl wbGetRequestURL(WBSVCINFO *wbsvc);
char *__cdecl wbGetValue(WBSVCINFO *wbsvc, char *name, int nth);
int __cdecl wbKeyOccur(WBSVCINFO *wbsvc, char *name);

/* ------------------ PUT API ------------------- */
int __cdecl wbPrint(WBSVCINFO *wbsvc, const char *fmt, ...);
int __cdecl wbprint(WBSVCINFO *wbsvc, const char *fmt, ...); /* for Webtob/1.0 */
int __cdecl wbPut(WBSVCINFO *wbsvc, char *value, int len);
int __cdecl wbPutFile(WBSVCINFO *wbsvc, char *path);
int __cdecl wbPutHdr(WBSVCINFO *wbsvc, char *name, char *value);
int __cdecl wbPutIntHdr(WBSVCINFO *wbsvc, char *name, int ivalue);
int __cdecl wbPutPartialFile(WBSVCINFO *wbsvc, char *path, int offset, int sz);
int __cdecl wbPutStr(WBSVCINFO *wbsvc, char *value);

/* ------------------ SET API ------------------- */
int __cdecl wbSetAttr(WBSVCINFO *wbsvc, const char *name, void *data, long len);
int __cdecl wbSetHdr(WBSVCINFO *wbsvc, char *name, char *value);
int __cdecl wbSetStatus(WBSVCINFO *wbsvc, int status, char *status_msg);

/* ------------------ REMOVE API ------------------- */
int __cdecl wbRemoveAttr(WBSVCINFO *wbsvc, const char *name);

/* ------------------ SEND API ------------------- */
int __cdecl wbFlush(WBSVCINFO *wbsvc);
int __cdecl wbSendError(WBSVCINFO *wbsvc, int status, char *msg);
int __cdecl wbSendRedirect(WBSVCINFO *wbsvc, char *location);

/* ------------------ PROGRAM CONTROL API ------------------- */
void __cdecl wbForward(WBSVCINFO *wbsvc, char *url, void *skbuf);
int __cdecl wbInclude(WBSVCINFO *wbsvc, char *url, void *skbuf);
void __cdecl wbReturn(WBSVCINFO *wbsvc, int rval);

/* ------------------ COOKIE API ------------------ */
cookie_t *__cdecl wbCreateCookie(WBSVCINFO *wbsvc, char *name, char *value);
cookie_t *__cdecl wbGetCookie(WBSVCINFO *wbsvc, char *name);
int __cdecl wbPutCookie(WBSVCINFO *wbsvc, cookie_t *cookie);
char *__cdecl wbCookieGetDomain(WBSVCINFO *wbsvc, cookie_t *cookie);
char *__cdecl wbCookieGetName(WBSVCINFO *wbsvc, cookie_t *cookie);
char *__cdecl wbCookieGetPath(WBSVCINFO *wbsvc, cookie_t *cookie);
char *__cdecl wbCookieGetValue(WBSVCINFO *wbsvc, cookie_t *cookie);
int __cdecl wbCookieGetVersion(WBSVCINFO *wbsvc, cookie_t *cookie);
int __cdecl wbCookieSetComment(WBSVCINFO *wbsvc, cookie_t *cookie, char *comment);
int __cdecl wbCookieSetDomain(WBSVCINFO *wbsvc, cookie_t *cookie, char *domain);
int __cdecl wbCookieSetMaxAge(WBSVCINFO *wbsvc, cookie_t *cookie, int maxage);
int __cdecl wbCookieSetPath(WBSVCINFO *wbsvc, cookie_t *cookie, char *path);
int __cdecl wbCookieSetSecure(WBSVCINFO *wbsvc, cookie_t *cookie, int secure);

int __cdecl wbCookieSetValue(WBSVCINFO *wbsvc, cookie_t *cookie, char *value);
int __cdecl wbCookieSetVersion(WBSVCINFO *wbsvc, cookie_t *cookie, int version);

/* ------------------ SESSION API ------------------ */
char *__cdecl wbGetRequestedSessionId(WBSVCINFO *wbsvc);
SESSION *__cdecl wbGetSession(WBSVCINFO *wbsvc);
int __cdecl wbIsRequestedSessionIdValid(WBSVCINFO *wbsvc);
long __cdecl wbSessionGetCreationTime(SESSION *session);
char *__cdecl wbSessionGetId(SESSION *session);
long __cdecl wbSessionGetLastAccessedTime(SESSION *session);
int __cdecl wbSessionGetMaxInactiveInterval(SESSION *session);
void *__cdecl  wbSessionGetValue(SESSION *session, char *name, int *len);
char **__cdecl wbSessionGetValueNames(SESSION *session, int *num);
int __cdecl wbSessionInvalidate(SESSION *session);
int __cdecl wbSessionIsNew(SESSION *session);
int __cdecl wbSessionRemoveValue(SESSION *session, char *name);
int __cdecl wbSessionSetMaxInactiveInterval(SESSION *session, int interval);
SESSION *__cdecl wbSessionSetValue(SESSION *session, char *name, 
				   void *value, int len);

/* ------------------ ETC API ------------------- */
int __cdecl wbGetErrno();
int __cdecl wbSaveFile(WBSVCINFO *wbsvc, char *name, char *path);
char *__cdecl wbURLencode(WBSVCINFO *wbsvc, const char *src, 
			  char *dest, int *dest_len);
char *__cdecl wbURLdecode(WBSVCINFO *wbsvc, const char *src, 
			  char *dest, int *dest_len);

#if defined (__cplusplus)
}
#endif

#endif       /* end of _WEBTOB_WBAPI_H  */
