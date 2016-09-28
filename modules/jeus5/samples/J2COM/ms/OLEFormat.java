/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class OLEFormat extends DispatchPtr
{
	public OLEFormat(String progid) throws COMException { super(progid);}
	public OLEFormat(IUnknown other) throws COMException { super(other);}

	public OLEFormat(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public ObjectVerbs getObjectVerbs() throws COMException
	{
		return ( new ObjectVerbs((DispatchPtr)  get("ObjectVerbs")));
	}

	public DispatchPtr getObject() throws COMException
	{
		return (DispatchPtr) get("Object");
	}

	public String getProgID() throws COMException
	{
		return (String) get("ProgID");
	}

	public int getFollowColors() throws COMException
	{
		return ((Integer) get("FollowColors")).intValue();
	}

	public void setFollowColors(int pint) throws COMException
	{
		put("FollowColors", new Integer(pint));
	}

	public void DoVerb(int index) throws COMException
	{
		invokeN("DoVerb", new Object[] {new Integer(index)});
	}

	public void Activate() throws COMException
	{
		invoke("Activate");
	}


}
