/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Cell extends DispatchPtr
{
	public Cell(String progid) throws COMException { super(progid);}
	public Cell(IUnknown other) throws COMException { super(other);}

	public Cell(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public Shape getShape() throws COMException
	{
		return ( new Shape((DispatchPtr)  get("Shape")));
	}

	public Borders getBorders() throws COMException
	{
		return ( new Borders((DispatchPtr)  get("Borders")));
	}

	public void Merge(Cell MergeTo) throws COMException
	{
		invokeN("Merge", new Object[] {MergeTo});
	}

	public void Split(int NumRows, int NumColumns) throws COMException
	{
		invokeN("Split", new Object[] {new Integer(NumRows), new Integer(NumColumns)});
	}

	public void Select() throws COMException
	{
		invoke("Select");
	}

	public boolean getSelected() throws COMException
	{
		return ((Boolean) get("Selected")).booleanValue();
	}


}
