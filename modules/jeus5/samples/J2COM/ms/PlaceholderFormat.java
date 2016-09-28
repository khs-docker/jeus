/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PlaceholderFormat extends DispatchPtr
{
	public PlaceholderFormat(String progid) throws COMException { super(progid);}
	public PlaceholderFormat(IUnknown other) throws COMException { super(other);}

	public PlaceholderFormat(GUID ClsID) throws COMException { super(ClsID);}

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


}
