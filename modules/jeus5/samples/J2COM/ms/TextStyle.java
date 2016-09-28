/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class TextStyle extends DispatchPtr
{
	public TextStyle(String progid) throws COMException { super(progid);}
	public TextStyle(IUnknown other) throws COMException { super(other);}

	public TextStyle(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public Ruler getRuler() throws COMException
	{
		return ( new Ruler((DispatchPtr)  get("Ruler")));
	}

	public TextFrame getTextFrame() throws COMException
	{
		return ( new TextFrame((DispatchPtr)  get("TextFrame")));
	}

	public TextStyleLevels getLevels() throws COMException
	{
		return ( new TextStyleLevels((DispatchPtr)  get("Levels")));
	}


}
