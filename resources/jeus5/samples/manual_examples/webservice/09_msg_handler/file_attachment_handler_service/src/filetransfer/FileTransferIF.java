/*
 * Created on 2004. 3. 9.
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package filetransfer;

import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * @author hoke
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public interface FileTransferIF extends Remote
{
   public String receiveFile(String s) throws RemoteException;
}
