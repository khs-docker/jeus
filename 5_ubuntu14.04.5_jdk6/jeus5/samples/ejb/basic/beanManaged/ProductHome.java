package ejb.basic.beanManaged;

import java.rmi.RemoteException;

import java.util.*;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;


public interface ProductHome extends EJBHome
{
   public Product create(String id, String name, double price) throws RemoteException, CreateException;

   public Product findByPrimaryKey(String id) throws RemoteException, FinderException;

   public Collection findByName(String name) throws RemoteException, FinderException;

   public Collection findInPriceRange(double min, double max) throws RemoteException, FinderException;

   public Collection findAll() throws RemoteException, FinderException;
}
