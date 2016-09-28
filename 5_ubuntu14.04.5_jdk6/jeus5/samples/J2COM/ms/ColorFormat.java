/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ColorFormat extends DispatchPtr
{
	public ColorFormat(String progid) throws COMException { super(progid);}
	public ColorFormat(IUnknown other) throws COMException { super(other);}

	public ColorFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public int getRGB() throws COMException
	{
		return ((Integer) get("RGB")).intValue();
	}

	public void setRGB(int pint) throws COMException
	{
		put("RGB", new Integer(pint));
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public int getSchemeColor() throws COMException
	{
		return ((Integer) get("SchemeColor")).intValue();
	}

	public void setSchemeColor(int pint) throws COMException
	{
		put("SchemeColor", new Integer(pint));
	}


}
