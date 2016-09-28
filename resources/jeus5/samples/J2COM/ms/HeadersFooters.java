/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class HeadersFooters extends DispatchPtr
{
	public HeadersFooters(String progid) throws COMException { super(progid);}
	public HeadersFooters(IUnknown other) throws COMException { super(other);}

	public HeadersFooters(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public HeaderFooter getDateAndTime() throws COMException
	{
		return ( new HeaderFooter((DispatchPtr)  get("DateAndTime")));
	}

	public HeaderFooter getSlideNumber() throws COMException
	{
		return ( new HeaderFooter((DispatchPtr)  get("SlideNumber")));
	}

	public HeaderFooter getHeader() throws COMException
	{
		return ( new HeaderFooter((DispatchPtr)  get("Header")));
	}

	public HeaderFooter getFooter() throws COMException
	{
		return ( new HeaderFooter((DispatchPtr)  get("Footer")));
	}

	public int getDisplayOnTitleSlide() throws COMException
	{
		return ((Integer) get("DisplayOnTitleSlide")).intValue();
	}

	public void setDisplayOnTitleSlide(int pint) throws COMException
	{
		put("DisplayOnTitleSlide", new Integer(pint));
	}

	public void Clear() throws COMException
	{
		invoke("Clear");
	}


}
