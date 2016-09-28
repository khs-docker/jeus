package ejb.ejbql.relationQuery;

import java.rmi.*;

import java.util.*;

import javax.ejb.*;


public interface Reservation extends EJBObject
{
   public abstract Integer getId() throws RemoteException;

   public abstract void setId(Integer id) throws RemoteException;

   public abstract double getPayAmount() throws RemoteException;

   public abstract void setPayAmount(double payAmount) throws RemoteException;

   public abstract String getReservedDate() throws RemoteException;

   public abstract void setReservedDate(String reservedDate) throws RemoteException;

   public Collection getCustomerIDs() throws RemoteException;

   public void setCustomerInfos(Collection customers) throws RemoteException;
}
