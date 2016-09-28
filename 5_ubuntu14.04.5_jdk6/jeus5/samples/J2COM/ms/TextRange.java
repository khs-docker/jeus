/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class TextRange extends DispatchPtr
{
	public TextRange(String progid) throws COMException { super(progid);}
	public TextRange(IUnknown other) throws COMException { super(other);}

	public TextRange(GUID ClsID) throws COMException { super(ClsID);}

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

	public ActionSettings getActionSettings() throws COMException
	{
		return ( new ActionSettings((DispatchPtr)  get("ActionSettings")));
	}

	public int getStart() throws COMException
	{
		return ((Integer) get("Start")).intValue();
	}

	public int getLength() throws COMException
	{
		return ((Integer) get("Length")).intValue();
	}

	public float getBoundLeft() throws COMException
	{
		return ((Float) get("BoundLeft")).floatValue();
	}

	public float getBoundTop() throws COMException
	{
		return ((Float) get("BoundTop")).floatValue();
	}

	public float getBoundWidth() throws COMException
	{
		return ((Float) get("BoundWidth")).floatValue();
	}

	public float getBoundHeight() throws COMException
	{
		return ((Float) get("BoundHeight")).floatValue();
	}

	public TextRange Paragraphs(int Start, int Length) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Paragraphs", new Object[] {new Integer(Start), new Integer(Length)})));
	}

	public TextRange Sentences(int Start, int Length) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Sentences", new Object[] {new Integer(Start), new Integer(Length)})));
	}

	public TextRange Words(int Start, int Length) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Words", new Object[] {new Integer(Start), new Integer(Length)})));
	}

	public TextRange Characters(int Start, int Length) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Characters", new Object[] {new Integer(Start), new Integer(Length)})));
	}

	public TextRange Lines(int Start, int Length) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Lines", new Object[] {new Integer(Start), new Integer(Length)})));
	}

	public TextRange Runs(int Start, int Length) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Runs", new Object[] {new Integer(Start), new Integer(Length)})));
	}

	public TextRange TrimText() throws COMException
	{
		return (new TextRange((DispatchPtr)invoke("TrimText")));
	}

	public String getText() throws COMException
	{
		return (String) get("Text");
	}

	public void setText(String pString) throws COMException
	{
		put("Text", pString);
	}

	public TextRange InsertAfter(String NewText) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("InsertAfter", new Object[] {NewText})));
	}

	public TextRange InsertBefore(String NewText) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("InsertBefore", new Object[] {NewText})));
	}

	public TextRange InsertDateTime(int DateTimeFormat, int InsertAsField) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("InsertDateTime", new Object[] {new Integer(DateTimeFormat), new Integer(InsertAsField)})));
	}

	public TextRange InsertSlideNumber() throws COMException
	{
		return (new TextRange((DispatchPtr)invoke("InsertSlideNumber")));
	}

	public TextRange InsertSymbol(String FontName, int CharNumber, int Unicode) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("InsertSymbol", new Object[] {FontName, new Integer(CharNumber), new Integer(Unicode)})));
	}

	public Font getFont() throws COMException
	{
		return ( new Font((DispatchPtr)  get("Font")));
	}

	public ParagraphFormat getParagraphFormat() throws COMException
	{
		return ( new ParagraphFormat((DispatchPtr)  get("ParagraphFormat")));
	}

	public int getIndentLevel() throws COMException
	{
		return ((Integer) get("IndentLevel")).intValue();
	}

	public void setIndentLevel(int pint) throws COMException
	{
		put("IndentLevel", new Integer(pint));
	}

	public void Select() throws COMException
	{
		invoke("Select");
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

	public TextRange Paste() throws COMException
	{
		return (new TextRange((DispatchPtr)invoke("Paste")));
	}

	public void ChangeCase(int Type) throws COMException
	{
		invokeN("ChangeCase", new Object[] {new Integer(Type)});
	}

	public void AddPeriods() throws COMException
	{
		invoke("AddPeriods");
	}

	public void RemovePeriods() throws COMException
	{
		invoke("RemovePeriods");
	}

	public TextRange Find(String FindWhat, int After, int MatchCase, int WholeWords) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Find", new Object[] {FindWhat, new Integer(After), new Integer(MatchCase), new Integer(WholeWords)})));
	}

	public TextRange Replace(String FindWhat, String ReplaceWhat, int After, int MatchCase, int WholeWords) throws COMException
	{
		return (new TextRange((DispatchPtr)invokeN("Replace", new Object[] {FindWhat, ReplaceWhat, new Integer(After), new Integer(MatchCase), new Integer(WholeWords)})));
	}

	public void RotatedBounds(float X1, float Y1, float X2, float Y2, float X3, float Y3, float x4, float y4) throws COMException
	{
		invokeN("RotatedBounds", new Object[] {new Float(X1), new Float(Y1), new Float(X2), new Float(Y2), new Float(X3), new Float(Y3), new Float(x4), new Float(y4)});
	}

	public int getLanguageID() throws COMException
	{
		return ((Integer) get("LanguageID")).intValue();
	}

	public void setLanguageID(int pint) throws COMException
	{
		put("LanguageID", new Integer(pint));
	}

	public void RtlRun() throws COMException
	{
		invoke("RtlRun");
	}

	public void LtrRun() throws COMException
	{
		invoke("LtrRun");
	}


}
