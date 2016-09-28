/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class AnimationSettings extends DispatchPtr
{
	public AnimationSettings(String progid) throws COMException { super(progid);}
	public AnimationSettings(IUnknown other) throws COMException { super(other);}

	public AnimationSettings(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public ColorFormat getDimColor() throws COMException
	{
		return ( new ColorFormat((DispatchPtr)  get("DimColor")));
	}

	public SoundEffect getSoundEffect() throws COMException
	{
		return ( new SoundEffect((DispatchPtr)  get("SoundEffect")));
	}

	public int getEntryEffect() throws COMException
	{
		return ((Integer) get("EntryEffect")).intValue();
	}

	public void setEntryEffect(int pint) throws COMException
	{
		put("EntryEffect", new Integer(pint));
	}

	public int getAfterEffect() throws COMException
	{
		return ((Integer) get("AfterEffect")).intValue();
	}

	public void setAfterEffect(int pint) throws COMException
	{
		put("AfterEffect", new Integer(pint));
	}

	public int getAnimationOrder() throws COMException
	{
		return ((Integer) get("AnimationOrder")).intValue();
	}

	public void setAnimationOrder(int pint) throws COMException
	{
		put("AnimationOrder", new Integer(pint));
	}

	public int getAdvanceMode() throws COMException
	{
		return ((Integer) get("AdvanceMode")).intValue();
	}

	public void setAdvanceMode(int pint) throws COMException
	{
		put("AdvanceMode", new Integer(pint));
	}

	public float getAdvanceTime() throws COMException
	{
		return ((Float) get("AdvanceTime")).floatValue();
	}

	public void setAdvanceTime(float pfloat) throws COMException
	{
		put("AdvanceTime", new Float(pfloat));
	}

	public PlaySettings getPlaySettings() throws COMException
	{
		return ( new PlaySettings((DispatchPtr)  get("PlaySettings")));
	}

	public int getTextLevelEffect() throws COMException
	{
		return ((Integer) get("TextLevelEffect")).intValue();
	}

	public void setTextLevelEffect(int pint) throws COMException
	{
		put("TextLevelEffect", new Integer(pint));
	}

	public int getTextUnitEffect() throws COMException
	{
		return ((Integer) get("TextUnitEffect")).intValue();
	}

	public void setTextUnitEffect(int pint) throws COMException
	{
		put("TextUnitEffect", new Integer(pint));
	}

	public int getAnimate() throws COMException
	{
		return ((Integer) get("Animate")).intValue();
	}

	public void setAnimate(int pint) throws COMException
	{
		put("Animate", new Integer(pint));
	}

	public int getAnimateBackground() throws COMException
	{
		return ((Integer) get("AnimateBackground")).intValue();
	}

	public void setAnimateBackground(int pint) throws COMException
	{
		put("AnimateBackground", new Integer(pint));
	}

	public int getAnimateTextInReverse() throws COMException
	{
		return ((Integer) get("AnimateTextInReverse")).intValue();
	}

	public void setAnimateTextInReverse(int pint) throws COMException
	{
		put("AnimateTextInReverse", new Integer(pint));
	}

	public int getChartUnitEffect() throws COMException
	{
		return ((Integer) get("ChartUnitEffect")).intValue();
	}

	public void setChartUnitEffect(int pint) throws COMException
	{
		put("ChartUnitEffect", new Integer(pint));
	}


}
