package pkproduct;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface Product extends EJBObject
{
   public void setPrice(double price) throws RemoteException;

   public double getPrice() throws RemoteException;

   public String getDescription() throws RemoteException;
}
