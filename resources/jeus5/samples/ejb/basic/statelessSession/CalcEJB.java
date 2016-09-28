package ejb.basic.statelessSession;

import java.rmi.*;

import javax.ejb.*;


public class CalcEJB implements SessionBean
{
   public CalcEJB()
   {
   }

   public double modifiedAdd(double x, double y)
   {
      return x + y;
   }

   public double add(double x, double y)
   {
      return x + y;
   }

   public double subtract(double x, double y)
   {
      return x - y;
   }

   public double multiply(double x, double y)
   {
      return x * y;
   }

   public double divide(double x, double y)
   {
      return x / y;
   }

   public void ejbCreate()
   {
   }

   public void ejbRemove()
   {
   }

   public void ejbActivate()
   {
   }

   public void ejbPassivate()
   {
   }

   public void setSessionContext(SessionContext ctx)
   {
   }
}
