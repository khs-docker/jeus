/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class SlideShowTransition extends DispatchPtr
{
	public SlideShowTransition(String progid) throws COMException { super(progid);}
	public SlideShowTransition(IUnknown other) throws COMException { super(other);}

	public SlideShowTransition(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getAdvanceOnClick() throws COMException
	{
		return ((Integer) get("AdvanceOnClick")).intValue();
	}

	public void setAdvanceOnClick(int pint) throws COMException
	{
		put("AdvanceOnClick", new Integer(pint));
	}

	public int getAdvanceOnTime() throws COMException
	{
		return ((Integer) get("AdvanceOnTime")).intValue();
	}

	public void setAdvanceOnTime(int pint) throws COMException
	{
		put("AdvanceOnTime", new Integer(pint));
	}

	public float getAdvanceTime() throws COMException
	{
		return ((Float) get("AdvanceTime")).floatValue();
	}

	public void setAdvanceTime(float pfloat) throws COMException
	{
		put("AdvanceTime", new Float(pfloat));
	}

	public int getEntryEffect() throws COMException
	{
		return ((Integer) get("EntryEffect")).intValue();
	}

	public void setEntryEffect(int pint) throws COMException
	{
		put("EntryEffect", new Integer(pint));
	}

	public int getHidden() throws COMException
	{
		return ((Integer) get("Hidden")).intValue();
	}

	public void setHidden(int pint) throws COMException
	{
		put("Hidden", new Integer(pint));
	}

	public int getLoopSoundUntilNext() throws COMException
	{
		return ((Integer) get("LoopSoundUntilNext")).intValue();
	}

	public void setLoopSoundUntilNext(int pint) throws COMException
	{
		put("LoopSoundUntilNext", new Integer(pint));
	}

	public SoundEffect getSoundEffect() throws COMException
	{
		return ( new SoundEffect((DispatchPtr)  get("SoundEffect")));
	}

	public int getSpeed() throws COMException
	{
		return ((Integer) get("Speed")).intValue();
	}

	public void setSpeed(int pint) throws COMException
	{
		put("Speed", new Integer(pint));
	}


}
