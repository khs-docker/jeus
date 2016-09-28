/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ShapeNode extends DispatchPtr
{
	public ShapeNode(String progid) throws COMException { super(progid);}
	public ShapeNode(IUnknown other) throws COMException { super(other);}

	public ShapeNode(GUID ClsID) throws COMException { super(ClsID);}

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

	public int getEditingType() throws COMException
	{
		return ((Integer) get("EditingType")).intValue();
	}

	public Object getPoints() throws COMException
	{
		return (Object) get("Points");
	}

	public int getSegmentType() throws COMException
	{
		return ((Integer) get("SegmentType")).intValue();
	}


}
