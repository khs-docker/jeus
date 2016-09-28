/*
 * $Id: Util.h,v 1.1 2001/03/31 00:38:21 dkohlert Exp $
 *
 * Copyright (c) 1999 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 *
 * CopyrightVersion ejb 1.0
 *
 * @author Ken Rodham
 */

#ifndef __ENTERPRISESERVICES_UTIL_H_
#define __ENTERPRISESERVICES_UTIL_H_


#include <comdef.h>

#include "ExitAction.h"


// COM Utilities
//
bool IsErrorInfoSet( void );

void ReportInvalidArgument( const CLSID & clsid, 
                            const IID & iid,
                            const wchar_t * methodName );

void ReportOutOfMemory( const CLSID & clsid, 
                        const IID & iid,
                        const wchar_t * methodName );

void ReportUnspecifiedFailure( const CLSID & clsid, 
                                const IID & iid, 
                                const wchar_t * methodName, 
                                HRESULT hr = E_FAIL );

void ReportError( const CLSID & clsid, 
                    const IID & iid, 
                    const wchar_t * msg, 
                    HRESULT hr );

#define COM_METHOD_PROLOG( className, classID, interfaceID, methodName ) \
REFGUID _classID = classID; \
REFGUID _interfaceID = interfaceID; \
const wchar_t * _methodName = L#methodName; \
try \
{ \
    SetErrorInfo( 0, NULL ); \
    Lock(); \
    ExitAction<className> _unlock( this, Unlock );



#define COM_METHOD_EPILOG() \
} \
catch ( _com_error & e ) \
{ \
    ReportUnspecifiedFailure(_classID, _interfaceID, _methodName, e.Error()); \
    return e.Error(); \
} \
catch ( ... ) \
{ \
    ReportUnspecifiedFailure(_classID, _interfaceID, _methodName); \
    return E_FAIL; \
}


#endif // __ENTERPRISESERVICES_UTIL_H_

