/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class ParagraphFormat extends DispatchPtr
{
	public ParagraphFormat(String progid) throws COMException { super(progid);}
	public ParagraphFormat(IUnknown other) throws COMException { super(other);}

	public ParagraphFormat(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getAlignment() throws COMException
	{
		return ((Integer) get("Alignment")).intValue();
	}

	public void setAlignment(int pint) throws COMException
	{
		put("Alignment", new Integer(pint));
	}

	public BulletFormat getBullet() throws COMException
	{
		return ( new BulletFormat((DispatchPtr)  get("Bullet")));
	}

	public int getLineRuleBefore() throws COMException
	{
		return ((Integer) get("LineRuleBefore")).intValue();
	}

	public void setLineRuleBefore(int pint) throws COMException
	{
		put("LineRuleBefore", new Integer(pint));
	}

	public int getLineRuleAfter() throws COMException
	{
		return ((Integer) get("LineRuleAfter")).intValue();
	}

	public void setLineRuleAfter(int pint) throws COMException
	{
		put("LineRuleAfter", new Integer(pint));
	}

	public int getLineRuleWithin() throws COMException
	{
		return ((Integer) get("LineRuleWithin")).intValue();
	}

	public void setLineRuleWithin(int pint) throws COMException
	{
		put("LineRuleWithin", new Integer(pint));
	}

	public float getSpaceBefore() throws COMException
	{
		return ((Float) get("SpaceBefore")).floatValue();
	}

	public void setSpaceBefore(float pfloat) throws COMException
	{
		put("SpaceBefore", new Float(pfloat));
	}

	public float getSpaceAfter() throws COMException
	{
		return ((Float) get("SpaceAfter")).floatValue();
	}

	public void setSpaceAfter(float pfloat) throws COMException
	{
		put("SpaceAfter", new Float(pfloat));
	}

	public float getSpaceWithin() throws COMException
	{
		return ((Float) get("SpaceWithin")).floatValue();
	}

	public void setSpaceWithin(float pfloat) throws COMException
	{
		put("SpaceWithin", new Float(pfloat));
	}

	public int getBaseLineAlignment() throws COMException
	{
		return ((Integer) get("BaseLineAlignment")).intValue();
	}

	public void setBaseLineAlignment(int pint) throws COMException
	{
		put("BaseLineAlignment", new Integer(pint));
	}

	public int getFarEastLineBreakControl() throws COMException
	{
		return ((Integer) get("FarEastLineBreakControl")).intValue();
	}

	public void setFarEastLineBreakControl(int pint) throws COMException
	{
		put("FarEastLineBreakControl", new Integer(pint));
	}

	public int getWordWrap() throws COMException
	{
		return ((Integer) get("WordWrap")).intValue();
	}

	public void setWordWrap(int pint) throws COMException
	{
		put("WordWrap", new Integer(pint));
	}

	public int getHangingPunctuation() throws COMException
	{
		return ((Integer) get("HangingPunctuation")).intValue();
	}

	public void setHangingPunctuation(int pint) throws COMException
	{
		put("HangingPunctuation", new Integer(pint));
	}

	public int getTextDirection() throws COMException
	{
		return ((Integer) get("TextDirection")).intValue();
	}

	public void setTextDirection(int pint) throws COMException
	{
		put("TextDirection", new Integer(pint));
	}


}
