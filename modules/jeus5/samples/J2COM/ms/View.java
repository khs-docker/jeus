/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class View extends DispatchPtr
{
	public View(String progid) throws COMException { super(progid);}
	public View(IUnknown other) throws COMException { super(other);}

	public View(GUID ClsID) throws COMException { super(ClsID);}

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

	public int getZoom() throws COMException
	{
		return ((Integer) get("Zoom")).intValue();
	}

	public void setZoom(int pint) throws COMException
	{
		put("Zoom", new Integer(pint));
	}

	public void Paste() throws COMException
	{
		invoke("Paste");
	}

	public DispatchPtr getSlide() throws COMException
	{
		return (DispatchPtr) get("Slide");
	}

	public void setSlide(DispatchPtr pDispatchPtr) throws COMException
	{
		put("Slide", pDispatchPtr);
	}

	public void GotoSlide(int index) throws COMException
	{
		invokeN("GotoSlide", new Object[] {new Integer(index)});
	}

	public int getDisplaySlideMiniature() throws COMException
	{
		return ((Integer) get("DisplaySlideMiniature")).intValue();
	}

	public void setDisplaySlideMiniature(int pint) throws COMException
	{
		put("DisplaySlideMiniature", new Integer(pint));
	}

	public int getZoomToFit() throws COMException
	{
		return ((Integer) get("ZoomToFit")).intValue();
	}

	public void setZoomToFit(int pint) throws COMException
	{
		put("ZoomToFit", new Integer(pint));
	}


}
