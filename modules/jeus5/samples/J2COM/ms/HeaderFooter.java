/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class HeaderFooter extends DispatchPtr
{
	public HeaderFooter(String progid) throws COMException { super(progid);}
	public HeaderFooter(IUnknown other) throws COMException { super(other);}

	public HeaderFooter(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public String getText() throws COMException
	{
		return (String) get("Text");
	}

	public void setText(String pString) throws COMException
	{
		put("Text", pString);
	}

	public int getUseFormat() throws COMException
	{
		return ((Integer) get("UseFormat")).intValue();
	}

	public void setUseFormat(int pint) throws COMException
	{
		put("UseFormat", new Integer(pint));
	}

	public int getFormat() throws COMException
	{
		return ((Integer) get("Format")).intValue();
	}

	public void setFormat(int pint) throws COMException
	{
		put("Format", new Integer(pint));
	}


}
