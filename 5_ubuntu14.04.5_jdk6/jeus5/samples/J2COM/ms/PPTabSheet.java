/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPTabSheet extends DispatchPtr
{
	public PPTabSheet(String progid) throws COMException { super(progid);}
	public PPTabSheet(IUnknown other) throws COMException { super(other);}

	public PPTabSheet(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public void Select() throws COMException
	{
		invoke("Select");
	}

	public float getClientLeft() throws COMException
	{
		return ((Float) get("ClientLeft")).floatValue();
	}

	public float getClientTop() throws COMException
	{
		return ((Float) get("ClientTop")).floatValue();
	}

	public float getClientWidth() throws COMException
	{
		return ((Float) get("ClientWidth")).floatValue();
	}

	public float getClientHeight() throws COMException
	{
		return ((Float) get("ClientHeight")).floatValue();
	}

	public PPControls getControls() throws COMException
	{
		return ( new PPControls((DispatchPtr)  get("Controls")));
	}

	public Tags getTags() throws COMException
	{
		return ( new Tags((DispatchPtr)  get("Tags")));
	}

	public String getOnActivate() throws COMException
	{
		return (String) get("OnActivate");
	}

	public void setOnActivate(String pString) throws COMException
	{
		put("OnActivate", pString);
	}


}
