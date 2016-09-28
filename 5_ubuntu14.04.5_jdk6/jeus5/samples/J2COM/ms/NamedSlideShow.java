/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class NamedSlideShow extends DispatchPtr
{
	public NamedSlideShow(String progid) throws COMException { super(progid);}
	public NamedSlideShow(IUnknown other) throws COMException { super(other);}

	public NamedSlideShow(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}

	public Object getSlideIDs() throws COMException
	{
		return (Object) get("SlideIDs");
	}

	public int getCount() throws COMException
	{
		return ((Integer) get("Count")).intValue();
	}


}
