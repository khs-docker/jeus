package ejb.ejbql.relationQuery;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;


public interface Customer extends EJBObject
{
   public abstract Integer getId() throws RemoteException;

   public abstract void setId(Integer id) throws RemoteException;

   public abstract String getName() throws RemoteException;

   public abstract void setName(String name) throws RemoteException;

   public Collection getReservationIDs() throws RemoteException;

   public void setReservationInfos(Collection reservations) throws RemoteException;
}
