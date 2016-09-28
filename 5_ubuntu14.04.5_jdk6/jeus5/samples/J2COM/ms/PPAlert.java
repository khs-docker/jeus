/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class PPAlert extends DispatchPtr
{
	public PPAlert(String progid) throws COMException { super(progid);}
	public PPAlert(IUnknown other) throws COMException { super(other);}

	public PPAlert(GUID ClsID) throws COMException { super(ClsID);}

	public _Application getApplication() throws COMException
	{
		return (new _Application((DispatchPtr)  get("Application")));
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public void Run(String Title, int Type, String Text, String leftBtn, String middleBtn, String rightBtn) throws COMException
	{
		invokeN("Run", new Object[] {Title, new Integer(Type), Text, leftBtn, middleBtn, rightBtn});
	}

	public int getPressedButton() throws COMException
	{
		return ((Integer) get("PressedButton")).intValue();
	}

	public String getOnButton() throws COMException
	{
		return (String) get("OnButton");
	}

	public void setOnButton(String pString) throws COMException
	{
		put("OnButton", pString);
	}


}
