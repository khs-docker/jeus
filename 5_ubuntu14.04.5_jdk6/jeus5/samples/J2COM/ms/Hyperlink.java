/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Hyperlink extends DispatchPtr
{
	public Hyperlink(String progid) throws COMException { super(progid);}
	public Hyperlink(IUnknown other) throws COMException { super(other);}

	public Hyperlink(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public String getAddress() throws COMException
	{
		return (String) get("Address");
	}

	public void setAddress(String pString) throws COMException
	{
		put("Address", pString);
	}

	public String getSubAddress() throws COMException
	{
		return (String) get("SubAddress");
	}

	public void setSubAddress(String pString) throws COMException
	{
		put("SubAddress", pString);
	}

	public void AddToFavorites() throws COMException
	{
		invoke("AddToFavorites");
	}

	public String getEmailSubject() throws COMException
	{
		return (String) get("EmailSubject");
	}

	public void setEmailSubject(String pString) throws COMException
	{
		put("EmailSubject", pString);
	}

	public String getScreenTip() throws COMException
	{
		return (String) get("ScreenTip");
	}

	public void setScreenTip(String pString) throws COMException
	{
		put("ScreenTip", pString);
	}

	public String getTextToDisplay() throws COMException
	{
		return (String) get("TextToDisplay");
	}

	public void setTextToDisplay(String pString) throws COMException
	{
		put("TextToDisplay", pString);
	}

	public int getShowandReturn() throws COMException
	{
		return ((Integer) get("ShowandReturn")).intValue();
	}

	public void setShowandReturn(int pint) throws COMException
	{
		put("ShowandReturn", new Integer(pint));
	}

	public void Follow() throws COMException
	{
		invoke("Follow");
	}

	public void CreateNewDocument(String FileName, int EditNow, int Overwrite) throws COMException
	{
		invokeN("CreateNewDocument", new Object[] {FileName, new Integer(EditNow), new Integer(Overwrite)});
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}


}
