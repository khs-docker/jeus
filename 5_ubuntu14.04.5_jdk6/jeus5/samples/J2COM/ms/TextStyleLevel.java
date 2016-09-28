/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class TextStyleLevel extends DispatchPtr
{
	public TextStyleLevel(String progid) throws COMException { super(progid);}
	public TextStyleLevel(IUnknown other) throws COMException { super(other);}

	public TextStyleLevel(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public ParagraphFormat getParagraphFormat() throws COMException
	{
		return ( new ParagraphFormat((DispatchPtr)  get("ParagraphFormat")));
	}

	public Font getFont() throws COMException
	{
		return ( new Font((DispatchPtr)  get("Font")));
	}


}
