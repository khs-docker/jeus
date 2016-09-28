/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Column extends DispatchPtr
{
	public Column(String progid) throws COMException { super(progid);}
	public Column(IUnknown other) throws COMException { super(other);}

	public Column(GUID ClsID) throws COMException { super(ClsID);}

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

	public float getWidth() throws COMException
	{
		return ((Float) get("Width")).floatValue();
	}

	public void setWidth(float pfloat) throws COMException
	{
		put("Width", new Float(pfloat));
	}


}
