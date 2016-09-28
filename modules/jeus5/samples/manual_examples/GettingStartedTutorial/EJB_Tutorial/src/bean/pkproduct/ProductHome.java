package pkproduct;

import java.rmi.RemoteException;

import java.util.Collection;

import javax.ejb.*;


public interface ProductHome extends EJBHome
{
   public Product create(String productID, String description, double balance) throws RemoteException, CreateException;

   public Product findByPrimaryKey(Pid pkey) throws FinderException, RemoteException;

   public Collection findByDescription(String description) throws FinderException, RemoteException;

   public Collection findInRange(double low, double high) throws FinderException, RemoteException;
}
