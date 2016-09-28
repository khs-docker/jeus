// newMail.cpp : Implementation of CnewMail
#include "stdafx.h"
#include "Email.h"
#include "newMail.h"
#include "msword9.h"

/////////////////////////////////////////////////////////////////// CnewMail

STDMETHODIMP CnewMail::mail(BSTR company, BSTR name)
{
AFX_MANAGE_STATE(AfxGetStaticModuleState())

COleVariant vOpt(DISP_E_PARAMNOTFOUND, VT_ERROR);

_Application oApp;
oApp.CreateDispatch("Word.Application");
if(!oApp)
{
AfxMessageBox("Cannot start Word.");
return S_FALSE;
}

Documents oDocs = oApp.GetDocuments();
_Document oDoc = oDocs.Add(vOpt, vOpt, vOpt, vOpt);

//Add the field codes and text to the document
Selection oSel = oApp.GetSelection();
Range oRange;

CHAR msg[128];
	
oSel.TypeText("Dear ");

WideCharToMultiByte(CP_ACP, 0, (LPWSTR)name, -1, msg, 128, NULL, NULL);
oSel.TypeText(msg);
	
oSel.TypeParagraph();
oSel.TypeParagraph();
oSel.TypeText("Welcome to Tmax!");
oSel.TypeParagraph();
oSel.TypeText("Work hard, play hard and enjoy Life!!");
oSel.TypeParagraph();
oSel.TypeParagraph();

WideCharToMultiByte(CP_ACP, 0, (LPWSTR)company, -1, msg, 128, NULL, NULL);
oSel.TypeText(msg);

oApp.SetVisible(TRUE);
return S_OK;
}
