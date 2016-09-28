/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class DocumentWindow extends DispatchPtr
{
	public DocumentWindow(String progid) throws COMException { super(progid);}
	public DocumentWindow(IUnknown other) throws COMException { super(other);}

	public DocumentWindow(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public Selection getSelection() throws COMException
	{
		return ( new Selection((DispatchPtr)  get("Selection")));
	}

	public View getView() throws COMException
	{
		return ( new View((DispatchPtr)  get("View")));
	}

	public _Presentation getPresentation() throws COMException
	{
		return (new _Presentation((DispatchPtr)  get("Presentation")));
	}

	public int getViewType() throws COMException
	{
		return ((Integer) get("ViewType")).intValue();
	}

	public void setViewType(int pint) throws COMException
	{
		put("ViewType", new Integer(pint));
	}

	public int getBlackAndWhite() throws COMException
	{
		return ((Integer) get("BlackAndWhite")).intValue();
	}

	public void setBlackAndWhite(int pint) throws COMException
	{
		put("BlackAndWhite", new Integer(pint));
	}

	public int getActive() throws COMException
	{
		return ((Integer) get("Active")).intValue();
	}

	public int getWindowState() throws COMException
	{
		return ((Integer) get("WindowState")).intValue();
	}

	public void setWindowState(int pint) throws COMException
	{
		put("WindowState", new Integer(pint));
	}

	public String getCaption() throws COMException
	{
		return (String) get("Caption");
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

	public void FitToPage() throws COMException
	{
		invoke("FitToPage");
	}

	public void Activate() throws COMException
	{
		invoke("Activate");
	}

	public void LargeScroll(int Down, int Up, int ToRight, int ToLeft) throws COMException
	{
		invokeN("LargeScroll", new Object[] {new Integer(Down), new Integer(Up), new Integer(ToRight), new Integer(ToLeft)});
	}

	public void SmallScroll(int Down, int Up, int ToRight, int ToLeft) throws COMException
	{
		invokeN("SmallScroll", new Object[] {new Integer(Down), new Integer(Up), new Integer(ToRight), new Integer(ToLeft)});
	}

	public DocumentWindow NewWindow() throws COMException
	{
		return (new DocumentWindow((DispatchPtr)invoke("NewWindow")));
	}

	public void Close() throws COMException
	{
		invoke("Close");
	}

	public int getHWND() throws COMException
	{
		return ((Integer) get("HWND")).intValue();
	}

	public Pane getActivePane() throws COMException
	{
		return ( new Pane((DispatchPtr)  get("ActivePane")));
	}

	public Panes getPanes() throws COMException
	{
		return ( new Panes((DispatchPtr)  get("Panes")));
	}

	public int getSplitVertical() throws COMException
	{
		return ((Integer) get("SplitVertical")).intValue();
	}

	public void setSplitVertical(int pint) throws COMException
	{
		put("SplitVertical", new Integer(pint));
	}

	public int getSplitHorizontal() throws COMException
	{
		return ((Integer) get("SplitHorizontal")).intValue();
	}

	public void setSplitHorizontal(int pint) throws COMException
	{
		put("SplitHorizontal", new Integer(pint));
	}

	public DispatchPtr RangeFromPoint(int X, int Y) throws COMException
	{
		return (DispatchPtr)invokeN("RangeFromPoint", new Object[] {new Integer(X), new Integer(Y)});
	}

	public int PointsToScreenPixelsX(float Points) throws COMException
	{
		return ((Integer)invokeN("PointsToScreenPixelsX", new Object[] {new Float(Points)})).intValue();
	}

	public int PointsToScreenPixelsY(float Points) throws COMException
	{
		return ((Integer)invokeN("PointsToScreenPixelsY", new Object[] {new Float(Points)})).intValue();
	}

	public void ScrollIntoView(float Left, float Top, float Width, float Height, int Start) throws COMException
	{
		invokeN("ScrollIntoView", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height), new Integer(Start)});
	}


}
