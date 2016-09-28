/*
 * [EmployeeServiceIF.java]
 *
 * @Peter Go Copyright (c) 1998-2004 by TmaxSoft, Inc. All Rights Reserved.
 *
 */
package com.tmax.webservices.emp.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;


public class DBPoolMgr
{
   // private static member variable
   private static DBPoolMgr pool = null;

   //
   private DataSource ds = null;

   // 
   private Connection con = null;

   // datasource jndi name
   private String poolName = null;

   // private constructor
   private DBPoolMgr(String poolName)
   {
      setPoolName(poolName);
      initDataSource();
   }

   // get DBPoolMgr object for singleton pattern
   public static DBPoolMgr getDBPoolMgr(String poolName)
   {
      if (pool == null)
      {
         pool = new DBPoolMgr(poolName);
      }

      return pool;
   }

   /**
    *
    * @return java.sql.Connection
    * @throws SQLException
    */
   public Connection getConnection() throws SQLException
   {
      if (ds == null)
      {
         initDataSource();
      }

      con = ds.getConnection();

      System.out.println("Connection rendering........!!");

      return con;
   }

   /**
    * DataSource initializing....
    */
   private void initDataSource()
   {
      try
      {
         InitialContext ic = new InitialContext();
         ds = (DataSource)ic.lookup(this.getPoolName());
         System.out.println("DataSource lookup success !!");
      }
      catch (NamingException ne)
      {
         System.out.println("NamingException error.." + ne.toString());
      }
   }

   /**
        * @return
        */
   public String getPoolName()
   {
      return poolName;
   }

   /**
    * @param string
    */
   public void setPoolName(String string)
   {
      poolName = string;
   }
}
