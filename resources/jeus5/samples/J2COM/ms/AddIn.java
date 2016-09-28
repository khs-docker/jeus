/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class AddIn extends DispatchPtr
{
	public AddIn(String progid) throws COMException { super(progid);}
	public AddIn(IUnknown other) throws COMException { super(other);}

	public AddIn(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public String getFullName() throws COMException
	{
		return (String) get("FullName");
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public String getPath() throws COMException
	{
		return (String) get("Path");
	}

	public int getRegistered() throws COMException
	{
		return ((Integer) get("Registered")).intValue();
	}

	public void setRegistered(int pint) throws COMException
	{
		put("Registered", new Integer(pint));
	}

	public int getAutoLoad() throws COMException
	{
		return ((Integer) get("AutoLoad")).intValue();
	}

	public void setAutoLoad(int pint) throws COMException
	{
		put("AutoLoad", new Integer(pint));
	}

	public int getLoaded() throws COMException
	{
		return ((Integer) get("Loaded")).intValue();
	}

	public void setLoaded(int pint) throws COMException
	{
		put("Loaded", new Integer(pint));
	}

	public int getDisplayAlerts() throws COMException
	{
		return ((Integer) get("DisplayAlerts")).intValue();
	}

	public void setDisplayAlerts(int pint) throws COMException
	{
		put("DisplayAlerts", new Integer(pint));
	}

	public int getRegisteredInHKLM() throws COMException
	{
		return ((Integer) get("RegisteredInHKLM")).intValue();
	}


}
