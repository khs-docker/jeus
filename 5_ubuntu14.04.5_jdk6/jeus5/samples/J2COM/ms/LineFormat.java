/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class LineFormat extends DispatchPtr
{
	public LineFormat(String progid) throws COMException { super(progid);}
	public LineFormat(IUnknown other) throws COMException { super(other);}

	public LineFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public ColorFormat getBackColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("BackColor")));
	}

	public void setBackColor(ColorFormat pColorFormat) throws COMException
	{
		put("BackColor", pColorFormat);
	}

	public int getBeginArrowheadLength() throws COMException
	{
		return ((Integer) get("BeginArrowheadLength")).intValue();
	}

	public void setBeginArrowheadLength(int pint) throws COMException
	{
		put("BeginArrowheadLength", new Integer(pint));
	}

	public int getBeginArrowheadStyle() throws COMException
	{
		return ((Integer) get("BeginArrowheadStyle")).intValue();
	}

	public void setBeginArrowheadStyle(int pint) throws COMException
	{
		put("BeginArrowheadStyle", new Integer(pint));
	}

	public int getBeginArrowheadWidth() throws COMException
	{
		return ((Integer) get("BeginArrowheadWidth")).intValue();
	}

	public void setBeginArrowheadWidth(int pint) throws COMException
	{
		put("BeginArrowheadWidth", new Integer(pint));
	}

	public int getDashStyle() throws COMException
	{
		return ((Integer) get("DashStyle")).intValue();
	}

	public void setDashStyle(int pint) throws COMException
	{
		put("DashStyle", new Integer(pint));
	}

	public int getEndArrowheadLength() throws COMException
	{
		return ((Integer) get("EndArrowheadLength")).intValue();
	}

	public void setEndArrowheadLength(int pint) throws COMException
	{
		put("EndArrowheadLength", new Integer(pint));
	}

	public int getEndArrowheadStyle() throws COMException
	{
		return ((Integer) get("EndArrowheadStyle")).intValue();
	}

	public void setEndArrowheadStyle(int pint) throws COMException
	{
		put("EndArrowheadStyle", new Integer(pint));
	}

	public int getEndArrowheadWidth() throws COMException
	{
		return ((Integer) get("EndArrowheadWidth")).intValue();
	}

	public void setEndArrowheadWidth(int pint) throws COMException
	{
		put("EndArrowheadWidth", new Integer(pint));
	}

	public ColorFormat getForeColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("ForeColor")));
	}

	public void setForeColor(ColorFormat pColorFormat) throws COMException
	{
		put("ForeColor", pColorFormat);
	}

	public int getPattern() throws COMException
	{
		return ((Integer) get("Pattern")).intValue();
	}

	public void setPattern(int pint) throws COMException
	{
		put("Pattern", new Integer(pint));
	}

	public int getStyle() throws COMException
	{
		return ((Integer) get("Style")).intValue();
	}

	public void setStyle(int pint) throws COMException
	{
		put("Style", new Integer(pint));
	}

	public float getTransparency() throws COMException
	{
		return ((Float) get("Transparency")).floatValue();
	}

	public void setTransparency(float pfloat) throws COMException
	{
		put("Transparency", new Float(pfloat));
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public float getWeight() throws COMException
	{
		return ((Float) get("Weight")).floatValue();
	}

	public void setWeight(float pfloat) throws COMException
	{
		put("Weight", new Float(pfloat));
	}


}
