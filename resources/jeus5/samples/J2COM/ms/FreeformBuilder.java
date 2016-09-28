/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class FreeformBuilder extends DispatchPtr
{
	public FreeformBuilder(String progid) throws COMException { super(progid);}
	public FreeformBuilder(IUnknown other) throws COMException { super(other);}

	public FreeformBuilder(GUID ClsID) throws COMException { super(ClsID);}

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

	public void AddNodes(int SegmentType, int EditingType, float X1, float Y1, float X2, float Y2, float X3, float Y3) throws COMException
	{
		invokeN("AddNodes", new Object[] {new Integer(SegmentType), new Integer(EditingType), new Float(X1), new Float(Y1), new Float(X2), new Float(Y2), new Float(X3), new Float(Y3)});
	}

	public Shape ConvertToShape() throws COMException
	{
		return (new Shape((DispatchPtr)invoke("ConvertToShape")));
	}


}
