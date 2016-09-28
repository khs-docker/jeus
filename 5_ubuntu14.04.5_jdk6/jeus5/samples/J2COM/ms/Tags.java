/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Tags extends DispatchPtr
{
	public Tags(String progid) throws COMException { super(progid);}
	public Tags(IUnknown other) throws COMException { super(other);}

	public Tags(GUID ClsID) throws COMException { super(ClsID);}

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

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public String Item(String Name) throws COMException
	{
		return (String)invokeN("Item", new Object[] {Name});
	}

	public void Add(String Name, String Value) throws COMException
	{
		invokeN("Add", new Object[] {Name, Value});
	}

	public void Delete(String Name) throws COMException
	{
		invokeN("Delete", new Object[] {Name});
	}

	public void AddBinary(String Name, String FilePath) throws COMException
	{
		invokeN("AddBinary", new Object[] {Name, FilePath});
	}

	public int BinaryValue(String Name) throws COMException
	{
		return ((Integer)invokeN("BinaryValue", new Object[] {Name})).intValue();
	}

	public String Name(int index) throws COMException
	{
		return (String)invokeN("Name", new Object[] {new Integer(index)});
	}

	public String Value(int index) throws COMException
	{
		return (String)invokeN("Value", new Object[] {new Integer(index)});
	}


}
