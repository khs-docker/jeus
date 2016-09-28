package ejb.ejbql.relationQuery;

import java.util.*;

import javax.ejb.*;


public interface ReservationLocal extends EJBLocalObject
{
   public abstract Integer getId() throws EJBException;

   public abstract void setId(Integer id) throws EJBException;

   public abstract double getPayAmount() throws EJBException;

   public abstract void setPayAmount(double payAmount) throws EJBException;

   public abstract String getReservedDate() throws EJBException;

   public abstract void setReservedDate(String reservedDate) throws EJBException;

   public abstract Collection getCustomers() throws EJBException;

   public abstract void setCustomers(Collection customers) throws EJBException;
}
