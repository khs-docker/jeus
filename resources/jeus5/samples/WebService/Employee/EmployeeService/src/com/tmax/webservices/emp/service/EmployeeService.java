/*
 * Date : 2004. 12. 3.
 *
 * Copyright 2004 The Tmax Soft Quality Assurance Team
 */
package com.tmax.webservices.emp.service;

import com.tmax.webservices.emp.dao.EmployeeDao;
import com.tmax.webservices.emp.domain.Employee;

import java.sql.SQLException;


/**
 * @
 *
 */
public class EmployeeService
{
   EmployeeDao dao = null;

   /**
    *
    */
   public EmployeeService()
   {
      dao = new EmployeeDao();
   }

   /**
    *
    * @param emp
    * @return
    */
   public void addEmployee(Employee emp) throws Exception
   {
      if (!dao.insertEmployee(emp))
      {
         throw new Exception("Employee add fail");
      }
   }

   /**
    *
    * @param emp
    * @return
    * @throws Exception
    */
   public void modifyEmployee(Employee emp) throws Exception
   {
      if (!dao.updateEmployee(emp))
      {
         throw new Exception("Employee modify fail");
      }
   }

   /**
    *
    * @param empNo
    * @throws Exception
    */
   public void removeEmployee(String empNo) throws Exception
   {
      if (!dao.deleteEmployee(empNo))
      {
         throw new Exception("Employee remove fail");
      }
   }

   /**
    *
    * @param empNo
    * @return
    * @throws Exception
    */
   public Employee findEmployee(String empNo) throws Exception
   {
      Employee emp = dao.selectEmployee(empNo);

      if (emp == null)
      {
         throw new Exception("Not exist Employee");
      }

      return emp;
   }

   public Employee[] findEmployees() throws SQLException
   {
      try
      {
         return dao.selectEmployees();
      }
      catch (SQLException e)
      {
         throw new SQLException("Can not find employee");
      }
   }
}
