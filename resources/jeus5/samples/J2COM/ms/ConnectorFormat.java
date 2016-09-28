/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ConnectorFormat extends DispatchPtr
{
	public ConnectorFormat(String progid) throws COMException { super(progid);}
	public ConnectorFormat(IUnknown other) throws COMException { super(other);}

	public ConnectorFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public void BeginConnect(Shape ConnectedShape, int ConnectionSite) throws COMException
	{
		invokeN("BeginConnect", new Object[] {ConnectedShape, new Integer(ConnectionSite)});
	}

	public void BeginDisconnect() throws COMException
	{
		invoke("BeginDisconnect");
	}

	public void EndConnect(Shape ConnectedShape, int ConnectionSite) throws COMException
	{
		invokeN("EndConnect", new Object[] {ConnectedShape, new Integer(ConnectionSite)});
	}

	public void EndDisconnect() throws COMException
	{
		invoke("EndDisconnect");
	}

	public int getBeginConnected() throws COMException
	{
		return ((Integer) get("BeginConnected")).intValue();
	}

	public Shape getBeginConnectedShape() throws COMException
	{
		return ( new Shape((DispatchPtr)  get("BeginConnectedShape")));
	}

	public int getBeginConnectionSite() throws COMException
	{
		return ((Integer) get("BeginConnectionSite")).intValue();
	}

	public int getEndConnected() throws COMException
	{
		return ((Integer) get("EndConnected")).intValue();
	}

	public Shape getEndConnectedShape() throws COMException
	{
		return ( new Shape((DispatchPtr)  get("EndConnectedShape")));
	}

	public int getEndConnectionSite() throws COMException
	{
		return ((Integer) get("EndConnectionSite")).intValue();
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public void setType(int pint) throws COMException
	{
		put("Type", new Integer(pint));
	}


}
