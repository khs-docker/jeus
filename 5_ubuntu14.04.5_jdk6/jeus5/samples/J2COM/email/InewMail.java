/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Jeus40\samples\J2COM\Email.dll
*/
package email;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class InewMail extends DispatchPtr
{
	public InewMail(String progid) throws COMException { super(progid);}
	public InewMail(IUnknown other) throws COMException { super(other);}

	public InewMail(GUID ClsID) throws COMException { super(ClsID);}

	public void mail(String company, String name) throws COMException
	{
		invokeN("mail", new Object[] {company, name});
	}


}
