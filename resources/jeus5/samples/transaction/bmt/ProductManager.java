package transaction.bmt;

import java.rmi.*;

import javax.ejb.*;


public interface ProductManager extends EJBObject
{
   public abstract void transactionTest() throws RemoteException, EJBException;
}
