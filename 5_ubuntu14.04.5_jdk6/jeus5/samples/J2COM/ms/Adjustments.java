/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Adjustments extends DispatchPtr
{
	public Adjustments(String progid) throws COMException { super(progid);}
	public Adjustments(IUnknown other) throws COMException { super(other);}

	public Adjustments(GUID ClsID) throws COMException { super(ClsID);}

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

	public float getItem(int index) throws COMException
	{
		return ((Float) get("Item")).floatValue();
	}

	public void setItem(float pfloat) throws COMException
	{
		put("Item", new Float(pfloat));
	}


}
