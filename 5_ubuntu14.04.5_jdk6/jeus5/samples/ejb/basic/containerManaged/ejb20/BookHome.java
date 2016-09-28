package ejb.basic.containerManaged.ejb20;

import java.rmi.RemoteException;

import java.util.*;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;


public interface BookHome extends EJBHome
{
   public Book create(String code, String title, String author, double price, String publisher) throws CreateException, RemoteException;

   public Book findByPrimaryKey(String code) throws FinderException, RemoteException;

   public Collection findByTitle(String title) throws FinderException, RemoteException;

   public Collection findAll() throws FinderException, RemoteException;
}
