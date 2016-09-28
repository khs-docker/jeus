/*
 * $Id: ExitAction.h,v 1.1 2001/03/31 00:38:20 dkohlert Exp $
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


#ifndef __EXIT_ACTION_H__
#define __EXIT_ACTION_H__


//#include "ObjRef.h"


//namespace EjbUtils
//{


// ExitAction
//
template <typename ObjectType>
class ExitAction
{
public:
    typedef ObjectType object_type;
    typedef void (ObjectType::* object_func)( void );

private:
    object_type * obj;
    object_func func;

public:
    ExitAction( object_type * o, object_func f )
    {
        Attach( o, f );
    }

    ~ExitAction( void )
    {
        if ( obj != NULL && func != NULL )
        {
            (obj->*func)();
        }
    }

    void Attach( object_type * o, object_func f )
    {
        obj = o;
        func = f;
    }

    void Detach( void )
    {
        obj = NULL;
        func = NULL;
    }
};


//}


#endif
