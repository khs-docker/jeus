/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class LinkFormat extends DispatchPtr
{
	public LinkFormat(String progid) throws COMException { super(progid);}
	public LinkFormat(IUnknown other) throws COMException { super(other);}

	public LinkFormat(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public String getSourceFullName() throws COMException
	{
		return (String) get("SourceFullName");
	}

	public void setSourceFullName(String pString) throws COMException
	{
		put("SourceFullName", pString);
	}

	public int getAutoUpdate() throws COMException
	{
		return ((Integer) get("AutoUpdate")).intValue();
	}

	public void setAutoUpdate(int pint) throws COMException
	{
		put("AutoUpdate", new Integer(pint));
	}

	public void Update() throws COMException
	{
		invoke("Update");
	}


}
