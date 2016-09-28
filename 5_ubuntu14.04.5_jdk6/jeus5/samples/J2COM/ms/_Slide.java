/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class _Slide extends DispatchPtr
{
	public _Slide(String progid) throws COMException { super(progid);}
	public _Slide(IUnknown other) throws COMException { super(other);}

	public _Slide(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public Shapes getShapes() throws COMException
	{
		return ( new Shapes((DispatchPtr)  get("Shapes")));
	}

	public HeadersFooters getHeadersFooters() throws COMException
	{
		return ( new HeadersFooters((DispatchPtr)  get("HeadersFooters")));
	}

	public SlideShowTransition getSlideShowTransition() throws COMException
	{
		return ( new SlideShowTransition((DispatchPtr)  get("SlideShowTransition")));
	}

	public ColorScheme getColorScheme() throws COMException
	{
		return ( new ColorScheme((DispatchPtr)  get("ColorScheme")));
	}

	public void setColorScheme(ColorScheme pColorScheme) throws COMException
	{
		put("ColorScheme", pColorScheme);
	}

	public ShapeRange getBackground() throws COMException
	{
		return ( new ShapeRange((DispatchPtr)  get("Background")));
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public int getSlideID() throws COMException
	{
		return ((Integer) get("SlideID")).intValue();
	}

	public int getPrintSteps() throws COMException
	{
		return ((Integer) get("PrintSteps")).intValue();
	}

	public void Select() throws COMException
	{
		invoke("Select");
	}

	public void Cut() throws COMException
	{
		invoke("Cut");
	}

	public void Copy() throws COMException
	{
		invoke("Copy");
	}

	public int getLayout() throws COMException
	{
		return ((Integer) get("Layout")).intValue();
	}

	public void setLayout(int pint) throws COMException
	{
		put("Layout", new Integer(pint));
	}

	public SlideRange Duplicate() throws COMException
	{
		return (new SlideRange((DispatchPtr)invoke("Duplicate")));
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}

	public Tags getTags() throws COMException
	{
		return ( new Tags((DispatchPtr)  get("Tags")));
	}

	public int getSlideIndex() throws COMException
	{
		return ((Integer) get("SlideIndex")).intValue();
	}

	public int getSlideNumber() throws COMException
	{
		return ((Integer) get("SlideNumber")).intValue();
	}

	public int getDisplayMasterShapes() throws COMException
	{
		return ((Integer) get("DisplayMasterShapes")).intValue();
	}

	public void setDisplayMasterShapes(int pint) throws COMException
	{
		put("DisplayMasterShapes", new Integer(pint));
	}

	public int getFollowMasterBackground() throws COMException
	{
		return ((Integer) get("FollowMasterBackground")).intValue();
	}

	public void setFollowMasterBackground(int pint) throws COMException
	{
		put("FollowMasterBackground", new Integer(pint));
	}

	public SlideRange getNotesPage() throws COMException
	{
		return ( new SlideRange((DispatchPtr)  get("NotesPage")));
	}

	public _Master getMaster() throws COMException
	{
		return ( new _Master((DispatchPtr)  get("Master")));
	}

	public Hyperlinks getHyperlinks() throws COMException
	{
		return ( new Hyperlinks((DispatchPtr)  get("Hyperlinks")));
	}

	public void Export(String FileName, String FilterName, int ScaleWidth, int ScaleHeight) throws COMException
	{
		invokeN("Export", new Object[] {FileName, FilterName, new Integer(ScaleWidth), new Integer(ScaleHeight)});
	}

	public DispatchPtr getScripts() throws COMException
	{
		return ((DispatchPtr) get("Scripts"));
	}


}
