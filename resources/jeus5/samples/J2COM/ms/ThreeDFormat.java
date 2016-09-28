/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ThreeDFormat extends DispatchPtr
{
	public ThreeDFormat(String progid) throws COMException { super(progid);}
	public ThreeDFormat(IUnknown other) throws COMException { super(other);}

	public ThreeDFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public void IncrementRotationX(float Increment) throws COMException
	{
		invokeN("IncrementRotationX", new Object[] {new Float(Increment)});
	}

	public void IncrementRotationY(float Increment) throws COMException
	{
		invokeN("IncrementRotationY", new Object[] {new Float(Increment)});
	}

	public void ResetRotation() throws COMException
	{
		invoke("ResetRotation");
	}

	public void SetThreeDFormat(int PresetThreeDFormat) throws COMException
	{
		invokeN("SetThreeDFormat", new Object[] {new Integer(PresetThreeDFormat)});
	}

	public void SetExtrusionDirection(int PresetExtrusionDirection) throws COMException
	{
		invokeN("SetExtrusionDirection", new Object[] {new Integer(PresetExtrusionDirection)});
	}

	public float getDepth() throws COMException
	{
		return ((Float) get("Depth")).floatValue();
	}

	public void setDepth(float pfloat) throws COMException
	{
		put("Depth", new Float(pfloat));
	}

	public ColorFormat getExtrusionColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("ExtrusionColor")));
	}

	public int getExtrusionColorType() throws COMException
	{
		return ((Integer) get("ExtrusionColorType")).intValue();
	}

	public void setExtrusionColorType(int pint) throws COMException
	{
		put("ExtrusionColorType", new Integer(pint));
	}

	public int getPerspective() throws COMException
	{
		return ((Integer) get("Perspective")).intValue();
	}

	public void setPerspective(int pint) throws COMException
	{
		put("Perspective", new Integer(pint));
	}

	public int getPresetExtrusionDirection() throws COMException
	{
		return ((Integer) get("PresetExtrusionDirection")).intValue();
	}

	public int getPresetLightingDirection() throws COMException
	{
		return ((Integer) get("PresetLightingDirection")).intValue();
	}

	public void setPresetLightingDirection(int pint) throws COMException
	{
		put("PresetLightingDirection", new Integer(pint));
	}

	public int getPresetLightingSoftness() throws COMException
	{
		return ((Integer) get("PresetLightingSoftness")).intValue();
	}

	public void setPresetLightingSoftness(int pint) throws COMException
	{
		put("PresetLightingSoftness", new Integer(pint));
	}

	public int getPresetMaterial() throws COMException
	{
		return ((Integer) get("PresetMaterial")).intValue();
	}

	public void setPresetMaterial(int pint) throws COMException
	{
		put("PresetMaterial", new Integer(pint));
	}

	public int getPresetThreeDFormat() throws COMException
	{
		return ((Integer) get("PresetThreeDFormat")).intValue();
	}

	public float getRotationX() throws COMException
	{
		return ((Float) get("RotationX")).floatValue();
	}

	public void setRotationX(float pfloat) throws COMException
	{
		put("RotationX", new Float(pfloat));
	}

	public float getRotationY() throws COMException
	{
		return ((Float) get("RotationY")).floatValue();
	}

	public void setRotationY(float pfloat) throws COMException
	{
		put("RotationY", new Float(pfloat));
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
