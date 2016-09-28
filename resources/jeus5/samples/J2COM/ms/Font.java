/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Font extends DispatchPtr
{
	public Font(String progid) throws COMException { super(progid);}
	public Font(IUnknown other) throws COMException { super(other);}

	public Font(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public ColorFormat getColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("Color")));
	}

	public int getBold() throws COMException
	{
		return ((Integer) get("Bold")).intValue();
	}

	public void setBold(int pint) throws COMException
	{
		put("Bold", new Integer(pint));
	}

	public int getItalic() throws COMException
	{
		return ((Integer) get("Italic")).intValue();
	}

	public void setItalic(int pint) throws COMException
	{
		put("Italic", new Integer(pint));
	}

	public int getShadow() throws COMException
	{
		return ((Integer) get("Shadow")).intValue();
	}

	public void setShadow(int pint) throws COMException
	{
		put("Shadow", new Integer(pint));
	}

	public int getEmboss() throws COMException
	{
		return ((Integer) get("Emboss")).intValue();
	}

	public void setEmboss(int pint) throws COMException
	{
		put("Emboss", new Integer(pint));
	}

	public int getUnderline() throws COMException
	{
		return ((Integer) get("Underline")).intValue();
	}

	public void setUnderline(int pint) throws COMException
	{
		put("Underline", new Integer(pint));
	}

	public int getSubscript() throws COMException
	{
		return ((Integer) get("Subscript")).intValue();
	}

	public void setSubscript(int pint) throws COMException
	{
		put("Subscript", new Integer(pint));
	}

	public int getSuperscript() throws COMException
	{
		return ((Integer) get("Superscript")).intValue();
	}

	public void setSuperscript(int pint) throws COMException
	{
		put("Superscript", new Integer(pint));
	}

	public float getBaselineOffset() throws COMException
	{
		return ((Float) get("BaselineOffset")).floatValue();
	}

	public void setBaselineOffset(float pfloat) throws COMException
	{
		put("BaselineOffset", new Float(pfloat));
	}

	public int getEmbedded() throws COMException
	{
		return ((Integer) get("Embedded")).intValue();
	}

	public int getEmbeddable() throws COMException
	{
		return ((Integer) get("Embeddable")).intValue();
	}

	public float getSize() throws COMException
	{
		return ((Float) get("Size")).floatValue();
	}

	public void setSize(float pfloat) throws COMException
	{
		put("Size", new Float(pfloat));
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public String getNameFarEast() throws COMException
	{
		return (String) get("NameFarEast");
	}

	public void setNameFarEast(String pString) throws COMException
	{
		put("NameFarEast", pString);
	}

	public String getNameAscii() throws COMException
	{
		return (String) get("NameAscii");
	}

	public void setNameAscii(String pString) throws COMException
	{
		put("NameAscii", pString);
	}

	public int getAutoRotateNumbers() throws COMException
	{
		return ((Integer) get("AutoRotateNumbers")).intValue();
	}

	public void setAutoRotateNumbers(int pint) throws COMException
	{
		put("AutoRotateNumbers", new Integer(pint));
	}

	public String getNameOther() throws COMException
	{
		return (String) get("NameOther");
	}

	public void setNameOther(String pString) throws COMException
	{
		put("NameOther", pString);
	}

	public String getNameComplexScript() throws COMException
	{
		return (String) get("NameComplexScript");
	}

	public void setNameComplexScript(String pString) throws COMException
	{
		put("NameComplexScript", pString);
	}


}
