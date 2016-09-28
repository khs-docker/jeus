/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ShapeNodes extends DispatchPtr
{
	public ShapeNodes(String progid) throws COMException { super(progid);}
	public ShapeNodes(IUnknown other) throws COMException { super(other);}

	public ShapeNodes(GUID ClsID) throws COMException { super(ClsID);}

	public DispatchPtr getApplication() throws COMException
	{
		return (DispatchPtr) get("Application");
	}

	public int getCreator() throws COMException
	{
		return ((Integer) get("Creator")).intValue();
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getCount() throws COMException
	{
		return ((Integer) get("Count")).intValue();
	}

	public ShapeNode Item(Object index) throws COMException
	{
		return (new ShapeNode((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public IUnknown get_NewEnum() throws COMException
	{
		return (IUnknown) get("_NewEnum");
	}

	public void Delete(int index) throws COMException
	{
		invokeN("Delete", new Object[] {new Integer(index)});
	}

	public void Insert(int index, int SegmentType, int EditingType, float X1, float Y1, float X2, float Y2, float X3, float Y3) throws COMException
	{
		invokeN("Insert", new Object[] {new Integer(index), new Integer(SegmentType), new Integer(EditingType), new Float(X1), new Float(Y1), new Float(X2), new Float(Y2), new Float(X3), new Float(Y3)});
	}

	public void SetEditingType(int index, int EditingType) throws COMException
	{
		invokeN("SetEditingType", new Object[] {new Integer(index), new Integer(EditingType)});
	}

	public void SetPosition(int index, float X1, float Y1) throws COMException
	{
		invokeN("SetPosition", new Object[] {new Integer(index), new Float(X1), new Float(Y1)});
	}

	public void SetSegmentType(int index, int SegmentType) throws COMException
	{
		invokeN("SetSegmentType", new Object[] {new Integer(index), new Integer(SegmentType)});
	}


}
