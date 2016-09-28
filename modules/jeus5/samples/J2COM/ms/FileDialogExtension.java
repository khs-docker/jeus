/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class FileDialogExtension extends DispatchPtr
{
	public FileDialogExtension(String progid) throws COMException { super(progid);}
	public FileDialogExtension(IUnknown other) throws COMException { super(other);}

	public FileDialogExtension(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public String getExtensions() throws COMException
	{
		return (String) get("Extensions");
	}

	public void setExtensions(String pString) throws COMException
	{
		put("Extensions", pString);
	}

	public String getDescription() throws COMException
	{
		return (String) get("Description");
	}

	public void setDescription(String pString) throws COMException
	{
		put("Description", pString);
	}


}
