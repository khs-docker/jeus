/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class FillFormat extends DispatchPtr
{
	public FillFormat(String progid) throws COMException { super(progid);}
	public FillFormat(IUnknown other) throws COMException { super(other);}

	public FillFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public void Background() throws COMException
	{
		invoke("Background");
	}

	public void OneColorGradient(int Style, int Variant, float Degree) throws COMException
	{
		invokeN("OneColorGradient", new Object[] {new Integer(Style), new Integer(Variant), new Float(Degree)});
	}

	public void Patterned(int Pattern) throws COMException
	{
		invokeN("Patterned", new Object[] {new Integer(Pattern)});
	}

	public void PresetGradient(int Style, int Variant, int PresetGradientType) throws COMException
	{
		invokeN("PresetGradient", new Object[] {new Integer(Style), new Integer(Variant), new Integer(PresetGradientType)});
	}

	public void PresetTextured(int PresetTexture) throws COMException
	{
		invokeN("PresetTextured", new Object[] {new Integer(PresetTexture)});
	}

	public void Solid() throws COMException
	{
		invoke("Solid");
	}

	public void TwoColorGradient(int Style, int Variant) throws COMException
	{
		invokeN("TwoColorGradient", new Object[] {new Integer(Style), new Integer(Variant)});
	}

	public void UserPicture(String PictureFile) throws COMException
	{
		invokeN("UserPicture", new Object[] {PictureFile});
	}

	public void UserTextured(String TextureFile) throws COMException
	{
		invokeN("UserTextured", new Object[] {TextureFile});
	}

	public ColorFormat getBackColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("BackColor")));
	}

	public void setBackColor(ColorFormat pColorFormat) throws COMException
	{
		put("BackColor", pColorFormat);
	}

	public ColorFormat getForeColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("ForeColor")));
	}

	public void setForeColor(ColorFormat pColorFormat) throws COMException
	{
		put("ForeColor", pColorFormat);
	}

	public int getGradientColorType() throws COMException
	{
		return ((Integer) get("GradientColorType")).intValue();
	}

	public float getGradientDegree() throws COMException
	{
		return ((Float) get("GradientDegree")).floatValue();
	}

	public int getGradientStyle() throws COMException
	{
		return ((Integer) get("GradientStyle")).intValue();
	}

	public int getGradientVariant() throws COMException
	{
		return ((Integer) get("GradientVariant")).intValue();
	}

	public int getPattern() throws COMException
	{
		return ((Integer) get("Pattern")).intValue();
	}

	public int getPresetGradientType() throws COMException
	{
		return ((Integer) get("PresetGradientType")).intValue();
	}

	public int getPresetTexture() throws COMException
	{
		return ((Integer) get("PresetTexture")).intValue();
	}

	public String getTextureName() throws COMException
	{
		return (String) get("TextureName");
	}

	public int getTextureType() throws COMException
	{
		return ((Integer) get("TextureType")).intValue();
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

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}


}
