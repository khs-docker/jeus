package hello;

import java.io.Serializable;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;


public interface HelloHome extends EJBHome
{
   /**
    * DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    *
    * @throws RemoteException DOCUMENT ME!
    * @throws CreateException DOCUMENT ME!
    */
   Hello create() throws RemoteException, CreateException;
}
