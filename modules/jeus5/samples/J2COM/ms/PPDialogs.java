/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPDialogs extends DispatchPtr
{
	public PPDialogs(String progid) throws COMException { super(progid);}
	public PPDialogs(IUnknown other) throws COMException { super(other);}

	public PPDialogs(GUID ClsID) throws COMException { super(ClsID);}

	public IUnknown get_NewEnum() throws COMException
	{
		return (IUnknown) get("_NewEnum");
	}

	public Object _Index(int index) throws COMException
	{
		return invokeN("_Index", new Object[] {new Integer(index)});
	}

	public int getCount() throws COMException
	{
		return ((Integer) get("Count")).intValue();
	}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public PPDialog Item(Object index) throws COMException
	{
		return (new PPDialog((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public PPDialog AddDialog(float Left, float Top, float Width, float Height, int Modal, IUnknown ParentWindow, int Position, int DisplayHelp) throws COMException
	{
		return (new PPDialog((DispatchPtr)invokeN("AddDialog", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height), new Integer(Modal), ParentWindow, new Integer(Position), new Integer(DisplayHelp)})));
	}

	public PPDialog AddTabDialog(float Left, float Top, float Width, float Height, int Modal, IUnknown ParentWindow, int Position, int DisplayHelp) throws COMException
	{
		return (new PPDialog((DispatchPtr)invokeN("AddTabDialog", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height), new Integer(Modal), ParentWindow, new Integer(Position), new Integer(DisplayHelp)})));
	}

	public PPDialog LoadDialog(String resourceDLL, int nResID, int bModal, IUnknown ParentWindow, int Position) throws COMException
	{
		return (new PPDialog((DispatchPtr)invokeN("LoadDialog", new Object[] {resourceDLL, new Integer(nResID), new Integer(bModal), ParentWindow, new Integer(Position)})));
	}

	public PPAlert AddAlert() throws COMException
	{
		return (new PPAlert((DispatchPtr)invoke("AddAlert")));
	}

	public Tags getTags() throws COMException
	{
		return ( new Tags((DispatchPtr)  get("Tags")));
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public int RunCharacterAlert(String Text, int Type, int icon, IUnknown ParentWindow) throws COMException
	{
		return ((Integer)invokeN("RunCharacterAlert", new Object[] {Text, new Integer(Type), new Integer(icon), ParentWindow})).intValue();
	}


}
