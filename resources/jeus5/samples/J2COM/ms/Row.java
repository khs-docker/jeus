/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Row extends DispatchPtr
{
	public Row(String progid) throws COMException { super(progid);}
	public Row(IUnknown other) throws COMException { super(other);}

	public Row(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public CellRange getCells() throws COMException
	{
		return ( new CellRange((DispatchPtr)  get("Cells")));
	}

	public void Select() throws COMException
	{
		invoke("Select");
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}

	public float getHeight() throws COMException
	{
		return ((Float) get("Height")).floatValue();
	}

	public void setHeight(float pfloat) throws COMException
	{
		put("Height", new Float(pfloat));
	}


}
