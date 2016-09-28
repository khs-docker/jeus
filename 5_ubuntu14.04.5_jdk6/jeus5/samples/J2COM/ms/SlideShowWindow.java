/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class SlideShowWindow extends DispatchPtr
{
	public SlideShowWindow(String progid) throws COMException { super(progid);}
	public SlideShowWindow(IUnknown other) throws COMException { super(other);}

	public SlideShowWindow(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public SlideShowView getView() throws COMException
	{
		return ( new SlideShowView((DispatchPtr)  get("View")));
	}

	public _Presentation getPresentation() throws COMException
	{
		return (new _Presentation((DispatchPtr)  get("Presentation")));
	}

	public int getIsFullScreen() throws COMException
	{
		return ((Integer) get("IsFullScreen")).intValue();
	}

	public float getLeft() throws COMException
	{
		return ((Float) get("Left")).floatValue();
	}

	public void setLeft(float pfloat) throws COMException
	{
		put("Left", new Float(pfloat));
	}

	public float getTop() throws COMException
	{
		return ((Float) get("Top")).floatValue();
	}

	public void setTop(float pfloat) throws COMException
	{
		put("Top", new Float(pfloat));
	}

	public float getWidth() throws COMException
	{
		return ((Float) get("Width")).floatValue();
	}

	public void setWidth(float pfloat) throws COMException
	{
		put("Width", new Float(pfloat));
	}

	public float getHeight() throws COMException
	{
		return ((Float) get("Height")).floatValue();
	}

	public void setHeight(float pfloat) throws COMException
	{
		put("Height", new Float(pfloat));
	}

	public int getHWND() throws COMException
	{
		return ((Integer) get("HWND")).intValue();
	}

	public int getActive() throws COMException
	{
		return ((Integer) get("Active")).intValue();
	}

	public void Activate() throws COMException
	{
		invoke("Activate");
	}


}
