/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class TextEffectFormat extends DispatchPtr
{
	public TextEffectFormat(String progid) throws COMException { super(progid);}
	public TextEffectFormat(IUnknown other) throws COMException { super(other);}

	public TextEffectFormat(GUID ClsID) throws COMException { super(ClsID);}

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

	public void ToggleVerticalText() throws COMException
	{
		invoke("ToggleVerticalText");
	}

	public int getAlignment() throws COMException
	{
		return ((Integer) get("Alignment")).intValue();
	}

	public void setAlignment(int pint) throws COMException
	{
		put("Alignment", new Integer(pint));
	}

	public int getFontBold() throws COMException
	{
		return ((Integer) get("FontBold")).intValue();
	}

	public void setFontBold(int pint) throws COMException
	{
		put("FontBold", new Integer(pint));
	}

	public int getFontItalic() throws COMException
	{
		return ((Integer) get("FontItalic")).intValue();
	}

	public void setFontItalic(int pint) throws COMException
	{
		put("FontItalic", new Integer(pint));
	}

	public String getFontName() throws COMException
	{
		return (String) get("FontName");
	}

	public void setFontName(String pString) throws COMException
	{
		put("FontName", pString);
	}

	public float getFontSize() throws COMException
	{
		return ((Float) get("FontSize")).floatValue();
	}

	public void setFontSize(float pfloat) throws COMException
	{
		put("FontSize", new Float(pfloat));
	}

	public int getKernedPairs() throws COMException
	{
		return ((Integer) get("KernedPairs")).intValue();
	}

	public void setKernedPairs(int pint) throws COMException
	{
		put("KernedPairs", new Integer(pint));
	}

	public int getNormalizedHeight() throws COMException
	{
		return ((Integer) get("NormalizedHeight")).intValue();
	}

	public void setNormalizedHeight(int pint) throws COMException
	{
		put("NormalizedHeight", new Integer(pint));
	}

	public int getPresetShape() throws COMException
	{
		return ((Integer) get("PresetShape")).intValue();
	}

	public void setPresetShape(int pint) throws COMException
	{
		put("PresetShape", new Integer(pint));
	}

	public int getPresetTextEffect() throws COMException
	{
		return ((Integer) get("PresetTextEffect")).intValue();
	}

	public void setPresetTextEffect(int pint) throws COMException
	{
		put("PresetTextEffect", new Integer(pint));
	}

	public int getRotatedChars() throws COMException
	{
		return ((Integer) get("RotatedChars")).intValue();
	}

	public void setRotatedChars(int pint) throws COMException
	{
		put("RotatedChars", new Integer(pint));
	}

	public String getText() throws COMException
	{
		return (String) get("Text");
	}

	public void setText(String pString) throws COMException
	{
		put("Text", pString);
	}

	public float getTracking() throws COMException
	{
		return ((Float) get("Tracking")).floatValue();
	}

	public void setTracking(float pfloat) throws COMException
	{
		put("Tracking", new Float(pfloat));
	}


}
