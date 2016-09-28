/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class TabStop extends DispatchPtr
{
	public TabStop(String progid) throws COMException { super(progid);}
	public TabStop(IUnknown other) throws COMException { super(other);}

	public TabStop(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public void setType(int pint) throws COMException
	{
		put("Type", new Integer(pint));
	}

	public float getPosition() throws COMException
	{
		return ((Float) get("Position")).floatValue();
	}

	public void setPosition(float pfloat) throws COMException
	{
		put("Position", new Float(pfloat));
	}

	public void Clear() throws COMException
	{
		invoke("Clear");
	}


}
