/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Table extends DispatchPtr
{
	public Table(String progid) throws COMException { super(progid);}
	public Table(IUnknown other) throws COMException { super(other);}

	public Table(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public Columns getColumns() throws COMException
	{
		return ( new Columns((DispatchPtr)  get("Columns")));
	}

	public Rows getRows() throws COMException
	{
		return ( new Rows((DispatchPtr)  get("Rows")));
	}

	public Cell Cell(int Row, int Column) throws COMException
	{
		return (new Cell((DispatchPtr)invokeN("Cell", new Object[] {new Integer(Row), new Integer(Column)})));
	}

	public int getTableDirection() throws COMException
	{
		return ((Integer) get("TableDirection")).intValue();
	}

	public void setTableDirection(int pint) throws COMException
	{
		put("TableDirection", new Integer(pint));
	}

	public void MergeBorders() throws COMException
	{
		invoke("MergeBorders");
	}


}
