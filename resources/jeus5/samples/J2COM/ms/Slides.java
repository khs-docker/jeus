/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Slides extends DispatchPtr
{
	public Slides(String progid) throws COMException { super(progid);}
	public Slides(IUnknown other) throws COMException { super(other);}

	public Slides(GUID ClsID) throws COMException { super(ClsID);}

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

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public _Slide Item(Object index) throws COMException
	{
		return (new _Slide((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public _Slide FindBySlideID(int SlideID) throws COMException
	{
		return (new _Slide((DispatchPtr)invokeN("FindBySlideID", new Object[] {new Integer(SlideID)})));
	}

	public _Slide Add(int index, int Layout) throws COMException
	{
		return (new _Slide((DispatchPtr)invokeN("Add", new Object[] {new Integer(index), new Integer(Layout)})));
	}

	public int InsertFromFile(String FileName, int index, int SlideStart, int SlideEnd) throws COMException
	{
		return ((Integer)invokeN("InsertFromFile", new Object[] {FileName, new Integer(index), new Integer(SlideStart), new Integer(SlideEnd)})).intValue();
	}



	public SlideRange Paste(int index) throws COMException
	{
		return (new SlideRange((DispatchPtr)invokeN("Paste", new Object[] {new Integer(index)})));
	}


}
