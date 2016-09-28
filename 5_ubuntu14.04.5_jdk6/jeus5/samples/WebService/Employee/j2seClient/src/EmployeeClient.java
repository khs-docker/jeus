package com.tmax.webservice.employee;


/*
 * Created on 2005. 2. 01.
 * @autor powflash@tmax.co.kr
 */
import javax.xml.rpc.holders.DoubleHolder;


public class EmployeeClient
{
   public static void main(String[] argv)
   {
      try
      {
         EmployeeServiceIF port = new EmployeeService_Impl().getEmployeeServiceIFPort();

         /* Before working */
         port.removeEmployee("1234");
         System.out.println("Remove complete");

         /* Employee Insert */
         Employee emp_add = new Employee();
         emp_add.setEmpNo("1234");
         emp_add.setName("Peter Go");
         emp_add.setJob("QA");
         emp_add.setManager("223");
         emp_add.setHireDate("2004-03-02");
         emp_add.setSalary("2600");
         emp_add.setCommission("500");
         emp_add.setDeptNo("30");
         port.addEmployee(emp_add);
         System.out.println("Insert Complete");

         /* Employee Select */
         Employee emp_select = new Employee();
         emp_select = port.findEmployee("1234");
         System.out.println("------------------------------------------------------------------------");
         System.out.println("                      Employee         Table                            ");
         System.out.println("------------------------------------------------------------------------");
         System.out.println("    EmpNo    Name    Job    Mgr     Date     Sal    Comm   DeptNo       ");
         System.out.println("------------------------------------------------------------------------");
         System.out.println("   " + emp_select.getEmpNo() + " - " + emp_select.getName() + " - " + emp_select.getJob() + " - " + emp_select.getManager() + " - " + emp_select.getHireDate() + " - " + emp_select.getSalary() + " - " + emp_select.getCommission() + " - " + emp_select.getDeptNo());
         System.out.println("------------------------------------------------------------------------");

         /* Employee Update */
         Employee emp_mod = new Employee();
         emp_mod.setName("Peter Go 2");
         emp_mod.setJob("QA 2");
         emp_mod.setManager("223");
         emp_mod.setHireDate("2004-03-02");
         emp_mod.setSalary("2600");
         emp_mod.setCommission("500");
         emp_mod.setDeptNo("30");
         emp_mod.setEmpNo("1234");
         port.modifyEmployee(emp_mod);
         System.out.println("Modify Complete");

         /* Employee Select */
         Employee emp_select2 = new Employee();
         emp_select2 = port.findEmployee("1234");
         System.out.println("------------------------------------------------------------------------");

         System.out.println("   " + emp_select2.getEmpNo() + " - " + emp_select2.getName() + " - " + emp_select2.getJob() + " - " + emp_select2.getManager() + " - " + emp_select2.getHireDate() + " - " + emp_select2.getSalary() + " - " + emp_select2.getCommission() + " - " + emp_select2.getDeptNo());
         System.out.println("------------------------------------------------------------------------");

         /* Employee Delete */
         port.removeEmployee("1234");
         System.out.println("Remove complete");
         System.out.println("                                                                        ");

         /* Find Employees */
         Employee [] employees = port.findEmployees();
         System.out.println("------------------------------------------------------------------------");
         System.out.println("          Find        Employees        Table                            ");
         System.out.println("------------------------------------------------------------------------");
         System.out.println("    EmpNo    Name    Job    Mgr     Date     Sal    Comm   DeptNo       ");
         System.out.println("------------------------------------------------------------------------");

         for (int j = 0; j < employees.length; j++)
            System.out.println("   " + employees[j].getEmpNo() + " - " + employees[j].getName() + " - " + employees[j].getJob() + " - " + employees[j].getManager() + " - " + employees[j].getHireDate() + " - " + employees[j].getSalary() + " - " + employees[j].getCommission() + " - " + employees[j].getDeptNo());

         System.out.println("------------------------------------------------------------------------");
         System.out.println("                Find Employees complete successfully!!                  ");
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
   }
}
