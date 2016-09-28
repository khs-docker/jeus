/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class _Presentation extends DispatchPtr
{
	public _Presentation(String progid) throws COMException { super(progid);}
	public _Presentation(IUnknown other) throws COMException { super(other);}

	public _Presentation(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public _Master getSlideMaster() throws COMException
	{
		return ( new _Master((DispatchPtr)  get("SlideMaster")));
	}

	public _Master getTitleMaster() throws COMException
	{
		return ( new _Master((DispatchPtr)  get("TitleMaster")));
	}

	public int getHasTitleMaster() throws COMException
	{
		return ((Integer) get("HasTitleMaster")).intValue();
	}

	public _Master AddTitleMaster() throws COMException
	{
		return (new _Master((DispatchPtr)invoke("AddTitleMaster")));
	}

	public void ApplyTemplate(String FileName) throws COMException
	{
		invokeN("ApplyTemplate", new Object[] {FileName});
	}

	public String getTemplateName() throws COMException
	{
		return (String) get("TemplateName");
	}

	public _Master getNotesMaster() throws COMException
	{
		return ( new _Master((DispatchPtr)  get("NotesMaster")));
	}

	public _Master getHandoutMaster() throws COMException
	{
		return ( new _Master((DispatchPtr)  get("HandoutMaster")));
	}

	public Slides getSlides() throws COMException
	{
		return ( new Slides((DispatchPtr)  get("Slides")));
	}

	public PageSetup getPageSetup() throws COMException
	{
		return ( new PageSetup((DispatchPtr)  get("PageSetup")));
	}

	public ColorSchemes getColorSchemes() throws COMException
	{
		return ( new ColorSchemes((DispatchPtr)  get("ColorSchemes")));
	}

	public ExtraColors getExtraColors() throws COMException
	{
		return ( new ExtraColors((DispatchPtr)  get("ExtraColors")));
	}

	public SlideShowSettings getSlideShowSettings() throws COMException
	{
		return ( new SlideShowSettings((DispatchPtr)  get("SlideShowSettings")));
	}

	public Fonts getFonts() throws COMException
	{
		return ( new Fonts((DispatchPtr)  get("Fonts")));
	}

	public DocumentWindows getWindows() throws COMException
	{
		return ( new DocumentWindows((DispatchPtr)  get("Windows")));
	}

	public Tags getTags() throws COMException
	{
		return ( new Tags((DispatchPtr)  get("Tags")));
	}

	public Shape getDefaultShape() throws COMException
	{
		return ( new Shape((DispatchPtr)  get("DefaultShape")));
	}

	public DispatchPtr getBuiltInDocumentProperties() throws COMException
	{
		return (DispatchPtr) get("BuiltInDocumentProperties");
	}

	public DispatchPtr getCustomDocumentProperties() throws COMException
	{
		return (DispatchPtr) get("CustomDocumentProperties");
	}

	public DispatchPtr getVBProject() throws COMException
	{
		return ((DispatchPtr) get("VBProject"));
	}

	public int getReadOnly() throws COMException
	{
		return ((Integer) get("ReadOnly")).intValue();
	}

	public String getFullName() throws COMException
	{
		return (String) get("FullName");
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public String getPath() throws COMException
	{
		return (String) get("Path");
	}

	public int getSaved() throws COMException
	{
		return ((Integer) get("Saved")).intValue();
	}

	public void setSaved(int pint) throws COMException
	{
		put("Saved", new Integer(pint));
	}

	public int getLayoutDirection() throws COMException
	{
		return ((Integer) get("LayoutDirection")).intValue();
	}

	public void setLayoutDirection(int pint) throws COMException
	{
		put("LayoutDirection", new Integer(pint));
	}

	public DocumentWindow NewWindow() throws COMException
	{
		return (new DocumentWindow((DispatchPtr)invoke("NewWindow")));
	}

	public void FollowHyperlink(String Address, String SubAddress, boolean NewWindow, boolean AddHistory, String ExtraInfo, int Method, String HeaderInfo) throws COMException
	{
		invokeN("FollowHyperlink", new Object[] {Address, SubAddress, new Boolean(NewWindow), new Boolean(AddHistory), ExtraInfo, new Integer(Method), HeaderInfo});
	}

	public void AddToFavorites() throws COMException
	{
		invoke("AddToFavorites");
	}

	public void Unused() throws COMException
	{
		invoke("Unused");
	}

	public PrintOptions getPrintOptions() throws COMException
	{
		return ( new PrintOptions((DispatchPtr)  get("PrintOptions")));
	}

	public void PrintOut(int From, int To, String PrintToFile, int Copies, int Collate) throws COMException
	{
		invokeN("PrintOut", new Object[] {new Integer(From), new Integer(To), PrintToFile, new Integer(Copies), new Integer(Collate)});
	}

	public void Save() throws COMException
	{
		invoke("Save");
	}

	public void SaveAs(String FileName, int FileFormat, int EmbedTrueTypeFonts) throws COMException
	{
		invokeN("SaveAs", new Object[] {FileName, new Integer(FileFormat), new Integer(EmbedTrueTypeFonts)});
	}

	public void SaveCopyAs(String FileName, int FileFormat, int EmbedTrueTypeFonts) throws COMException
	{
		invokeN("SaveCopyAs", new Object[] {FileName, new Integer(FileFormat), new Integer(EmbedTrueTypeFonts)});
	}

	public void Export(String Path, String FilterName, int ScaleWidth, int ScaleHeight) throws COMException
	{
		invokeN("Export", new Object[] {Path, FilterName, new Integer(ScaleWidth), new Integer(ScaleHeight)});
	}

	public void Close() throws COMException
	{
		invoke("Close");
	}

	public void SetUndoText(String Text) throws COMException
	{
		invokeN("SetUndoText", new Object[] {Text});
	}

	public DispatchPtr getContainer() throws COMException
	{
		return (DispatchPtr) get("Container");
	}

	public int getDisplayComments() throws COMException
	{
		return ((Integer) get("DisplayComments")).intValue();
	}

	public void setDisplayComments(int pint) throws COMException
	{
		put("DisplayComments", new Integer(pint));
	}

	public int getFarEastLineBreakLevel() throws COMException
	{
		return ((Integer) get("FarEastLineBreakLevel")).intValue();
	}

	public void setFarEastLineBreakLevel(int pint) throws COMException
	{
		put("FarEastLineBreakLevel", new Integer(pint));
	}

	public String getNoLineBreakBefore() throws COMException
	{
		return (String) get("NoLineBreakBefore");
	}

	public void setNoLineBreakBefore(String pString) throws COMException
	{
		put("NoLineBreakBefore", pString);
	}

	public String getNoLineBreakAfter() throws COMException
	{
		return (String) get("NoLineBreakAfter");
	}

	public void setNoLineBreakAfter(String pString) throws COMException
	{
		put("NoLineBreakAfter", pString);
	}

	public void UpdateLinks() throws COMException
	{
		invoke("UpdateLinks");
	}

	public SlideShowWindow getSlideShowWindow() throws COMException
	{
		return ( new SlideShowWindow((DispatchPtr)  get("SlideShowWindow")));
	}

	public int getFarEastLineBreakLanguage() throws COMException
	{
		return ((Integer) get("FarEastLineBreakLanguage")).intValue();
	}

	public void setFarEastLineBreakLanguage(int pint) throws COMException
	{
		put("FarEastLineBreakLanguage", new Integer(pint));
	}

	public void WebPagePreview() throws COMException
	{
		invoke("WebPagePreview");
	}

	public int getDefaultLanguageID() throws COMException
	{
		return ((Integer) get("DefaultLanguageID")).intValue();
	}

	public void setDefaultLanguageID(int pint) throws COMException
	{
		put("DefaultLanguageID", new Integer(pint));
	}

	public DispatchPtr getCommandBars() throws COMException
	{
		return ((DispatchPtr) get("CommandBars"));
	}

	public PublishObjects getPublishObjects() throws COMException
	{
		return ( new PublishObjects((DispatchPtr)  get("PublishObjects")));
	}

	public WebOptions getWebOptions() throws COMException
	{
		return ( new WebOptions((DispatchPtr)  get("WebOptions")));
	}

	public DispatchPtr getHTMLProject() throws COMException
	{
		return ((DispatchPtr) get("HTMLProject"));
	}

	public void ReloadAs(int cp) throws COMException
	{
		invokeN("ReloadAs", new Object[] {new Integer(cp)});
	}

	public void MakeIntoTemplate(int IsDesignTemplate) throws COMException
	{
		invokeN("MakeIntoTemplate", new Object[] {new Integer(IsDesignTemplate)});
	}

	public int getEnvelopeVisible() throws COMException
	{
		return ((Integer) get("EnvelopeVisible")).intValue();
	}

	public void setEnvelopeVisible(int pint) throws COMException
	{
		put("EnvelopeVisible", new Integer(pint));
	}

	public void sblt(String s) throws COMException
	{
		invokeN("sblt", new Object[] {s});
	}

	public int getVBASigned() throws COMException
	{
		return ((Integer) get("VBASigned")).intValue();
	}


}
