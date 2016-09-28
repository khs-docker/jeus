
/* ------------------------ usrinc/usignal.h ------------------ */
/*								*/
/*              Copyright (c) 2000 Tmax Soft Co., Ltd		*/
/*                   All Rights Reserved  			*/
/*								*/
/* ------------------------------------------------------------ */

#ifndef _WEBTOB_USIGNAL_H
#define _WEBTOB_USIGNAL_H

#ifndef _WIN32
#define __cdecl
#endif

#define WEBTOB_DEFER_GET  0
#define WEBTOB_DEFER_SET  1
#define WEBTOB_DEFER_INC  2

#if defined (__cplusplus)
extern "C" {
#endif

typedef void __cdecl Sigfunc(int);

int __cdecl _webtob_signal_control();
int __cdecl _webtob_defer_sigs(int method, int value);
Sigfunc *__cdecl _webtob_signal(int signo, Sigfunc *func);

/*
   Following macros are provided for compatibility.
 */
#define UDEFERSIGS()	_webtob_defer_sigs(WEBTOB_DEFER_INC, 1)
#define URESUMESIGS()	_webtob_defer_sigs(WEBTOB_DEFER_INC, -1)
#define USDEFERLEVEL(level)	_webtob_defer_sigs(WEBTOB_DEFER_SET, level)
#define UGDEFERLEVEL(level)	_webtob_defer_sigs(WEBTOB_DEFER_GET, 0)
#define UENSURESIGS()	_webtob_defer_sigs(WEBTOB_DEFER_SET, 0)

#define Usiginit()	_webtob_signal_control()
#define Usignal(signo, func)	_webtob_signal(signo, func)
#define USIGTYP		void

#if defined (__cplusplus)
}
#endif

#endif       /* end of _WEBTOB_USIGNAL_H  */
