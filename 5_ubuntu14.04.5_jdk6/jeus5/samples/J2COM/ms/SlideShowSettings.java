/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class SlideShowSettings extends DispatchPtr
{
	public SlideShowSettings(String progid) throws COMException { super(progid);}
	public SlideShowSettings(IUnknown other) throws COMException { super(other);}

	public SlideShowSettings(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public ColorFormat getPointerColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("PointerColor")));
	}

	public NamedSlideShows getNamedSlideShows() throws COMException
	{
		return ( new NamedSlideShows((DispatchPtr)  get("NamedSlideShows")));
	}

	public int getStartingSlide() throws COMException
	{
		return ((Integer) get("StartingSlide")).intValue();
	}

	public void setStartingSlide(int pint) throws COMException
	{
		put("StartingSlide", new Integer(pint));
	}

	public int getEndingSlide() throws COMException
	{
		return ((Integer) get("EndingSlide")).intValue();
	}

	public void setEndingSlide(int pint) throws COMException
	{
		put("EndingSlide", new Integer(pint));
	}

	public int getAdvanceMode() throws COMException
	{
		return ((Integer) get("AdvanceMode")).intValue();
	}

	public void setAdvanceMode(int pint) throws COMException
	{
		put("AdvanceMode", new Integer(pint));
	}

	public SlideShowWindow Run() throws COMException
	{
		return (new SlideShowWindow((DispatchPtr)invoke("Run")));
	}

	public int getLoopUntilStopped() throws COMException
	{
		return ((Integer) get("LoopUntilStopped")).intValue();
	}

	public void setLoopUntilStopped(int pint) throws COMException
	{
		put("LoopUntilStopped", new Integer(pint));
	}

	public int getShowType() throws COMException
	{
		return ((Integer) get("ShowType")).intValue();
	}

	public void setShowType(int pint) throws COMException
	{
		put("ShowType", new Integer(pint));
	}

	public int getShowWithNarration() throws COMException
	{
		return ((Integer) get("ShowWithNarration")).intValue();
	}

	public void setShowWithNarration(int pint) throws COMException
	{
		put("ShowWithNarration", new Integer(pint));
	}

	public int getShowWithAnimation() throws COMException
	{
		return ((Integer) get("ShowWithAnimation")).intValue();
	}

	public void setShowWithAnimation(int pint) throws COMException
	{
		put("ShowWithAnimation", new Integer(pint));
	}

	public String getSlideShowName() throws COMException
	{
		return (String) get("SlideShowName");
	}

	public void setSlideShowName(String pString) throws COMException
	{
		put("SlideShowName", pString);
	}

	public int getRangeType() throws COMException
	{
		return ((Integer) get("RangeType")).intValue();
	}

	public void setRangeType(int pint) throws COMException
	{
		put("RangeType", new Integer(pint));
	}


}
