/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PublishObject extends DispatchPtr
{
	public PublishObject(String progid) throws COMException { super(progid);}
	public PublishObject(IUnknown other) throws COMException { super(other);}

	public PublishObject(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public int getHTMLVersion() throws COMException
	{
		return ((Integer) get("HTMLVersion")).intValue();
	}

	public void setHTMLVersion(int pint) throws COMException
	{
		put("HTMLVersion", new Integer(pint));
	}

	public int getSourceType() throws COMException
	{
		return ((Integer) get("SourceType")).intValue();
	}

	public void setSourceType(int pint) throws COMException
	{
		put("SourceType", new Integer(pint));
	}

	public int getRangeStart() throws COMException
	{
		return ((Integer) get("RangeStart")).intValue();
	}

	public void setRangeStart(int pint) throws COMException
	{
		put("RangeStart", new Integer(pint));
	}

	public int getRangeEnd() throws COMException
	{
		return ((Integer) get("RangeEnd")).intValue();
	}

	public void setRangeEnd(int pint) throws COMException
	{
		put("RangeEnd", new Integer(pint));
	}

	public String getSlideShowName() throws COMException
	{
		return (String) get("SlideShowName");
	}

	public void setSlideShowName(String pString) throws COMException
	{
		put("SlideShowName", pString);
	}

	public int getSpeakerNotes() throws COMException
	{
		return ((Integer) get("SpeakerNotes")).intValue();
	}

	public void setSpeakerNotes(int pint) throws COMException
	{
		put("SpeakerNotes", new Integer(pint));
	}

	public String getFileName() throws COMException
	{
		return (String) get("FileName");
	}

	public void setFileName(String pString) throws COMException
	{
		put("FileName", pString);
	}

	public void Publish() throws COMException
	{
		invoke("Publish");
	}


}
