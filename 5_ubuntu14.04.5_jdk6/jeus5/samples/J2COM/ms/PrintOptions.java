/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PrintOptions extends DispatchPtr
{
	public PrintOptions(String progid) throws COMException { super(progid);}
	public PrintOptions(IUnknown other) throws COMException { super(other);}

	public PrintOptions(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public int getPrintColorType() throws COMException
	{
		return ((Integer) get("PrintColorType")).intValue();
	}

	public void setPrintColorType(int pint) throws COMException
	{
		put("PrintColorType", new Integer(pint));
	}

	public int getCollate() throws COMException
	{
		return ((Integer) get("Collate")).intValue();
	}

	public void setCollate(int pint) throws COMException
	{
		put("Collate", new Integer(pint));
	}

	public int getFitToPage() throws COMException
	{
		return ((Integer) get("FitToPage")).intValue();
	}

	public void setFitToPage(int pint) throws COMException
	{
		put("FitToPage", new Integer(pint));
	}

	public int getFrameSlides() throws COMException
	{
		return ((Integer) get("FrameSlides")).intValue();
	}

	public void setFrameSlides(int pint) throws COMException
	{
		put("FrameSlides", new Integer(pint));
	}

	public int getNumberOfCopies() throws COMException
	{
		return ((Integer) get("NumberOfCopies")).intValue();
	}

	public void setNumberOfCopies(int pint) throws COMException
	{
		put("NumberOfCopies", new Integer(pint));
	}

	public int getOutputType() throws COMException
	{
		return ((Integer) get("OutputType")).intValue();
	}

	public void setOutputType(int pint) throws COMException
	{
		put("OutputType", new Integer(pint));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getPrintHiddenSlides() throws COMException
	{
		return ((Integer) get("PrintHiddenSlides")).intValue();
	}

	public void setPrintHiddenSlides(int pint) throws COMException
	{
		put("PrintHiddenSlides", new Integer(pint));
	}

	public int getPrintInBackground() throws COMException
	{
		return ((Integer) get("PrintInBackground")).intValue();
	}

	public void setPrintInBackground(int pint) throws COMException
	{
		put("PrintInBackground", new Integer(pint));
	}

	public int getRangeType() throws COMException
	{
		return ((Integer) get("RangeType")).intValue();
	}

	public void setRangeType(int pint) throws COMException
	{
		put("RangeType", new Integer(pint));
	}

	public PrintRanges getRanges() throws COMException
	{
		return ( new PrintRanges((DispatchPtr)  get("Ranges")));
	}

	public int getPrintFontsAsGraphics() throws COMException
	{
		return ((Integer) get("PrintFontsAsGraphics")).intValue();
	}

	public void setPrintFontsAsGraphics(int pint) throws COMException
	{
		put("PrintFontsAsGraphics", new Integer(pint));
	}

	public String getSlideShowName() throws COMException
	{
		return (String) get("SlideShowName");
	}

	public void setSlideShowName(String pString) throws COMException
	{
		put("SlideShowName", pString);
	}

	public String getActivePrinter() throws COMException
	{
		return (String) get("ActivePrinter");
	}

	public void setActivePrinter(String pString) throws COMException
	{
		put("ActivePrinter", pString);
	}

	public int getHandoutOrder() throws COMException
	{
		return ((Integer) get("HandoutOrder")).intValue();
	}

	public void setHandoutOrder(int pint) throws COMException
	{
		put("HandoutOrder", new Integer(pint));
	}


}
