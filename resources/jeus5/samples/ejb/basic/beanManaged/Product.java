package ejb.basic.beanManaged;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface Product extends EJBObject
{
   public String getName() throws RemoteException;

   public double getPrice() throws RemoteException;

   public void setName(String name) throws RemoteException;

   public void setPrice(double price) throws RemoteException;
}
