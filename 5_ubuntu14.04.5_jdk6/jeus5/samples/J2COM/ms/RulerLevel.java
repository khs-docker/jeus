/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class RulerLevel extends DispatchPtr
{
	public RulerLevel(String progid) throws COMException { super(progid);}
	public RulerLevel(IUnknown other) throws COMException { super(other);}

	public RulerLevel(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public float getFirstMargin() throws COMException
	{
		return ((Float) get("FirstMargin")).floatValue();
	}

	public void setFirstMargin(float pfloat) throws COMException
	{
		put("FirstMargin", new Float(pfloat));
	}

	public float getLeftMargin() throws COMException
	{
		return ((Float) get("LeftMargin")).floatValue();
	}

	public void setLeftMargin(float pfloat) throws COMException
	{
		put("LeftMargin", new Float(pfloat));
	}


}
