package simpleBean;

import java.rmi.RemoteException;

import java.sql.*;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;

import javax.sql.*;


public class SalaryEJB implements EntityBean
{
   private int id;
   private int first;
   private int last;
   Connection con = null;
   private EntityContext context;
   private String dbName = "datasource1";
   InitialContext ic;
   DataSource ds;

   public String ejbCreate() throws CreateException
   {
      return "sucess";
   }

   public void ejbRemove()
   {
   }

   public void setEntityContext(EntityContext context)
   {
      this.context = context;

      try
      {
         ic = new InitialContext();
         ds = (DataSource)ic.lookup(dbName);
      }
      catch (Exception ex)
      {
         ex.printStackTrace();
      }
   }

   public void unsetEntityContext()
   {
   }

   public void ejbActivate()
   {
   }

   public void ejbPassivate()
   {
   }

   public void ejbLoad()
   {
   }

   public void ejbStore()
   {
   }

   public void ejbPostCreate()
   {
   }

   public String calculateSalary(int id, int first, int last) throws RemoteException, SQLException
   {
      System.out.println("[SalaryEJB] calculateSalary() is invoked..");

      String total = "";

      try
      {
         con = ds.getConnection();

         String insertStatement = "INSERT INTO SALARY VALUES ( ? , ? , ? )";
         PreparedStatement prepStmt = con.prepareStatement(insertStatement);

         total = String.valueOf(id) + String.valueOf(first) + String.valueOf(last);
         prepStmt.setInt(1, id);
         prepStmt.setInt(2, first);
         prepStmt.setInt(3, last);

         prepStmt.executeUpdate();
         con.commit();
         prepStmt.close();
      }
      finally
      {
         if (con != null)
         {
            con.close();
         }
      }

      return total;
   }
}
