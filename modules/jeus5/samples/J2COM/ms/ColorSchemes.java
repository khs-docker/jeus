/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ColorSchemes extends DispatchPtr
{
	public ColorSchemes(String progid) throws COMException { super(progid);}
	public ColorSchemes(IUnknown other) throws COMException { super(other);}

	public ColorSchemes(GUID ClsID) throws COMException { super(ClsID);}

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

	public ColorScheme Item(int index) throws COMException
	{
		return (new ColorScheme((DispatchPtr)invokeN("Item", new Object[] {new Integer(index)})));
	}

	public ColorScheme Add(ColorScheme Scheme) throws COMException
	{
		return (new ColorScheme((DispatchPtr)invokeN("Add", new Object[] {Scheme})));
	}


}