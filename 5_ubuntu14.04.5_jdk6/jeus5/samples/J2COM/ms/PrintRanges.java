/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PrintRanges extends DispatchPtr
{
	public PrintRanges(String progid) throws COMException { super(progid);}
	public PrintRanges(IUnknown other) throws COMException { super(other);}

	public PrintRanges(GUID ClsID) throws COMException { super(ClsID);}

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

	public PrintRange Add(int Start, int End) throws COMException
	{
		return (new PrintRange((DispatchPtr)invokeN("Add", new Object[] {new Integer(Start), new Integer(End)})));
	}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public void ClearAll() throws COMException
	{
		invoke("ClearAll");
	}

	public PrintRange Item(int index) throws COMException
	{
		return (new PrintRange((DispatchPtr)invokeN("Item", new Object[] {new Integer(index)})));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}


}
