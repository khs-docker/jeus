/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPControls extends DispatchPtr
{
	public PPControls(String progid) throws COMException { super(progid);}
	public PPControls(IUnknown other) throws COMException { super(other);}

	public PPControls(GUID ClsID) throws COMException { super(ClsID);}

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

	public PPControl Item(Object index) throws COMException
	{
		return (new PPControl((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public PPPushButton AddPushButton(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPPushButton((DispatchPtr)invokeN("AddPushButton", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPToggleButton AddToggleButton(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPToggleButton((DispatchPtr)invokeN("AddToggleButton", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPBitmapButton AddBitmapButton(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPBitmapButton((DispatchPtr)invokeN("AddBitmapButton", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPListBox AddListBox(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPListBox((DispatchPtr)invokeN("AddListBox", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPCheckBox AddCheckBox(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPCheckBox((DispatchPtr)invokeN("AddCheckBox", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPRadioCluster AddRadioCluster(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPRadioCluster((DispatchPtr)invokeN("AddRadioCluster", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPStaticText AddStaticText(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPStaticText((DispatchPtr)invokeN("AddStaticText", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}



	public PPIcon AddIcon(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPIcon((DispatchPtr)invokeN("AddIcon", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPBitmap AddBitmap(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPBitmap((DispatchPtr)invokeN("AddBitmap", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPSpinner AddSpinner(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPSpinner((DispatchPtr)invokeN("AddSpinner", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPScrollBar AddScrollBar(int Style, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPScrollBar((DispatchPtr)invokeN("AddScrollBar", new Object[] {new Integer(Style), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPGroupBox AddGroupBox(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPGroupBox((DispatchPtr)invokeN("AddGroupBox", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPDropDown AddDropDown(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPDropDown((DispatchPtr)invokeN("AddDropDown", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPDropDownEdit AddDropDownEdit(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPDropDownEdit((DispatchPtr)invokeN("AddDropDownEdit", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPSlideMiniature AddMiniature(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPSlideMiniature((DispatchPtr)invokeN("AddMiniature", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public PPFrame AddFrame(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new PPFrame((DispatchPtr)invokeN("AddFrame", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}


}
