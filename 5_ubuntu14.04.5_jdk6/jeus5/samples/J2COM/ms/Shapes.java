/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Shapes extends DispatchPtr
{
	public Shapes(String progid) throws COMException { super(progid);}
	public Shapes(IUnknown other) throws COMException { super(other);}

	public Shapes(GUID ClsID) throws COMException { super(ClsID);}

	public DispatchPtr getApplication() throws COMException
	{
		return (DispatchPtr) get("Application");
	}

	public int getCreator() throws COMException
	{
		return ((Integer) get("Creator")).intValue();
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getCount() throws COMException
	{
		return ((Integer) get("Count")).intValue();
	}

	public Shape Item(Object index) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("Item", new Object[] {index})));
	}

	public IUnknown get_NewEnum() throws COMException
	{
		return (IUnknown) get("_NewEnum");
	}

	public Shape AddCallout(int Type, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddCallout", new Object[] {new Integer(Type), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public Shape AddConnector(int Type, float BeginX, float BeginY, float EndX, float EndY) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddConnector", new Object[] {new Integer(Type), new Float(BeginX), new Float(BeginY), new Float(EndX), new Float(EndY)})));
	}

	public Shape AddCurve(Object SafeArrayOfPoints) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddCurve", new Object[] {SafeArrayOfPoints})));
	}

	public Shape AddLabel(int Orientation, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddLabel", new Object[] {new Integer(Orientation), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public Shape AddLine(float BeginX, float BeginY, float EndX, float EndY) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddLine", new Object[] {new Float(BeginX), new Float(BeginY), new Float(EndX), new Float(EndY)})));
	}

	public Shape AddPicture(String FileName, int LinkToFile, int SaveWithDocument, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddPicture", new Object[] {FileName, new Integer(LinkToFile), new Integer(SaveWithDocument), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public Shape AddPolyline(Object SafeArrayOfPoints) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddPolyline", new Object[] {SafeArrayOfPoints})));
	}

	public Shape AddShape(int Type, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddShape", new Object[] {new Integer(Type), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public Shape AddTextEffect(int PresetTextEffect, String Text, String FontName, float FontSize, int FontBold, int FontItalic, float Left, float Top) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddTextEffect", new Object[] {new Integer(PresetTextEffect), Text, FontName, new Float(FontSize), new Integer(FontBold), new Integer(FontItalic), new Float(Left), new Float(Top)})));
	}

	public Shape AddTextbox(int Orientation, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddTextbox", new Object[] {new Integer(Orientation), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public FreeformBuilder BuildFreeform(int EditingType, float X1, float Y1) throws COMException
	{
		return (new FreeformBuilder((DispatchPtr)invokeN("BuildFreeform", new Object[] {new Integer(EditingType), new Float(X1), new Float(Y1)})));
	}

	public void SelectAll() throws COMException
	{
		invoke("SelectAll");
	}



	public int getHasTitle() throws COMException
	{
		return ((Integer) get("HasTitle")).intValue();
	}

	public Shape AddTitle() throws COMException
	{
		return (new Shape((DispatchPtr)invoke("AddTitle")));
	}

	public Shape getTitle() throws COMException
	{
		return ( new Shape((DispatchPtr)  get("Title")));
	}

	public Placeholders getPlaceholders() throws COMException
	{
		return ( new Placeholders((DispatchPtr)  get("Placeholders")));
	}

	public Shape AddOLEObject(float Left, float Top, float Width, float Height, String ClassName, String FileName, int DisplayAsIcon, String IconFileName, int IconIndex, String IconLabel, int Link) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddOLEObject", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height), ClassName, FileName, new Integer(DisplayAsIcon), IconFileName, new Integer(IconIndex), IconLabel, new Integer(Link)})));
	}

	public Shape AddComment(float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddComment", new Object[] {new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public Shape AddPlaceholder(int Type, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddPlaceholder", new Object[] {new Integer(Type), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public Shape AddMediaObject(String FileName, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddMediaObject", new Object[] {FileName, new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}

	public ShapeRange Paste() throws COMException
	{
		return (new ShapeRange((DispatchPtr)invoke("Paste")));
	}

	public Shape AddTable(int NumRows, int NumColumns, float Left, float Top, float Width, float Height) throws COMException
	{
		return (new Shape((DispatchPtr)invokeN("AddTable", new Object[] {new Integer(NumRows), new Integer(NumColumns), new Float(Left), new Float(Top), new Float(Width), new Float(Height)})));
	}


}
