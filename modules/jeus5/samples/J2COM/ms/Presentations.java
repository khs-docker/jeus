/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Presentations extends DispatchPtr
{
	public Presentations(String progid) throws COMException { super(progid);}
	public Presentations(IUnknown other) throws COMException { super(other);}

	public Presentations(GUID ClsID) throws COMException { super(ClsID);}

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

	public _Presentation Item(Object index) throws COMException
	{
		return (new _Presentation((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public _Presentation Add(int WithWindow) throws COMException
	{
		return (new _Presentation((DispatchPtr)invokeN("Add", new Object[] {new Integer(WithWindow)})));
	}

	public _Presentation Open(String FileName, int ReadOnly, int Untitled, int WithWindow) throws COMException
	{
		return (new _Presentation((DispatchPtr)invokeN("Open", new Object[] {FileName, new Integer(ReadOnly), new Integer(Untitled), new Integer(WithWindow)})));
	}


}
