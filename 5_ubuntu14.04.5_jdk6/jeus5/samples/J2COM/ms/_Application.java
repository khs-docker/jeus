/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class _Application extends DispatchPtr
{
	public _Application(String progid) throws COMException { super(progid);}
	public _Application(IUnknown other) throws COMException { super(other);}

	public _Application(GUID ClsID) throws COMException { super(ClsID);}

	public Presentations getPresentations() throws COMException
	{
		return ( new Presentations((DispatchPtr)  get("Presentations")));
	}

	public DocumentWindows getWindows() throws COMException
	{
		return ( new DocumentWindows((DispatchPtr)  get("Windows")));
	}

	public PPDialogs getDialogs() throws COMException
	{
		return ( new PPDialogs((DispatchPtr)  get("Dialogs")));
	}

	public DocumentWindow getActiveWindow() throws COMException
	{
		return ( new DocumentWindow((DispatchPtr)  get("ActiveWindow")));
	}

	public _Presentation getActivePresentation() throws COMException
	{
		return (new _Presentation((DispatchPtr)  get("ActivePresentation")));
	}

	public SlideShowWindows getSlideShowWindows() throws COMException
	{
		return ( new SlideShowWindows((DispatchPtr)  get("SlideShowWindows")));
	}

	public DispatchPtr getCommandBars() throws COMException
	{
		return ((DispatchPtr) get("CommandBars"));
	}

	public String getPath() throws COMException
	{
		return (String) get("Path");
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public String getCaption() throws COMException
	{
		return (String) get("Caption");
	}

	public void setCaption(String pString) throws COMException
	{
		put("Caption", pString);
	}

	public DispatchPtr getAssistant() throws COMException
	{
		return ((DispatchPtr) get("Assistant"));
	}

	public DispatchPtr getFileSearch() throws COMException
	{
		return ((DispatchPtr) get("FileSearch"));
	}

	public DispatchPtr getFileFind() throws COMException
	{
		return ((DispatchPtr) get("FileFind"));
	}

	public String getBuild() throws COMException
	{
		return (String) get("Build");
	}

	public String getVersion() throws COMException
	{
		return (String) get("Version");
	}

	public String getOperatingSystem() throws COMException
	{
		return (String) get("OperatingSystem");
	}

	public String getActivePrinter() throws COMException
	{
		return (String) get("ActivePrinter");
	}

	public int getCreator() throws COMException
	{
		return ((Integer) get("Creator")).intValue();
	}

	public AddIns getAddIns() throws COMException
	{
		return ( new AddIns((DispatchPtr)  get("AddIns")));
	}

	public DispatchPtr getVBE() throws COMException
	{
		return ((DispatchPtr) get("VBE"));
	}

	public void Help(String HelpFile, int ContextID) throws COMException
	{
		invokeN("Help", new Object[] {HelpFile, new Integer(ContextID)});
	}

	public void Quit() throws COMException
	{
		invoke("Quit");
	}



	public FileDialog FileDialog(int Type) throws COMException
	{
		return (new FileDialog((DispatchPtr)invokeN("FileDialog", new Object[] {new Integer(Type)})));
	}

	public void LaunchSpelling(DocumentWindow pWindow) throws COMException
	{
		invokeN("LaunchSpelling", new Object[] {pWindow});
	}

	public float getLeft() throws COMException
	{
		return ((Float) get("Left")).floatValue();
	}

	public void setLeft(float pfloat) throws COMException
	{
		put("Left", new Float(pfloat));
	}

	public float getTop() throws COMException
	{
		return ((Float) get("Top")).floatValue();
	}

	public void setTop(float pfloat) throws COMException
	{
		put("Top", new Float(pfloat));
	}

	public float getWidth() throws COMException
	{
		return ((Float) get("Width")).floatValue();
	}

	public void setWidth(float pfloat) throws COMException
	{
		put("Width", new Float(pfloat));
	}

	public float getHeight() throws COMException
	{
		return ((Float) get("Height")).floatValue();
	}

	public void setHeight(float pfloat) throws COMException
	{
		put("Height", new Float(pfloat));
	}

	public int getWindowState() throws COMException
	{
		return ((Integer) get("WindowState")).intValue();
	}

	public void setWindowState(int pint) throws COMException
	{
		put("WindowState", new Integer(pint));
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public int getHWND() throws COMException
	{
		return ((Integer) get("HWND")).intValue();
	}

	public int getActive() throws COMException
	{
		return ((Integer) get("Active")).intValue();
	}

	public void Activate() throws COMException
	{
		invoke("Activate");
	}

	public DispatchPtr getAnswerWizard() throws COMException
	{
		return ((DispatchPtr) get("AnswerWizard"));
	}

	public DispatchPtr getCOMAddIns() throws COMException
	{
		return ((DispatchPtr) get("COMAddIns"));
	}

	public String getProductCode() throws COMException
	{
		return (String) get("ProductCode");
	}

	public DefaultWebOptions getDefaultWebOptions() throws COMException
	{
		return ( new DefaultWebOptions((DispatchPtr)  get("DefaultWebOptions")));
	}

	public DispatchPtr getLanguageSettings() throws COMException
	{
		return ((DispatchPtr) get("LanguageSettings"));
	}

	public DispatchPtr getMsoDebugOptions() throws COMException
	{
		return ((DispatchPtr) get("MsoDebugOptions"));
	}

	public int getShowWindowsInTaskbar() throws COMException
	{
		return ((Integer) get("ShowWindowsInTaskbar")).intValue();
	}

	public void setShowWindowsInTaskbar(int pint) throws COMException
	{
		put("ShowWindowsInTaskbar", new Integer(pint));
	}

	public Marker getMarker() throws COMException
	{
		return ( new Marker((DispatchPtr)  get("Marker")));
	}

	public int getFeatureInstall() throws COMException
	{
		return ((Integer) get("FeatureInstall")).intValue();
	}

	public void setFeatureInstall(int pint) throws COMException
	{
		put("FeatureInstall", new Integer(pint));
	}

	public boolean GetOptionFlag(int Option, boolean Persist) throws COMException
	{
		return ((Boolean)invokeN("GetOptionFlag", new Object[] {new Integer(Option), new Boolean(Persist)})).booleanValue();
	}

	public void SetOptionFlag(int Option, boolean State, boolean Persist) throws COMException
	{
		invokeN("SetOptionFlag", new Object[] {new Integer(Option), new Boolean(State), new Boolean(Persist)});
	}


}
