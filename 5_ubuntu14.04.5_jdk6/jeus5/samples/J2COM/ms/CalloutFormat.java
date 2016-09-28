/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class CalloutFormat extends DispatchPtr
{
	public CalloutFormat(String progid) throws COMException { super(progid);}
	public CalloutFormat(IUnknown other) throws COMException { super(other);}

	public CalloutFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public void AutomaticLength() throws COMException
	{
		invoke("AutomaticLength");
	}

	public void CustomDrop(float Drop) throws COMException
	{
		invokeN("CustomDrop", new Object[] {new Float(Drop)});
	}

	public void CustomLength(float Length) throws COMException
	{
		invokeN("CustomLength", new Object[] {new Float(Length)});
	}

	public void PresetDrop(int DropType) throws COMException
	{
		invokeN("PresetDrop", new Object[] {new Integer(DropType)});
	}

	public int getAccent() throws COMException
	{
		return ((Integer) get("Accent")).intValue();
	}

	public void setAccent(int pint) throws COMException
	{
		put("Accent", new Integer(pint));
	}

	public int getAngle() throws COMException
	{
		return ((Integer) get("Angle")).intValue();
	}

	public void setAngle(int pint) throws COMException
	{
		put("Angle", new Integer(pint));
	}

	public int getAutoAttach() throws COMException
	{
		return ((Integer) get("AutoAttach")).intValue();
	}

	public void setAutoAttach(int pint) throws COMException
	{
		put("AutoAttach", new Integer(pint));
	}

	public int getAutoLength() throws COMException
	{
		return ((Integer) get("AutoLength")).intValue();
	}

	public int getBorder() throws COMException
	{
		return ((Integer) get("Border")).intValue();
	}

	public void setBorder(int pint) throws COMException
	{
		put("Border", new Integer(pint));
	}

	public float getDrop() throws COMException
	{
		return ((Float) get("Drop")).floatValue();
	}

	public int getDropType() throws COMException
	{
		return ((Integer) get("DropType")).intValue();
	}

	public float getGap() throws COMException
	{
		return ((Float) get("Gap")).floatValue();
	}

	public void setGap(float pfloat) throws COMException
	{
		put("Gap", new Float(pfloat));
	}

	public float getLength() throws COMException
	{
		return ((Float) get("Length")).floatValue();
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public void setType(int pint) throws COMException
	{
		put("Type", new Integer(pint));
	}


}
