package hello;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface Hello extends EJBObject
{
   /**
    * DOCUMENT ME!
    *
    * @return DOCUMENT ME!
    *
    * @throws RemoteException DOCUMENT ME!
    */
   String sayHello() throws RemoteException;
}
