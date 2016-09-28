/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PictureFormat extends DispatchPtr
{
	public PictureFormat(String progid) throws COMException { super(progid);}
	public PictureFormat(IUnknown other) throws COMException { super(other);}

	public PictureFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public void IncrementBrightness(float Increment) throws COMException
	{
		invokeN("IncrementBrightness", new Object[] {new Float(Increment)});
	}

	public void IncrementContrast(float Increment) throws COMException
	{
		invokeN("IncrementContrast", new Object[] {new Float(Increment)});
	}

	public float getBrightness() throws COMException
	{
		return ((Float) get("Brightness")).floatValue();
	}

	public void setBrightness(float pfloat) throws COMException
	{
		put("Brightness", new Float(pfloat));
	}

	public int getColorType() throws COMException
	{
		return ((Integer) get("ColorType")).intValue();
	}

	public void setColorType(int pint) throws COMException
	{
		put("ColorType", new Integer(pint));
	}

	public float getContrast() throws COMException
	{
		return ((Float) get("Contrast")).floatValue();
	}

	public void setContrast(float pfloat) throws COMException
	{
		put("Contrast", new Float(pfloat));
	}

	public float getCropBottom() throws COMException
	{
		return ((Float) get("CropBottom")).floatValue();
	}

	public void setCropBottom(float pfloat) throws COMException
	{
		put("CropBottom", new Float(pfloat));
	}

	public float getCropLeft() throws COMException
	{
		return ((Float) get("CropLeft")).floatValue();
	}

	public void setCropLeft(float pfloat) throws COMException
	{
		put("CropLeft", new Float(pfloat));
	}

	public float getCropRight() throws COMException
	{
		return ((Float) get("CropRight")).floatValue();
	}

	public void setCropRight(float pfloat) throws COMException
	{
		put("CropRight", new Float(pfloat));
	}

	public float getCropTop() throws COMException
	{
		return ((Float) get("CropTop")).floatValue();
	}

	public void setCropTop(float pfloat) throws COMException
	{
		put("CropTop", new Float(pfloat));
	}

	public int getTransparencyColor() throws COMException
	{
		return ((Integer) get("TransparencyColor")).intValue();
	}

	public void setTransparencyColor(int pint) throws COMException
	{
		put("TransparencyColor", new Integer(pint));
	}

	public int getTransparentBackground() throws COMException
	{
		return ((Integer) get("TransparentBackground")).intValue();
	}

	public void setTransparentBackground(int pint) throws COMException
	{
		put("TransparentBackground", new Integer(pint));
	}


}
