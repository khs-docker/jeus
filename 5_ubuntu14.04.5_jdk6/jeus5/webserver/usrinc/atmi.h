
/* --------------------- usrinc/atmi.h ------------------------ */
/*                                                              */
/*              Copyright (c) 2000 Tmax Soft Co., Ltd           */
/*                   All Rights Reserved                        */
/*                                                              */
/* ------------------------------------------------------------ */

#ifndef _WEBTOB_ATMI_H
#define _WEBTOB_ATMI_H

#ifndef _WIN32
#define __cdecl
#endif

#ifdef _WIN32
#if defined(__cplusplus)
extern "C" {
#endif
/*
   Internal functions: ONLY BE CALLED FROM AUTOMATICALLY
   GENERATED STUB FILES. DO NOT DIRECTLY CALL THESE FUNCTIONS.
 */
int * __cdecl _wbget_tperrno_addr(void);
#ifdef _WEBTOB_KERNEL
extern int tperrno;
#else
#define tperrno	(*_wbget_tperrno_addr())
#endif

#if defined(__cplusplus)
}
#endif
#else
extern int tperrno;
#endif

#define TPEBADDESC	2
#define TPEBLOCK	3
#define TPEINVAL	4
#define TPELIMIT	5
#define TPENOENT	6
#define TPEOS	        7
#define TPEPROTO	9
#define TPESVCERR	10
#define TPESVCFAIL	11
#define TPESYSTEM	12
#define TPETIME		13
#define TPETRAN		14
#define TPGOTSIG	15
#define TPEITYPE	17
#define TPEOTYPE	18
#define TPEEVENT	22
#define TPEMATCH	23
#define TPENOREADY	24
#define TPESECURITY	25
#define TPEQFULL	26
#define TPEQPURGE	27
#define TPECLOSE	28
#define TPESVRDOWN	29
#define TPEPRESVC	30
#define TPEMAXNO	31
#define TPECCLOSE	32

#endif       /* end of _WEBTOB_ATMI_H  */
