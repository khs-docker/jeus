package ejb.basic.statefulSession;

import java.rmi.RemoteException;

import java.util.Vector;

import javax.ejb.*;


public class CounterEJB implements SessionBean
{
   private int count = 0;
   private SessionContext ctx;

   public CounterEJB()
   {
   }

   public void increase()
   {
      count++;
   }

   public void decrease()
   {
      count--;
   }

   public int getCount()
   {
      return count;
   }

   public void ejbCreate()
   {
      count = 0;
   }

   public void ejbRemove()
   {
      System.out.println("===== EJB Removed !! =====");
   }

   public void ejbActivate()
   {
      System.out.println("===== EJB Activation !! =====");
   }

   public void ejbPassivate()
   {
      System.out.println("===== EJB Passivation !! =====");
   }

   public void setSessionContext(SessionContext ctx)
   {
      this.ctx = ctx;
   }
}
