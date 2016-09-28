/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ActionSetting extends DispatchPtr
{
	public ActionSetting(String progid) throws COMException { super(progid);}
	public ActionSetting(IUnknown other) throws COMException { super(other);}

	public ActionSetting(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getAction() throws COMException
	{
		return ((Integer) get("Action")).intValue();
	}

	public void setAction(int pint) throws COMException
	{
		put("Action", new Integer(pint));
	}

	public String getActionVerb() throws COMException
	{
		return (String) get("ActionVerb");
	}

	public void setActionVerb(String pString) throws COMException
	{
		put("ActionVerb", pString);
	}

	public int getAnimateAction() throws COMException
	{
		return ((Integer) get("AnimateAction")).intValue();
	}

	public void setAnimateAction(int pint) throws COMException
	{
		put("AnimateAction", new Integer(pint));
	}

	public String getRun() throws COMException
	{
		return (String) get("Run");
	}

	public void setRun(String pString) throws COMException
	{
		put("Run", pString);
	}

	public String getSlideShowName() throws COMException
	{
		return (String) get("SlideShowName");
	}

	public void setSlideShowName(String pString) throws COMException
	{
		put("SlideShowName", pString);
	}

	public Hyperlink getHyperlink() throws COMException
	{
		return ( new Hyperlink((DispatchPtr)  get("Hyperlink")));
	}

	public SoundEffect getSoundEffect() throws COMException
	{
		return ( new SoundEffect((DispatchPtr)  get("SoundEffect")));
	}

	public int getShowandReturn() throws COMException
	{
		return ((Integer) get("ShowandReturn")).intValue();
	}

	public void setShowandReturn(int pint) throws COMException
	{
		put("ShowandReturn", new Integer(pint));
	}


}
