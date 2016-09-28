/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PageSetup extends DispatchPtr
{
	public PageSetup(String progid) throws COMException { super(progid);}
	public PageSetup(IUnknown other) throws COMException { super(other);}

	public PageSetup(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getFirstSlideNumber() throws COMException
	{
		return ((Integer) get("FirstSlideNumber")).intValue();
	}

	public void setFirstSlideNumber(int pint) throws COMException
	{
		put("FirstSlideNumber", new Integer(pint));
	}

	public float getSlideHeight() throws COMException
	{
		return ((Float) get("SlideHeight")).floatValue();
	}

	public void setSlideHeight(float pfloat) throws COMException
	{
		put("SlideHeight", new Float(pfloat));
	}

	public float getSlideWidth() throws COMException
	{
		return ((Float) get("SlideWidth")).floatValue();
	}

	public void setSlideWidth(float pfloat) throws COMException
	{
		put("SlideWidth", new Float(pfloat));
	}

	public int getSlideSize() throws COMException
	{
		return ((Integer) get("SlideSize")).intValue();
	}

	public void setSlideSize(int pint) throws COMException
	{
		put("SlideSize", new Integer(pint));
	}

	public int getNotesOrientation() throws COMException
	{
		return ((Integer) get("NotesOrientation")).intValue();
	}

	public void setNotesOrientation(int pint) throws COMException
	{
		put("NotesOrientation", new Integer(pint));
	}

	public int getSlideOrientation() throws COMException
	{
		return ((Integer) get("SlideOrientation")).intValue();
	}

	public void setSlideOrientation(int pint) throws COMException
	{
		put("SlideOrientation", new Integer(pint));
	}


}
