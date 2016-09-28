/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class SoundFormat extends DispatchPtr
{
	public SoundFormat(String progid) throws COMException { super(progid);}
	public SoundFormat(IUnknown other) throws COMException { super(other);}

	public SoundFormat(GUID ClsID) throws COMException { super(ClsID);}

	public void Play() throws COMException
	{
		invoke("Play");
	}

	public void Import(String FileName) throws COMException
	{
		invokeN("Import", new Object[] {FileName});
	}

	public int Export(String FileName) throws COMException
	{
		return ((Integer)invokeN("Export", new Object[] {FileName})).intValue();
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public String getSourceFullName() throws COMException
	{
		return (String) get("SourceFullName");
	}


}
