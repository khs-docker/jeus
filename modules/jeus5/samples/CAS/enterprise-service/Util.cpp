/*
 * $Id: Util.cpp,v 1.1 2001/03/31 00:38:21 dkohlert Exp $
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

#include "stdafx.h"
#include "Util.h"

#include <sstream>
#include <iomanip>


// COM Utilities
//

_COM_SMARTPTR_TYPEDEF(IErrorInfo, __uuidof(IErrorInfo));


void __stdcall j2eecas_com_error_handler(HRESULT hr, IUnknown* pUnk, REFIID iid) throw(_com_error)
{
    _com_raise_error(hr);
}


bool IsErrorInfoSet( void )
{
    IErrorInfoPtr errorInfo;
    HRESULT hr = ::GetErrorInfo(0, &errorInfo);
    return (hr == S_OK);
}


void ReportInvalidArgument( const CLSID & clsid, 
                            const IID & iid,
                            const wchar_t * methodName )
{
    std::wstringstream s;
    s << L"An invalid argument was passed to " << methodName;
    ReportError( clsid, iid, s.str().c_str(), E_INVALIDARG );
}


void ReportOutOfMemory( const CLSID & clsid, 
                        const IID & iid,
                        const wchar_t * methodName )
{
    std::wstringstream s;
    s << L"Ran out of memory while executing " << methodName;
    ReportError( clsid, iid, s.str().c_str(), E_OUTOFMEMORY );
}


void ReportUnspecifiedFailure( const CLSID & clsid, 
                                const IID & iid, 
                                const wchar_t * methodName, 
                                HRESULT hr )
{
    std::wstringstream s;
    s << L"An unspecified failure occurred while executing " << methodName <<
        L" (" << std::hex << std::setfill(L'0') << std::setw(8) << hr << L")";
    ReportError( clsid, iid, s.str().c_str(), hr );
}


void ReportError( const CLSID & clsid, 
                    const IID & iid, 
                    const wchar_t * msg, 
                    HRESULT hr )
{
    IErrorInfoPtr errorInfo;
    bool foundErrInfo = false;

    ::GetErrorInfo(0, &errorInfo);

    if ( errorInfo != NULL )
    {
        BSTR desc = NULL;
        errorInfo->GetDescription( &desc );

        if ( desc != NULL )
        {
            AtlReportError( clsid, desc, iid, hr );
            ::SysFreeString( desc );
            foundErrInfo = true;
        }
    }

    if ( ! foundErrInfo )
    {
        AtlReportError( clsid, msg, iid, hr );
    }
}
