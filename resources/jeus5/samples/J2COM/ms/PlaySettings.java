/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PlaySettings extends DispatchPtr
{
	public PlaySettings(String progid) throws COMException { super(progid);}
	public PlaySettings(IUnknown other) throws COMException { super(other);}

	public PlaySettings(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public String getActionVerb() throws COMException
	{
		return (String) get("ActionVerb");
	}

	public void setActionVerb(String pString) throws COMException
	{
		put("ActionVerb", pString);
	}

	public int getHideWhileNotPlaying() throws COMException
	{
		return ((Integer) get("HideWhileNotPlaying")).intValue();
	}

	public void setHideWhileNotPlaying(int pint) throws COMException
	{
		put("HideWhileNotPlaying", new Integer(pint));
	}

	public int getLoopUntilStopped() throws COMException
	{
		return ((Integer) get("LoopUntilStopped")).intValue();
	}

	public void setLoopUntilStopped(int pint) throws COMException
	{
		put("LoopUntilStopped", new Integer(pint));
	}

	public int getPlayOnEntry() throws COMException
	{
		return ((Integer) get("PlayOnEntry")).intValue();
	}

	public void setPlayOnEntry(int pint) throws COMException
	{
		put("PlayOnEntry", new Integer(pint));
	}

	public int getRewindMovie() throws COMException
	{
		return ((Integer) get("RewindMovie")).intValue();
	}

	public void setRewindMovie(int pint) throws COMException
	{
		put("RewindMovie", new Integer(pint));
	}

	public int getPauseAnimation() throws COMException
	{
		return ((Integer) get("PauseAnimation")).intValue();
	}

	public void setPauseAnimation(int pint) throws COMException
	{
		put("PauseAnimation", new Integer(pint));
	}

	public int getStopAfterSlides() throws COMException
	{
		return ((Integer) get("StopAfterSlides")).intValue();
	}

	public void setStopAfterSlides(int pint) throws COMException
	{
		put("StopAfterSlides", new Integer(pint));
	}


}
