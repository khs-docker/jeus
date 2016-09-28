/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPStrings extends DispatchPtr
{
	public PPStrings(String progid) throws COMException { super(progid);}
	public PPStrings(IUnknown other) throws COMException { super(other);}

	public PPStrings(GUID ClsID) throws COMException { super(ClsID);}

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

	public String Item(int index) throws COMException
	{
		return (String)invokeN("Item", new Object[] {new Integer(index)});
	}

	public String Add(String String) throws COMException
	{
		return (String)invokeN("Add", new Object[] {String});
	}

	public void Insert(String String, int Position) throws COMException
	{
		invokeN("Insert", new Object[] {String, new Integer(Position)});
	}

	public void Delete(int index) throws COMException
	{
		invokeN("Delete", new Object[] {new Integer(index)});
	}


}
