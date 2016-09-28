/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Marker extends DispatchPtr
{
	public Marker(String progid) throws COMException { super(progid);}
	public Marker(IUnknown other) throws COMException { super(other);}

	public Marker(GUID ClsID) throws COMException { super(ClsID);}

	public int getMarkerType() throws COMException
	{
		return ((Integer) get("MarkerType")).intValue();
	}

	public void setMarkerType(int pint) throws COMException
	{
		put("MarkerType", new Integer(pint));
	}

	public int getTime() throws COMException
	{
		return ((Integer) get("Time")).intValue();
	}


}
