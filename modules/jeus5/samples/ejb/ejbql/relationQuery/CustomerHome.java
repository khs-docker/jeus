package ejb.ejbql.relationQuery;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;


public interface CustomerHome extends EJBHome
{
   public Customer create(Integer id, String name) throws CreateException, RemoteException;

   public Customer findByPrimaryKey(Integer id) throws FinderException, RemoteException;

   public Collection findAll() throws FinderException, RemoteException;

   public void test() throws FinderException, RemoteException;
}
