package ejb.basic.beanManaged;

import java.rmi.RemoteException;

import java.sql.*;

import java.util.*;

import javax.ejb.*;

import javax.naming.*;

import javax.rmi.*;

import javax.sql.*;


public class ProductEJB implements EntityBean
{
   private String id;
   private String name;
   private double price;
   private EntityContext ctx;

   public String ejbCreate(String id, String name, double price) throws CreateException
   {
      this.id = id;

      this.name = name;

      this.price = price;

      Connection con = null;

      PreparedStatement ps = null;

      String sql = "INSERT INTO product_basbmp (id, name, price) VALUES (?, ?, ?)";

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
         e.printStackTrace();
         throw new CreateException("Fail to create. " + e.getMessage());
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

   public void ejbPostCreate(String id, String name, double price)
   {
   }

   public String ejbFindByPrimaryKey(String id) throws FinderException
   {
      Connection con = null;

      PreparedStatement ps = null;

      ResultSet rs = null;

      String sql = "SELECT id FROM product_basbmp WHERE id = ?";

      try
      {
         con = this.getConnection();

         ps = con.prepareStatement(sql);

         ps.setString(1, id);

         rs = ps.executeQuery();

         if (!rs.next())
         {
            throw new ObjectNotFoundException("Fail to find product_basbmp with id '" + id + "'");
         }
      }

      catch (SQLException e)
      {
         throw new FinderException("Fail to find.");
      }

      finally
      {
         try
         {
            if (rs != null)
            {
               rs.close();
            }

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

   public Collection ejbFindByName(String name) throws FinderException
   {
      Connection con = null;

      PreparedStatement ps = null;

      ResultSet rs = null;

      String sql = "SELECT id FROM product_basbmp WHERE name = ?";

      Vector keys = new Vector();

      try
      {
         con = this.getConnection();

         ps = con.prepareStatement(sql);

         ps.setString(1, name);

         rs = ps.executeQuery();

         while (rs.next())
         {
            keys.addElement(rs.getString(1));
         }
      }

      catch (SQLException e)
      {
         throw new FinderException("Fail to find.");
      }

      finally
      {
         try
         {
            if (rs != null)
            {
               rs.close();
            }

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

      return keys;
   }

   public Collection ejbFindAll() throws FinderException
   {
      Connection con = null;

      PreparedStatement ps = null;

      ResultSet rs = null;

      String sql = "SELECT id FROM product_basbmp";

      Vector keys = new Vector();

      try
      {
         con = this.getConnection();

         ps = con.prepareStatement(sql);

         rs = ps.executeQuery();

         while (rs.next())
         {
            keys.addElement(rs.getString(1));
         }
      }

      catch (SQLException e)
      {
         throw new FinderException("Fail to find");
      }

      finally
      {
         try
         {
            if (rs != null)
            {
               rs.close();
            }

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

      return keys;
   }

   public Collection ejbFindInPriceRange(double min, double max) throws FinderException
   {
      Connection con = null;

      PreparedStatement ps = null;

      ResultSet rs = null;

      String sql = "SELECT id FROM product_basbmp WHERE price BETWEEN ? AND ?";

      Vector keys = new Vector();

      try
      {
         con = this.getConnection();

         ps = con.prepareStatement(sql);

         ps.setDouble(1, min);

         ps.setDouble(2, max);

         rs = ps.executeQuery();

         while (rs.next())
         {
            keys.addElement(rs.getString(1));
         }
      }

      catch (SQLException e)
      {
         throw new FinderException("Fail to find");
      }

      finally
      {
         try
         {
            if (rs != null)
            {
               rs.close();
            }

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

      return keys;
   }

   public void ejbActivate()
   {
      System.out.println("===== EJB Activation !! =====");
   }

   public void ejbPassivate()
   {
      System.out.println("===== EJB Passivation !! =====");
   }

   public void ejbLoad()
   {
      String primaryKey = (String)ctx.getPrimaryKey();

      Connection con = null;

      PreparedStatement ps = null;

      ResultSet rs = null;

      String sql = "SELECT name, price FROM product_basbmp WHERE id = ?";

      try
      {
         con = getConnection();

         ps = con.prepareStatement(sql);

         ps.setString(1, primaryKey);

         rs = ps.executeQuery();

         if (rs.next())
         {
            id = primaryKey;

            name = rs.getString(1);

            price = rs.getDouble(2);
         }

         else
         {
            throw new EJBException("Fail to load");
         }
      }

      catch (SQLException e)
      {
         throw new EJBException(e);
      }

      finally
      {
         try
         {
            if (rs != null)
            {
               rs.close();
            }

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

   public void ejbStore()
   {
      System.out.println("===== EJB Store !! =====");

      Connection con = null;

      PreparedStatement ps = null;

      String sql = "UPDATE product_basbmp SET name = ?, price = ? WHERE id = ?";

      try
      {
         con = getConnection();

         ps = con.prepareStatement(sql);

         ps.setString(1, name);

         ps.setDouble(2, price);

         ps.setString(3, id);

         int result = ps.executeUpdate();

         if (result != 1)
         {
            throw new EJBException();
         }
      }

      catch (SQLException e)
      {
         throw new EJBException(e);
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

   public void ejbRemove()
   {
      System.out.println("===== EJB Removed !! =====");

      Connection con = null;

      PreparedStatement ps = null;

      String sql = "DELETE FROM product_basbmp WHERE id = ?";

      try
      {
         con = getConnection();

         ps = con.prepareStatement(sql);

         ps.setString(1, id);

         int result = ps.executeUpdate();

         if (result != 1)
         {
            throw new EJBException("data is not exist.");
         }
      }

      catch (SQLException e)
      {
         throw new EJBException(e);
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

   public void setEntityContext(EntityContext ctx)
   {
      this.ctx = ctx;
   }

   public void unsetEntityContext()
   {
      ctx = null;
   }

   public String getName()
   {
      return name;
   }

   public double getPrice()
   {
      return price;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   private Connection getConnection() throws SQLException
   {
      DataSource ds = null;

      try
      {
         InitialContext initial = new InitialContext();

         ds = (DataSource)initial.lookup("datasource1");
      }

      catch (NamingException e)
      {
         e.printStackTrace();
         System.out.println("Fail to look up DataSource.");

         throw new SQLException(e.getMessage());
      }

      return ds.getConnection();
   }
}
