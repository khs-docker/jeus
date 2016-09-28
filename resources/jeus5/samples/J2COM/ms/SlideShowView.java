/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class SlideShowView extends DispatchPtr
{
	public SlideShowView(String progid) throws COMException { super(progid);}
	public SlideShowView(IUnknown other) throws COMException { super(other);}

	public SlideShowView(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getZoom() throws COMException
	{
		return ((Integer) get("Zoom")).intValue();
	}

	public _Slide getSlide() throws COMException
	{
		return (new _Slide((DispatchPtr)  get("Slide")));
	}

	public int getPointerType() throws COMException
	{
		return ((Integer) get("PointerType")).intValue();
	}

	public void setPointerType(int pint) throws COMException
	{
		put("PointerType", new Integer(pint));
	}

	public int getState() throws COMException
	{
		return ((Integer) get("State")).intValue();
	}

	public void setState(int pint) throws COMException
	{
		put("State", new Integer(pint));
	}

	public int getAcceleratorsEnabled() throws COMException
	{
		return ((Integer) get("AcceleratorsEnabled")).intValue();
	}

	public void setAcceleratorsEnabled(int pint) throws COMException
	{
		put("AcceleratorsEnabled", new Integer(pint));
	}

	public float getPresentationElapsedTime() throws COMException
	{
		return ((Float) get("PresentationElapsedTime")).floatValue();
	}

	public float getSlideElapsedTime() throws COMException
	{
		return ((Float) get("SlideElapsedTime")).floatValue();
	}

	public void setSlideElapsedTime(float pfloat) throws COMException
	{
		put("SlideElapsedTime", new Float(pfloat));
	}

	public _Slide getLastSlideViewed() throws COMException
	{
		return (new _Slide((DispatchPtr)  get("LastSlideViewed")));
	}

	public int getAdvanceMode() throws COMException
	{
		return ((Integer) get("AdvanceMode")).intValue();
	}

	public ColorFormat getPointerColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("PointerColor")));
	}

	public int getIsNamedShow() throws COMException
	{
		return ((Integer) get("IsNamedShow")).intValue();
	}

	public String getSlideShowName() throws COMException
	{
		return (String) get("SlideShowName");
	}

	public void DrawLine(float BeginX, float BeginY, float EndX, float EndY) throws COMException
	{
		invokeN("DrawLine", new Object[] {new Float(BeginX), new Float(BeginY), new Float(EndX), new Float(EndY)});
	}

	public void EraseDrawing() throws COMException
	{
		invoke("EraseDrawing");
	}

	public void First() throws COMException
	{
		invoke("First");
	}

	public void Last() throws COMException
	{
		invoke("Last");
	}

	public void Next() throws COMException
	{
		invoke("Next");
	}

	public void Previous() throws COMException
	{
		invoke("Previous");
	}

	public void GotoSlide(int index, int ResetSlide) throws COMException
	{
		invokeN("GotoSlide", new Object[] {new Integer(index), new Integer(ResetSlide)});
	}

	public void GotoNamedShow(String SlideShowName) throws COMException
	{
		invokeN("GotoNamedShow", new Object[] {SlideShowName});
	}

	public void EndNamedShow() throws COMException
	{
		invoke("EndNamedShow");
	}

	public void ResetSlideTime() throws COMException
	{
		invoke("ResetSlideTime");
	}

	public void Exit() throws COMException
	{
		invoke("Exit");
	}

/* 	public void InstallTracker(ERROR_UKNOWN_TKIND pTracker, int Presenter) throws COMException
	{
		invokeN("InstallTracker", new Object[] {pTracker, new Integer(Presenter)});
	}*/

	public int getCurrentShowPosition() throws COMException
	{
		return ((Integer) get("CurrentShowPosition")).intValue();
	}


}
