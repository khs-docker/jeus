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
    * @return commission을 리턴합니다.
    */
   public String getCommission()
   {
      return commission;
   }

   /**
    * @param commission 설정하려는 commission.
    */
   public void setCommission(String commission)
   {
      this.commission = commission;
   }

   /**
    * @return deptNo을 리턴합니다.
    */
   public String getDeptNo()
   {
      return deptNo;
   }

   /**
    * @param deptNo 설정하려는 deptNo.
    */
   public void setDeptNo(String deptNo)
   {
      this.deptNo = deptNo;
   }

   /**
    * @return empNo을 리턴합니다.
    */
   public String getEmpNo()
   {
      return empNo;
   }

   /**
    * @param empNo 설정하려는 empNo.
    */
   public void setEmpNo(String empNo)
   {
      this.empNo = empNo;
   }

   /**
    * @return hireDate을 리턴합니다.
    */
   public String getHireDate()
   {
      return hireDate;
   }

   /**
    * @param hireDate 설정하려는 hireDate.
    */
   public void setHireDate(String hireDate)
   {
      this.hireDate = hireDate;
   }

   /**
    * @return job을 리턴합니다.
    */
   public String getJob()
   {
      return job;
   }

   /**
    * @param job 설정하려는 job.
    */
   public void setJob(String job)
   {
      this.job = job;
   }

   /**
    * @return manager을 리턴합니다.
    */
   public String getManager()
   {
      return manager;
   }

   /**
    * @param manager 설정하려는 manager.
    */
   public void setManager(String manager)
   {
      this.manager = manager;
   }

   /**
    * @return name을 리턴합니다.
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name 설정하려는 name.
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * @return salary을 리턴합니다.
    */
   public String getSalary()
   {
      return salary;
   }

   /**
    * @param salary 설정하려는 salary.
    */
   public void setSalary(String salary)
   {
      this.salary = salary;
   }
}
