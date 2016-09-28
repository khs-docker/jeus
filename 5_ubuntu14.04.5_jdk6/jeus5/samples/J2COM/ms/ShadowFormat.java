/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ShadowFormat extends DispatchPtr
{
	public ShadowFormat(String progid) throws COMException { super(progid);}
	public ShadowFormat(IUnknown other) throws COMException { super(other);}

	public ShadowFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public void IncrementOffsetX(float Increment) throws COMException
	{
		invokeN("IncrementOffsetX", new Object[] {new Float(Increment)});
	}

	public void IncrementOffsetY(float Increment) throws COMException
	{
		invokeN("IncrementOffsetY", new Object[] {new Float(Increment)});
	}

	public ColorFormat getForeColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("ForeColor")));
	}

	public void setForeColor(ColorFormat pColorFormat) throws COMException
	{
		put("ForeColor", pColorFormat);
	}

	public int getObscured() throws COMException
	{
		return ((Integer) get("Obscured")).intValue();
	}

	public void setObscured(int pint) throws COMException
	{
		put("Obscured", new Integer(pint));
	}

	public float getOffsetX() throws COMException
	{
		return ((Float) get("OffsetX")).floatValue();
	}

	public void setOffsetX(float pfloat) throws COMException
	{
		put("OffsetX", new Float(pfloat));
	}

	public float getOffsetY() throws COMException
	{
		return ((Float) get("OffsetY")).floatValue();
	}

	public void setOffsetY(float pfloat) throws COMException
	{
		put("OffsetY", new Float(pfloat));
	}

	public float getTransparency() throws COMException
	{
		return ((Float) get("Transparency")).floatValue();
	}

	public void setTransparency(float pfloat) throws COMException
	{
		put("Transparency", new Float(pfloat));
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public void setType(int pint) throws COMException
	{
		put("Type", new Integer(pint));
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}


}
