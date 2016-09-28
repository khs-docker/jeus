/*
 * $Id: JeusService.cpp,v 1.2 2001/03/29 18:07:38 dkohlert Exp $
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
 * @author Doug Kohlert
 */

#include "stdafx.h"
#include "JeusService.h"



/////////////////////////////////////////////////////////////////////////////
// JeusService

JeusService::JeusService() : EnterpriseService(__uuidof(JeusServices))
{
	m_providerURL = L"localhost";
}

JeusService::~JeusService()
{
}

