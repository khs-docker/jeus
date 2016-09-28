package ejb.ejbql.relationQuery;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;


public abstract class ReservationEJB implements EntityBean
{
   public ReservationEJB()
   {
   }

   public Integer ejbCreate(Integer id, double payAmount, String reservedDate, Collection customers)
   {
      setId(id);
      setPayAmount(payAmount);
      setReservedDate(reservedDate);

      return null;
   }

   public Integer ejbCreate(Integer id, double payAmount, String reservedDate)
   {
      setId(id);
      setPayAmount(payAmount);
      setReservedDate(reservedDate);

      return null;
   }

   public void ejbPostCreate(Integer id, double payAmount, String reservedDate)
   {
   }

   public void ejbPostCreate(Integer id, double payAmount, String reservedDate, Collection customers)
   {
      setCustomers(customers);
   }

   public abstract Integer getId();

   public abstract void setId(Integer id);

   public abstract double getPayAmount();

   public abstract void setPayAmount(double payAmount);

   public abstract String getReservedDate();

   public abstract void setReservedDate(String reservedDate);

   public abstract Collection getCustomers();

   public abstract void setCustomers(Collection customers);

   public Collection getCustomerIDs()
   {
      Vector vec = new Vector();
      Collection col = this.getCustomers();
      Iterator it = col.iterator();

      while (it.hasNext())
      {
         CustomerLocal local = (CustomerLocal)it.next();
         vec.addElement(local.getId());
      }

      return vec;
   }

   public void setCustomerInfos(Collection customers)
   {
      /*
        try {
         Thread currentThread = Thread.currentThread();
         System.out.println("************ sleeping for 100 sec...");
         currentThread.sleep(1*1000);
        } catch (java.lang.InterruptedException e) {
         System.out.println("************ " + e.getMessage());
        }
       */
      Collection vec = this.getCustomers();

      try
      {
         InitialContext initial = new InitialContext();
         CustomerHomeLocal home = (CustomerHomeLocal)initial.lookup("customerLocal");
         Iterator it = customers.iterator();

         while (it.hasNext())
         {
            Customer cust = (Customer)it.next();
            CustomerLocal local = (CustomerLocal)home.findByPrimaryKey(cust.getId());
            vec.add(local);
         }

//			this.setCustomers(vec);
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
         Object reservation = (Object)i.next();
         System.out.println(">>>>>>>>>>>> reservation = " + reservation.toString());
      }

      System.out.println("-------------------------------------------");
   }
}
