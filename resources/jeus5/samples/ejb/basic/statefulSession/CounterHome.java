package ejb.basic.statefulSession;

import java.rmi.RemoteException;

import javax.ejb.*;
import javax.ejb.CreateException;


public interface CounterHome extends EJBHome
{
   /**
    * DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    *
    * @throws RemoteException DOCUMENT ME!
    * @throws CreateException DOCUMENT ME!
    */
   Counter create() throws RemoteException, CreateException;
}
