/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Selection extends DispatchPtr
{
	public Selection(String progid) throws COMException { super(progid);}
	public Selection(IUnknown other) throws COMException { super(other);}

	public Selection(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public void Cut() throws COMException
	{
		invoke("Cut");
	}

	public void Copy() throws COMException
	{
		invoke("Copy");
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}

	public void Unselect() throws COMException
	{
		invoke("Unselect");
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public SlideRange getSlideRange() throws COMException
	{
		return ( new SlideRange((DispatchPtr)  get("SlideRange")));
	}

	public ShapeRange getShapeRange() throws COMException
	{
		return ( new ShapeRange((DispatchPtr)  get("ShapeRange")));
	}

	public TextRange getTextRange() throws COMException
	{
		return ( new TextRange((DispatchPtr)  get("TextRange")));
	}


}
