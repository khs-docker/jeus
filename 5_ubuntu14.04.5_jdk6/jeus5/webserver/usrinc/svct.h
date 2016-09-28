
/* --------------------- usrinc/svct.h ------------------------ */
/*                                                              */
/*              Copyright (c) 2000 Tmax Soft Co., Ltd           */
/*                   All Rights Reserved                        */
/*                                                              */
/* ------------------------------------------------------------ */

#ifndef WEBTOB_SVCT_H
#define WEBTOB_SVCT_H

#ifndef _WIN32
#define __cdecl
#endif

#ifndef NULL
#define NULL    0L
#endif

/* ----- svc registeration type ----- */
#define SVC_REG_STATIC          0
#define SVC_REG_UNKNOWN         -1
#define SVC_REG_DYNAMIC         -100

typedef struct {	/* header from hth to server */
  char  *name;
#ifdef _WIN32
  void  (__cdecl *func) (void *);
#else
  void  (* func) (void *); 
#endif
  int   svci;
} _svc_t;

#ifdef _WIN32
/*
    Internal functions: ONLY BE CALLED FROM AUTOMATICALLY
    GENERATED STUB FILES. DO NOT DIRECTLY CALL THESE FUNCTIONS.
 */
int __cdecl _wbRegTab(int, _svc_t *, int, void *);
int __cdecl _wbMain(int, char *[]);
#endif

#endif
