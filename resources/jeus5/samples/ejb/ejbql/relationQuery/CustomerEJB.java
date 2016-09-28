package ejb.ejbql.relationQuery;

import java.util.*;

import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;

import javax.naming.*;


public abstract class CustomerEJB implements EntityBean
{
   public CustomerEJB()
   {
   }

   public Integer ejbCreate(Integer id, String name)
   {
      setId(id);
      setName(name);

      return null;
   }

   public void ejbPostCreate(Integer id, String name)
   {
   }

   public abstract Integer getId();

   public abstract void setId(Integer id);

   public abstract String getName();

   public abstract void setName(String name);

   public abstract Collection getReservations();

   public abstract void setReservations(Collection reservations);

   public Collection getReservationIDs()
   {
      Vector vec = new Vector();
      Collection col = this.getReservations();
      Iterator it = col.iterator();

      while (it.hasNext())
      {
         ReservationLocal local = (ReservationLocal)it.next();
         vec.addElement(local.getId());
      }

      return vec;
   }

   public void setReservationInfos(Collection reservations)
   {
      Collection vec = this.getReservations();

      try
      {
         InitialContext initial = new InitialContext();
         ReservationHomeLocal home = (ReservationHomeLocal)initial.lookup("reservationLocal");
         Iterator it = reservations.iterator();

         while (it.hasNext())
         {
            Reservation rsv = (Reservation)it.next();
            ReservationLocal local = (ReservationLocal)home.findByPrimaryKey(rsv.getId());
            vec.add(local);
         }

//			this.setReservations(vec);
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }

   public void setEntityContext(EntityContext ctx)
   {
   }

   public void unsetEntityContext()
   {
   }

   public void ejbLoad()
   {
   }

   public void ejbStore()
   {
   }

   public void ejbActivate()
   {
   }

   public void ejbPassivate()
   {
   }

   public void ejbRemove()
   {
   }

   public abstract Collection ejbSelectNested1() throws FinderException;

   public void ejbHomeTest() throws FinderException
   {
      Collection c = (Collection)ejbSelectNested1();
      Iterator i = c.iterator();

      while (i.hasNext())
      {
         Object customer = (Object)i.next();
         System.out.println(">>>>>>>>>>>> ejb.ejbql.relationQuery = " + customer.toString());
      }

      System.out.println("-------------------------------------------");
   }
}
