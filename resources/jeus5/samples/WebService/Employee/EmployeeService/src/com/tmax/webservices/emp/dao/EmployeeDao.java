/**
 * [Java EmployeeDao.java]
 *
 * @Peter Go Copyright (c) 1998-2005 by TmaxSoft, Inc. All Rights Reserved.
 */
package com.tmax.webservices.emp.dao;

import com.tmax.webservices.emp.domain.Employee;
import com.tmax.webservices.emp.util.DBPoolMgr;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;


public class EmployeeDao
{
   //
   DBPoolMgr dbMgr = DBPoolMgr.getDBPoolMgr("datasource1");

   public EmployeeDao()
   {
      dbMgr = DBPoolMgr.getDBPoolMgr("datasource1");

      if (dbMgr == null)
      {
         System.err.println("DBPoolMgr getInstance error...");

         return;
      }
   }

   /**
    *
    * @param emp
    * @return
    */
   public boolean insertEmployee(Employee emp) throws SQLException
   {
      boolean flag = true;
      Connection conn = null;
      PreparedStatement pstmt = null;
      StringBuffer sb = null;

      try
      {
         conn = dbMgr.getConnection();
         sb = new StringBuffer();
         sb.append("INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) ");
         sb.append("VALUES ");
         sb.append("(?, ?, ?, ?, ?, ?, ?, ?)");

         // sb.append("(?, ?, ?, ?, to_date(?, 'YYYY-MM-DD'), ?, ?, ?)");
         pstmt = conn.prepareStatement(sb.toString());

         pstmt.clearParameters();

         pstmt.setString(1, emp.getEmpNo());
         pstmt.setString(2, emp.getName());
         pstmt.setString(3, emp.getJob());
         pstmt.setString(4, emp.getManager());
         pstmt.setString(5, emp.getHireDate());
         pstmt.setString(6, emp.getSalary());
         pstmt.setString(7, emp.getCommission());
         pstmt.setString(8, emp.getDeptNo());

         pstmt.executeUpdate();

         //pstmt.execute();
         //System.out.println(emp.getEmpNo() + " : " + emp.getName() + " : " + emp.getJob() + " : " + emp.getManager() + " : " + emp.getHireDate() + " : " + emp.getSalary() + " : " + emp.getCommission() + " : " + emp.getDeptNo());
      }
      catch (SQLException e)
      {
         flag = false;
         e.printStackTrace();
      }
      finally
      {
         resourceClose(null, pstmt, conn);
      }

      return flag;
   }

   /**
    *
    * @param emp
    * @return
    */
   public boolean updateEmployee(Employee emp) throws SQLException
   {
      boolean flag = true;
      Connection conn = null;
      PreparedStatement pstmt = null;
      StringBuffer sb = null;

      try
      {
         conn = dbMgr.getConnection();
         sb = new StringBuffer();
         sb.append("UPDATE EMP SET ");
         sb.append("ENAME=?, JOB=?, MGR=?, HIREDATE=?, SAL=?, COMM=?, DEPTNO=? ");

         //sb.append("ENAME=?, JOB=?, MGR=?, HIREDATE=to_date(?, 'YYYY-MM-DD'), SAL=?, COMM=?, DEPTNO=? ");
         sb.append("WHERE ");
         sb.append("EMPNO = ?");

         pstmt = conn.prepareStatement(sb.toString());

         pstmt.clearParameters();

         pstmt.setString(1, emp.getName());
         pstmt.setString(2, emp.getJob());
         pstmt.setString(3, emp.getManager());
         pstmt.setString(4, emp.getHireDate());
         pstmt.setString(5, emp.getSalary());
         pstmt.setString(6, emp.getCommission());
         pstmt.setString(7, emp.getDeptNo());
         pstmt.setString(8, emp.getEmpNo());

         pstmt.executeUpdate();
      }
      catch (SQLException e)
      {
         flag = false;
         e.printStackTrace();
      }
      finally
      {
         resourceClose(null, pstmt, conn);
      }

      return flag;
   }

   /**
    *
    * @param emp
    * @return
    */
   public boolean deleteEmployee(String empNo) throws SQLException
   {
      boolean flag = true;
      Connection conn = null;
      PreparedStatement pstmt = null;
      StringBuffer sb = null;

      try
      {
         conn = dbMgr.getConnection();
         sb = new StringBuffer();
         sb.append("DELETE FROM EMP ");
         sb.append("WHERE ");
         sb.append("EMPNO = ? ");

         pstmt = conn.prepareStatement(sb.toString());

         pstmt.clearParameters();

         pstmt.setString(1, empNo);

         pstmt.executeUpdate();
      }
      catch (SQLException e)
      {
         flag = false;
         e.printStackTrace();
      }
      finally
      {
         resourceClose(null, pstmt, conn);
      }

      return flag;
   }

