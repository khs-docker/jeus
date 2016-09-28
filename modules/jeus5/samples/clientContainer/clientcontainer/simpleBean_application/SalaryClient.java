package simpleBean;

import simpleBean.*;

import java.sql.*;

import javax.ejb.*;

import javax.naming.InitialContext;


public class SalaryClient
{
   public static void main(String[] args)
   {
      try
      {
         InitialContext ctx = new InitialContext();

         SalaryHome home = (SalaryHome)ctx.lookup("Salary");

         Salary bean = home.create();

         System.out.println("[SalaryClient] SalaryEJB is retrieved ..");

         try
         {
            System.out.println("[SalaryClient] Monthly net salary: " + bean.calculateSalary(28000, 2, 500));
         }
         catch (SQLException se)
         {
            System.out.println("[SalaryClient] SQLException: " + se);
         }
      }
      catch (javax.naming.NamingException ne)
      {
         System.out.println("[SalaryClient] Naming Exception caught: " + ne);
      }
      catch (javax.ejb.CreateException ce)
      {
         System.out.println("[SalaryClient] Create Exception caught: " + ce);
      }
      catch (java.rmi.RemoteException re)
      {
         System.out.println("[SalaryClient] Remote Exception caught: " + re);
      }
   }
}
