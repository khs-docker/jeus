/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class _Master extends DispatchPtr
{
	public _Master(String progid) throws COMException { super(progid);}
	public _Master(IUnknown other) throws COMException { super(other);}

	public _Master(GUID ClsID) throws COMException { super(ClsID);}

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

	public void Delete() throws COMException
	{
		invoke("Delete");
	}

	public float getHeight() throws COMException
	{
		return ((Float) get("Height")).floatValue();
	}

	public float getWidth() throws COMException
	{
		return ((Float) get("Width")).floatValue();
	}

	public TextStyles getTextStyles() throws COMException
	{
		return ( new TextStyles((DispatchPtr)  get("TextStyles")));
	}

	public Hyperlinks getHyperlinks() throws COMException
	{
		return ( new Hyperlinks((DispatchPtr)  get("Hyperlinks")));
	}

	public DispatchPtr getScripts() throws COMException
	{
		return ((DispatchPtr) get("Scripts"));
	}


}