   /**
    *
    * @param emp
    * @return
    */
   public Employee selectEmployee(String empNo) throws SQLException
   {
      Employee emp = null;
      Connection conn = null;
      Statement stmt = null;
      ResultSet rset = null;
      StringBuffer sb = null;

      try
      {
         conn = dbMgr.getConnection();
         sb = new StringBuffer();

         //sb.append("SELECT EMPNO, ENAME, JOB, MGR, TO_CHAR(HIREDATE,'YYYY-MM-DD') AS HIREDATE, SAL, COMM, DEPTNO ");
         sb.append("SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO ");
         sb.append("  FROM EMP");
         sb.append(" WHERE EMPNO = ").append(empNo);

         stmt = conn.createStatement();

         rset = stmt.executeQuery(sb.toString());

         if (rset.next())
         {
            emp = new Employee();
            emp.setEmpNo(rset.getString("EMPNO"));
            emp.setName(rset.getString("ENAME"));
            emp.setJob(rset.getString("JOB"));
            emp.setManager(rset.getString("MGR"));
            emp.setHireDate(rset.getString("HIREDATE"));
            emp.setSalary(rset.getString("SAL"));
            emp.setCommission(rset.getString("COMM"));
            emp.setDeptNo(rset.getString("DEPTNO"));
         }
      }
      catch (SQLException e)
      {
         e.printStackTrace();
      }
      finally
      {
         resourceClose(rset, stmt, conn);
      }

      return emp;
   }

   /**
    *
    * @param emp
    * @return
    */
   public Employee[] selectEmployees() throws SQLException
   {
      List employees = null;
      Connection conn = null;
      Statement stmt = null;
      ResultSet rset = null;
      StringBuffer sb = null;
      int cnt = 0;

      try
      {
         conn = dbMgr.getConnection();
         sb = new StringBuffer();
         sb.append("SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO ");

         //sb.append("SELECT EMPNO, ENAME, JOB, MGR, TO_CHAR(HIREDATE,'YYYY-MM-DD') AS HIREDATE, SAL, COMM, DEPTNO ");
         sb.append("  FROM EMP");

         stmt = conn.createStatement();

         rset = stmt.executeQuery(sb.toString());

         Employee emp = null;
         employees = new ArrayList();

         while (rset.next())
         {
            emp = new Employee();
            emp.setEmpNo(rset.getString("EMPNO"));
            emp.setName(rset.getString("ENAME"));
            emp.setJob(rset.getString("JOB"));
            emp.setManager(rset.getString("MGR"));
            emp.setHireDate(rset.getString("HIREDATE"));
            emp.setSalary(rset.getString("SAL"));
            emp.setCommission(rset.getString("COMM"));
            emp.setDeptNo(rset.getString("DEPTNO"));

            employees.add(emp);
            cnt++;
         }
      }
      catch (SQLException e)
      {
         e.printStackTrace();
      }
      finally
      {
         resourceClose(rset, stmt, conn);
      }

      //Object [] o = employees.toArray();
      Employee[] el = new Employee[cnt];
      Employee e = null;

      for (int k = 0; k < cnt; k++)
      {
         e = new Employee();
         e = (Employee)employees.get(k);
         el[k] = e;
      }

      //el = (Employee [])o;
      //el = (Employee [])employees.toArray();
      return el;
   }

   /*
   public List selectEmployees() throws SQLException{
       List employees = null;
       Connection conn = null;
       Statement stmt = null;
       ResultSet rset = null;
       StringBuffer sb = null;

       try {
                       conn = dbMgr.getConnection();
           sb = new StringBuffer();
           sb.append("SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO ");
           //sb.append("SELECT EMPNO, ENAME, JOB, MGR, TO_CHAR(HIREDATE,'YYYY-MM-DD') AS HIREDATE, SAL, COMM, DEPTNO ");
           sb.append("  FROM EMP");

           stmt = conn.createStatement();

           rset = stmt.executeQuery(sb.toString());

           Employee emp = null;
           employees = new ArrayList();
           while (rset.next()) {
               emp = new Employee();
               emp.setEmpNo(rset.getString("EMPNO"));
               emp.setName(rset.getString("ENAME"));
               emp.setJob(rset.getString("JOB"));
               emp.setManager(rset.getString("MGR"));
               emp.setHireDate(rset.getString("HIREDATE"));
               emp.setSalary(rset.getString("SAL"));
               emp.setCommission(rset.getString("COMM"));
               emp.setDeptNo(rset.getString("DEPTNO"));

               employees.add(emp);
           }

               } catch (SQLException e) {
                       e.printStackTrace();
               } finally {
                   resourceClose(rset, stmt, conn);
               }

               return employees;
   }
   */

   /**
    *
    * @param rset
    * @param stmt
    * @param conn
    */
   private void resourceClose(ResultSet rset, Statement stmt, Connection conn)
   {
      if (rset != null)
      {
         try
         {
            rset.close();
         }
         catch (SQLException e1)
         {
            // ignore ;
         }
      }

      if (stmt != null)
      {
         try
         {
            stmt.close();
         }
         catch (SQLException e2)
         {
            // ignore ;
         }
      }

      if (conn != null)
      {
         try
         {
            conn.close();
         }
         catch (SQLException e3)
         {
            // ignore ;
         }
      }
   }
}
