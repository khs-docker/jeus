/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class RGBColor extends DispatchPtr
{
	public RGBColor(String progid) throws COMException { super(progid);}
	public RGBColor(IUnknown other) throws COMException { super(other);}

	public RGBColor(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getRGB() throws COMException
	{
		return ((Integer) get("RGB")).intValue();
	}

	public void setRGB(int pint) throws COMException
	{
		put("RGB", new Integer(pint));
	}


}
