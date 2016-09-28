/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPDialog extends DispatchPtr
{
	public PPDialog(String progid) throws COMException { super(progid);}
	public PPDialog(IUnknown other) throws COMException { super(other);}

	public PPDialog(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getStyle() throws COMException
	{
		return ((Integer) get("Style")).intValue();
	}

	public int getMode() throws COMException
	{
		return ((Integer) get("Mode")).intValue();
	}

	public void setMode(int pint) throws COMException
	{
		put("Mode", new Integer(pint));
	}

	public int getHelpId() throws COMException
	{
		return ((Integer) get("HelpId")).intValue();
	}

	public void setHelpId(int pint) throws COMException
	{
		put("HelpId", new Integer(pint));
	}

	public int getHideOnIdle() throws COMException
	{
		return ((Integer) get("HideOnIdle")).intValue();
	}

	public void setHideOnIdle(int pint) throws COMException
	{
		put("HideOnIdle", new Integer(pint));
	}

	public String getresourceDLL() throws COMException
	{
		return (String) get("resourceDLL");
	}

	public void setresourceDLL(String pString) throws COMException
	{
		put("resourceDLL", pString);
	}

	public String getCaption() throws COMException
	{
		return (String) get("Caption");
	}

	public void setCaption(String pString) throws COMException
	{
		put("Caption", pString);
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

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public PPControls getControls() throws COMException
	{
		return ( new PPControls((DispatchPtr)  get("Controls")));
	}

	public Tags getTags() throws COMException
	{
		return ( new Tags((DispatchPtr)  get("Tags")));
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public PPTabSheets getSheets() throws COMException
	{
		return ( new PPTabSheets((DispatchPtr)  get("Sheets")));
	}

	public PPTabControl getTabControl() throws COMException
	{
		return ( new PPTabControl((DispatchPtr)  get("TabControl")));
	}

	public int getDelayTime() throws COMException
	{
		return ((Integer) get("DelayTime")).intValue();
	}

	public void setDelayTime(int pint) throws COMException
	{
		put("DelayTime", new Integer(pint));
	}

	public int SaveDialog(String FileName) throws COMException
	{
		return ((Integer)invokeN("SaveDialog", new Object[] {FileName})).intValue();
	}

	public void Terminate() throws COMException
	{
		invoke("Terminate");
	}

	public int getHWND() throws COMException
	{
		return ((Integer) get("HWND")).intValue();
	}

	public String getOnTerminate() throws COMException
	{
		return (String) get("OnTerminate");
	}

	public void setOnTerminate(String pString) throws COMException
	{
		put("OnTerminate", pString);
	}

	public String getOnIdle() throws COMException
	{
		return (String) get("OnIdle");
	}

	public void setOnIdle(String pString) throws COMException
	{
		put("OnIdle", pString);
	}

	public String getOnMouseDown() throws COMException
	{
		return (String) get("OnMouseDown");
	}

	public void setOnMouseDown(String pString) throws COMException
	{
		put("OnMouseDown", pString);
	}

	public String getOnMouseUp() throws COMException
	{
		return (String) get("OnMouseUp");
	}

	public void setOnMouseUp(String pString) throws COMException
	{
		put("OnMouseUp", pString);
	}

	public String getOnKeyPressed() throws COMException
	{
		return (String) get("OnKeyPressed");
	}

	public void setOnKeyPressed(String pString) throws COMException
	{
		put("OnKeyPressed", pString);
	}

	public String getOnTimer() throws COMException
	{
		return (String) get("OnTimer");
	}

	public void setOnTimer(String pString) throws COMException
	{
		put("OnTimer", pString);
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
