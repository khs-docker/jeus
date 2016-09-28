package ejb.ejbql.relationQuery;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;


public interface ReservationHome extends EJBHome
{
   public Reservation create(Integer id, double payAmount, String reservedDate) throws CreateException, RemoteException;

   public Reservation findByPrimaryKey(Integer id) throws FinderException, RemoteException;

   public Collection findAll() throws FinderException, RemoteException;

   public void test() throws FinderException, RemoteException;
}
