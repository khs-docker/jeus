/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPTabSheets extends DispatchPtr
{
	public PPTabSheets(String progid) throws COMException { super(progid);}
	public PPTabSheets(IUnknown other) throws COMException { super(other);}

	public PPTabSheets(GUID ClsID) throws COMException { super(ClsID);}

	public IUnknown get_NewEnum() throws COMException
	{
		return (IUnknown) get("_NewEnum");
	}

	public Object _Index(int index) throws COMException
	{
		return invokeN("_Index", new Object[] {new Integer(index)});
	}

	public int getCount() throws COMException
	{
		return ((Integer) get("Count")).intValue();
	}

	public PPTabSheet Item(Object index) throws COMException
	{
		return (new PPTabSheet((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public PPTabSheet Add(String Name) throws COMException
	{
		return (new PPTabSheet((DispatchPtr)invokeN("Add", new Object[] {Name})));
	}

	public PPTabSheet getActiveSheet() throws COMException
	{
		return ( new PPTabSheet((DispatchPtr)  get("ActiveSheet")));
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}


}
