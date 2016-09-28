/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class TextFrame extends DispatchPtr
{
	public TextFrame(String progid) throws COMException { super(progid);}
	public TextFrame(IUnknown other) throws COMException { super(other);}

	public TextFrame(GUID ClsID) throws COMException { super(ClsID);}

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

	public float getMarginBottom() throws COMException
	{
		return ((Float) get("MarginBottom")).floatValue();
	}

	public void setMarginBottom(float pfloat) throws COMException
	{
		put("MarginBottom", new Float(pfloat));
	}

	public float getMarginLeft() throws COMException
	{
		return ((Float) get("MarginLeft")).floatValue();
	}

	public void setMarginLeft(float pfloat) throws COMException
	{
		put("MarginLeft", new Float(pfloat));
	}

	public float getMarginRight() throws COMException
	{
		return ((Float) get("MarginRight")).floatValue();
	}

	public void setMarginRight(float pfloat) throws COMException
	{
		put("MarginRight", new Float(pfloat));
	}

	public float getMarginTop() throws COMException
	{
		return ((Float) get("MarginTop")).floatValue();
	}

	public void setMarginTop(float pfloat) throws COMException
	{
		put("MarginTop", new Float(pfloat));
	}

	public int getOrientation() throws COMException
	{
		return ((Integer) get("Orientation")).intValue();
	}

	public void setOrientation(int pint) throws COMException
	{
		put("Orientation", new Integer(pint));
	}

	public int getHasText() throws COMException
	{
		return ((Integer) get("HasText")).intValue();
	}

	public TextRange getTextRange() throws COMException
	{
		return ( new TextRange((DispatchPtr)  get("TextRange")));
	}

	public Ruler getRuler() throws COMException
	{
		return ( new Ruler((DispatchPtr)  get("Ruler")));
	}

	public int getHorizontalAnchor() throws COMException
	{
		return ((Integer) get("HorizontalAnchor")).intValue();
	}

	public void setHorizontalAnchor(int pint) throws COMException
	{
		put("HorizontalAnchor", new Integer(pint));
	}

	public int getVerticalAnchor() throws COMException
	{
		return ((Integer) get("VerticalAnchor")).intValue();
	}

	public void setVerticalAnchor(int pint) throws COMException
	{
		put("VerticalAnchor", new Integer(pint));
	}

	public int getAutoSize() throws COMException
	{
		return ((Integer) get("AutoSize")).intValue();
	}

	public void setAutoSize(int pint) throws COMException
	{
		put("AutoSize", new Integer(pint));
	}

	public int getWordWrap() throws COMException
	{
		return ((Integer) get("WordWrap")).intValue();
	}

	public void setWordWrap(int pint) throws COMException
	{
		put("WordWrap", new Integer(pint));
	}

	public void DeleteText() throws COMException
	{
		invoke("DeleteText");
	}


}
