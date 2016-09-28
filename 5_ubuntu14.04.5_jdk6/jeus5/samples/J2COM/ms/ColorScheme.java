/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ColorScheme extends DispatchPtr
{
	public ColorScheme(String progid) throws COMException { super(progid);}
	public ColorScheme(IUnknown other) throws COMException { super(other);}

	public ColorScheme(GUID ClsID) throws COMException { super(ClsID);}

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

	public RGBColor Colors(int SchemeColor) throws COMException
	{
		return (new RGBColor((DispatchPtr)invokeN("Colors", new Object[] {new Integer(SchemeColor)})));
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}


}
