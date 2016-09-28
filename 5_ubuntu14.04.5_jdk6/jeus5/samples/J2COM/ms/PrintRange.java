/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PrintRange extends DispatchPtr
{
	public PrintRange(String progid) throws COMException { super(progid);}
	public PrintRange(IUnknown other) throws COMException { super(other);}

	public PrintRange(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getStart() throws COMException
	{
		return ((Integer) get("Start")).intValue();
	}

	public int getEnd() throws COMException
	{
		return ((Integer) get("End")).intValue();
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}


}
