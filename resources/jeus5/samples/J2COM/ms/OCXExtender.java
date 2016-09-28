/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class OCXExtender extends DispatchPtr
{
	public OCXExtender(String progid) throws COMException { super(progid);}
	public OCXExtender(IUnknown other) throws COMException { super(other);}

	public OCXExtender(GUID ClsID) throws COMException { super(ClsID);}

	public boolean getVisible() throws COMException
	{
		return ((Boolean) get("Visible")).booleanValue();
	}

	public void setVisible(boolean pboolean) throws COMException
	{
		put("Visible", new Boolean(pboolean));
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

	public float getHeight() throws COMException
	{
		return ((Float) get("Height")).floatValue();
	}

	public void setHeight(float pfloat) throws COMException
	{
		put("Height", new Float(pfloat));
	}

	public float getWidth() throws COMException
	{
		return ((Float) get("Width")).floatValue();
	}

	public void setWidth(float pfloat) throws COMException
	{
		put("Width", new Float(pfloat));
	}

	public int getZOrderPosition() throws COMException
	{
		return ((Integer) get("ZOrderPosition")).intValue();
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public String getAltHTML() throws COMException
	{
		return (String) get("AltHTML");
	}

	public void setAltHTML(String pString) throws COMException
	{
		put("AltHTML", pString);
	}


}
