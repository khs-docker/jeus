/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Fonts extends DispatchPtr
{
	public Fonts(String progid) throws COMException { super(progid);}
	public Fonts(IUnknown other) throws COMException { super(other);}

	public Fonts(GUID ClsID) throws COMException { super(ClsID);}

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

	public Font Item(Object index) throws COMException
	{
		return (new Font((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public void Replace(String Original, String Replacement) throws COMException
	{
		invokeN("Replace", new Object[] {Original, Replacement});
	}


}
