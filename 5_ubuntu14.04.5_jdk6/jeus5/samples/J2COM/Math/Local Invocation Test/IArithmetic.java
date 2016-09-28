/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Jeus40\samples\J2COM\Math.dll
*/
package sample;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class IArithmetic extends DispatchPtr
{
	public IArithmetic(String progid) throws COMException { super(progid);}
	public IArithmetic(IUnknown other) throws COMException { super(other);}

	public IArithmetic(GUID ClsID) throws COMException { super(ClsID);}

	public int sum(int x, int y) throws COMException
	{
		return ((Integer)invokeN("Sum", new Object[] {new Integer(x), new Integer(y)})).intValue();
	}


}
