/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class _Global extends DispatchPtr
{
	public _Global(String progid) throws COMException { super(progid);}
	public _Global(IUnknown other) throws COMException { super(other);}

	public _Global(GUID ClsID) throws COMException { super(ClsID);}

	public _Presentation getActivePresentation() throws COMException
	{
		return (new _Presentation((DispatchPtr)  get("ActivePresentation")));
	}

	public DocumentWindow getActiveWindow() throws COMException
	{
		return ( new DocumentWindow((DispatchPtr)  get("ActiveWindow")));
	}

	public AddIns getAddIns() throws COMException
	{
		return ( new AddIns((DispatchPtr)  get("AddIns")));
	}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getAssistant() throws COMException
	{
		return ((DispatchPtr) get("Assistant"));
	}

	public PPDialogs getDialogs() throws COMException
	{
		return ( new PPDialogs((DispatchPtr)  get("Dialogs")));
	}

	public Presentations getPresentations() throws COMException
	{
		return ( new Presentations((DispatchPtr)  get("Presentations")));
	}

	public SlideShowWindows getSlideShowWindows() throws COMException
	{
		return ( new SlideShowWindows((DispatchPtr)  get("SlideShowWindows")));
	}

	public DocumentWindows getWindows() throws COMException
	{
		return ( new DocumentWindows((DispatchPtr)  get("Windows")));
	}

	public DispatchPtr getCommandBars() throws COMException
	{
		return ((DispatchPtr) get("CommandBars"));
	}

	public DispatchPtr getAnswerWizard() throws COMException
	{
		return ((DispatchPtr) get("AnswerWizard"));
	}


}
