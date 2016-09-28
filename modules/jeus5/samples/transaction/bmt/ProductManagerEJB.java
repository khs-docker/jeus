package transaction.bmt;

import java.rmi.*;

import java.sql.*;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;

import javax.rmi.*;

import javax.sql.*;

import javax.transaction.*;


public class ProductManagerEJB implements SessionBean
{
   SessionContext ejbContext;

   public ProductManagerEJB()
   {
   }

   public void transactionTest() throws EJBException
   {
      UserTransaction tx = null;

      try
      {
         int number = 20;
         String[] products = new String[number];

         tx = ejbContext.getUserTransaction();
         tx.begin();

         // insert products
         for (int i = 0; i < (number / 2); i++)
         {
            System.out.println("inserting product_trbmt id=" + i + "b ...");
            products[i] = insertProduct(i + "b", "ball pen", i * 10);
         }

         for (int i = number / 2; i < number; i++)
         {
            System.out.println("inserting product_trbmt id=" + i + "f ...");
            products[i] = insertProduct(i + "f", "fountain pen", (i - (number / 3)) * 50);
         }

         System.out.println("completed inserting products!!");

         for (int i = 0; i < number; i++)
         {
            System.out.println("deleting product_trbmt id=" + products[i] + " ...");
            deleteProduct(products[i]);
         }

         System.out.println("completed deleting products!!");

         tx.commit();
      }
      catch (javax.transaction.SystemException se)
      {
         throw new EJBException("Transaction System Error caught : " + se.getMessage());
      }
      catch (javax.transaction.RollbackException re)
      {
         throw new EJBException("Transaction Rollback Error caught : " + re.getMessage());
      }
      catch (Exception e)
      {
         try
         {
            tx.rollback();
         }
         catch (Exception ee)
         {
            throw new EJBException("Transaction Rollback error : " + ee.getMessage());
         }

         throw new EJBException("Error caught : " + e.getMessage());
      }
   }

   private Connection getConnection() throws NamingException, SQLException
   {
      DataSource ds = null;

      try
      {
         InitialContext initial = new InitialContext();
         ds = (DataSource)initial.lookup("localxa");
      }
      catch (NamingException e)
      {
         System.out.println("Fail to look up DataSource.");
         throw e;
      }

      return ds.getConnection();
   }

   private String insertProduct(String id, String name, double price) throws NamingException, SQLException
   {
      Connection con = null;
      PreparedStatement ps = null;
      String sql = "INSERT INTO product_trbmt (id, name, price) VALUES (?, ?, ?)";

      try
      {
         con = getConnection();
         ps = con.prepareStatement(sql);
         ps.setString(1, id);
         ps.setString(2, name);
         ps.setDouble(3, price);
         ps.executeUpdate();
      }
      catch (SQLException e)
      {
         System.out.println("Fail to insert a product_trbmt into database.");
         throw e;
      }
      finally
      {
         try
         {
            if (ps != null)
            {
               ps.close();
            }

            if (con != null)
            {
               con.close();
            }
         }
         catch (SQLException se)
         {
         }
      }

      return id;
   }

   private void deleteProduct(String id) throws NamingException, SQLException
   {
      Connection con = null;
      PreparedStatement ps = null;
      String sql = "DELETE FROM product_trbmt WHERE id = ?";

      try
      {
         con = getConnection();
         ps = con.prepareStatement(sql);
         ps.setString(1, id);

         int result = ps.executeUpdate();

         if (result != 1)
         {
            throw new EJBException();
         }
      }
      catch (SQLException e)
      {
         System.out.println("Fail to remove product_trbmt data with id '" + id + "'");
         throw e;
      }
      finally
      {
         try
         {
            if (ps != null)
            {
               ps.close();
            }

            if (con != null)
            {
               con.close();
            }
         }
         catch (SQLException se)
         {
         }
      }
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
      this.ejbContext = ctx;
   }
}
