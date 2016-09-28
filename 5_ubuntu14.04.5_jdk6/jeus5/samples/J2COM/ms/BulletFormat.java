/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class BulletFormat extends DispatchPtr
{
	public BulletFormat(String progid) throws COMException { super(progid);}
	public BulletFormat(IUnknown other) throws COMException { super(other);}

	public BulletFormat(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public int getCharacter() throws COMException
	{
		return ((Integer) get("Character")).intValue();
	}

	public void setCharacter(int pint) throws COMException
	{
		put("Character", new Integer(pint));
	}

	public float getRelativeSize() throws COMException
	{
		return ((Float) get("RelativeSize")).floatValue();
	}

	public void setRelativeSize(float pfloat) throws COMException
	{
		put("RelativeSize", new Float(pfloat));
	}

	public int getUseTextColor() throws COMException
	{
		return ((Integer) get("UseTextColor")).intValue();
	}

	public void setUseTextColor(int pint) throws COMException
	{
		put("UseTextColor", new Integer(pint));
	}

	public int getUseTextFont() throws COMException
	{
		return ((Integer) get("UseTextFont")).intValue();
	}

	public void setUseTextFont(int pint) throws COMException
	{
		put("UseTextFont", new Integer(pint));
	}

	public Font getFont() throws COMException
	{
		return ( new Font((DispatchPtr)  get("Font")));
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public void setType(int pint) throws COMException
	{
		put("Type", new Integer(pint));
	}

	public int getStyle() throws COMException
	{
		return ((Integer) get("Style")).intValue();
	}

	public void setStyle(int pint) throws COMException
	{
		put("Style", new Integer(pint));
	}

	public int getStartValue() throws COMException
	{
		return ((Integer) get("StartValue")).intValue();
	}

	public void setStartValue(int pint) throws COMException
	{
		put("StartValue", new Integer(pint));
	}

	public void Picture(String Picture) throws COMException
	{
		invokeN("Picture", new Object[] {Picture});
	}

	public int getNumber() throws COMException
	{
		return ((Integer) get("Number")).intValue();
	}


}
