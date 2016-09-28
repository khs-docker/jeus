package ejb.ejbql.relationQuery;

import java.util.*;

import javax.ejb.*;


public interface CustomerLocal extends EJBLocalObject
{
   public abstract Integer getId() throws EJBException;

   public abstract void setId(Integer id) throws EJBException;

   public abstract String getName() throws EJBException;

   public abstract void setName(String name) throws EJBException;

   public abstract Collection getReservations() throws EJBException;

   public abstract void setReservations(Collection reservations) throws EJBException;
}
