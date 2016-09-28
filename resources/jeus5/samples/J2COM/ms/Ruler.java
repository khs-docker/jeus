/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Ruler extends DispatchPtr
{
	public Ruler(String progid) throws COMException { super(progid);}
	public Ruler(IUnknown other) throws COMException { super(other);}

	public Ruler(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public TabStops getTabStops() throws COMException
	{
		return ( new TabStops((DispatchPtr)  get("TabStops")));
	}

	public RulerLevels getLevels() throws COMException
	{
		return ( new RulerLevels((DispatchPtr)  get("Levels")));
	}


}
