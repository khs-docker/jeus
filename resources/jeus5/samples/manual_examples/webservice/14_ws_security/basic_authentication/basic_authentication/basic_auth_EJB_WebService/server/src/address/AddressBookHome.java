package address;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;


public interface AddressBookHome extends EJBHome
{
   /**
    * DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    *
    * @throws RemoteException DOCUMENT ME!
    * @throws CreateException DOCUMENT ME!
    */
   AddressBook create() throws RemoteException, CreateException;
}
