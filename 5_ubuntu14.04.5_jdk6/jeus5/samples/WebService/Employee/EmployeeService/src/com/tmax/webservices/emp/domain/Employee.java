/*
 * Date : 2004. 12. 3.
 *
 * Copyright (c) 1998-2004 by TmaxSoft, Inc. All Rights Reserved.
 * @author Peter Go
 */
package com.tmax.webservices.emp.domain;

public class Employee
{
   private String empNo;
   private String name;
   private String job;
   private String manager;
   private String hireDate;
   private String salary;
   private String commission;
   private String deptNo;

   /**
    *
    */
   public Employee()
   {
      super();
   }

   /**
    * @return commission�� �����մϴ�.
    */
   public String getCommission()
   {
      return commission;
   }

   /**
    * @param commission �����Ϸ��� commission.
    */
   public void setCommission(String commission)
   {
      this.commission = commission;
   }

   /**
    * @return deptNo�� �����մϴ�.
    */
   public String getDeptNo()
   {
      return deptNo;
   }

   /**
    * @param deptNo �����Ϸ��� deptNo.
    */
   public void setDeptNo(String deptNo)
   {
      this.deptNo = deptNo;
   }

   /**
    * @return empNo�� �����մϴ�.
    */
   public String getEmpNo()
   {
      return empNo;
   }

   /**
    * @param empNo �����Ϸ��� empNo.
    */
   public void setEmpNo(String empNo)
   {
      this.empNo = empNo;
   }

   /**
    * @return hireDate�� �����մϴ�.
    */
   public String getHireDate()
   {
      return hireDate;
   }

   /**
    * @param hireDate �����Ϸ��� hireDate.
    */
   public void setHireDate(String hireDate)
   {
      this.hireDate = hireDate;
   }

   /**
    * @return job�� �����մϴ�.
    */
   public String getJob()
   {
      return job;
   }

   /**
    * @param job �����Ϸ��� job.
    */
   public void setJob(String job)
   {
      this.job = job;
   }

   /**
    * @return manager�� �����մϴ�.
    */
   public String getManager()
   {
      return manager;
   }

   /**
    * @param manager �����Ϸ��� manager.
    */
   public void setManager(String manager)
   {
      this.manager = manager;
   }

   /**
    * @return name�� �����մϴ�.
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name �����Ϸ��� name.
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * @return salary�� �����մϴ�.
    */
   public String getSalary()
   {
      return salary;
   }

   /**
    * @param salary �����Ϸ��� salary.
    */
   public void setSalary(String salary)
   {
      this.salary = salary;
   }
}
