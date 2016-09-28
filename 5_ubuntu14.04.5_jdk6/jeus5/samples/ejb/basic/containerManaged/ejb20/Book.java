package ejb.basic.containerManaged.ejb20;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;


public interface Book extends EJBObject
{
   public String getTitle() throws RemoteException;

   public void setTitle(String title) throws RemoteException;

   public String getAuthor() throws RemoteException;

   public void setAuthor(String author) throws RemoteException;

   public double getPrice() throws RemoteException;

   public void setPrice(double price) throws RemoteException;

   public String getPublisher() throws RemoteException;

   public void setPublisher(String publisher) throws RemoteException;

   public String toBookString() throws RemoteException;
}
