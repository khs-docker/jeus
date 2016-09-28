/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPBitmapButton extends DispatchPtr
{
	public PPBitmapButton(String progid) throws COMException { super(progid);}
	public PPBitmapButton(IUnknown other) throws COMException { super(other);}

	public PPBitmapButton(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getEnable() throws COMException
	{
		return ((Integer) get("Enable")).intValue();
	}

	public void setEnable(int pint) throws COMException
	{
		put("Enable", new Integer(pint));
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public int getFocus() throws COMException
	{
		return ((Integer) get("Focus")).intValue();
	}

	public void setFocus(int pint) throws COMException
	{
		put("Focus", new Integer(pint));
	}

	public String getLabel() throws COMException
	{
		return (String) get("Label");
	}

	public void setLabel(String pString) throws COMException
	{
		put("Label", pString);
	}

	public int getHelpId() throws COMException
	{
		return ((Integer) get("HelpId")).intValue();
	}

	public void setHelpId(int pint) throws COMException
	{
		put("HelpId", new Integer(pint));
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

	public String getOnSetFocus() throws COMException
	{
		return (String) get("OnSetFocus");
	}

	public void setOnSetFocus(String pString) throws COMException
	{
		put("OnSetFocus", pString);
	}

	public String getOnKillFocus() throws COMException
	{
		return (String) get("OnKillFocus");
	}

	public void setOnKillFocus(String pString) throws COMException
	{
		put("OnKillFocus", pString);
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

	public void Click() throws COMException
	{
		invoke("Click");
	}

	public int getResourceID() throws COMException
	{
		return ((Integer) get("ResourceID")).intValue();
	}

	public void setResourceID(int pint) throws COMException
	{
		put("ResourceID", new Integer(pint));
	}

	public String getOnPressed() throws COMException
	{
		return (String) get("OnPressed");
	}

	public void setOnPressed(String pString) throws COMException
	{
		put("OnPressed", pString);
	}

	public int getIsDefault() throws COMException
	{
		return ((Integer) get("IsDefault")).intValue();
	}

	public void setIsDefault(int pint) throws COMException
	{
		put("IsDefault", new Integer(pint));
	}

	public int getIsEscape() throws COMException
	{
		return ((Integer) get("IsEscape")).intValue();
	}

	public void setIsEscape(int pint) throws COMException
	{
		put("IsEscape", new Integer(pint));
	}


}
