/**
 * Employee.java
 *
 * This file was auto-generated from WSDL
 *  by the JEUS Web Services Wsdl-to-Java Emitter
 */

package com.tmax.webservices.emp;

public class Employee  implements java.io.Serializable {
    private java.lang.String commission;
    private java.lang.String deptNo;
    private java.lang.String empNo;
    private java.lang.String hireDate;
    private java.lang.String job;
    private java.lang.String manager;
    private java.lang.String name;
    private java.lang.String salary;

    public Employee() {
    }

    public Employee(
           java.lang.String commission,
           java.lang.String deptNo,
           java.lang.String empNo,
           java.lang.String hireDate,
           java.lang.String job,
           java.lang.String manager,
           java.lang.String name,
           java.lang.String salary) {
           this.commission = commission;
           this.deptNo = deptNo;
           this.empNo = empNo;
           this.hireDate = hireDate;
           this.job = job;
           this.manager = manager;
           this.name = name;
           this.salary = salary;
    }


    /**
     * Gets the commission value for this Employee.
     * 
     * @return commission
     */
    public java.lang.String getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this Employee.
     * 
     * @param commission
     */
    public void setCommission(java.lang.String commission) {
        this.commission = commission;
    }


    /**
     * Gets the deptNo value for this Employee.
     * 
     * @return deptNo
     */
    public java.lang.String getDeptNo() {
        return deptNo;
    }


    /**
     * Sets the deptNo value for this Employee.
     * 
     * @param deptNo
     */
    public void setDeptNo(java.lang.String deptNo) {
        this.deptNo = deptNo;
    }


    /**
     * Gets the empNo value for this Employee.
     * 
     * @return empNo
     */
    public java.lang.String getEmpNo() {
        return empNo;
    }


    /**
     * Sets the empNo value for this Employee.
     * 
     * @param empNo
     */
    public void setEmpNo(java.lang.String empNo) {
        this.empNo = empNo;
    }


    /**
     * Gets the hireDate value for this Employee.
     * 
     * @return hireDate
     */
    public java.lang.String getHireDate() {
        return hireDate;
    }


    /**
     * Sets the hireDate value for this Employee.
     * 
     * @param hireDate
     */
    public void setHireDate(java.lang.String hireDate) {
        this.hireDate = hireDate;
    }


    /**
     * Gets the job value for this Employee.
     * 
     * @return job
     */
    public java.lang.String getJob() {
        return job;
    }


    /**
     * Sets the job value for this Employee.
     * 
     * @param job
     */
    public void setJob(java.lang.String job) {
        this.job = job;
    }


    /**
     * Gets the manager value for this Employee.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this Employee.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }


    /**
     * Gets the name value for this Employee.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Employee.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the salary value for this Employee.
     * 
     * @return salary
     */
    public java.lang.String getSalary() {
        return salary;
    }


    /**
     * Sets the salary value for this Employee.
     * 
     * @param salary
     */
    public void setSalary(java.lang.String salary) {
        this.salary = salary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.deptNo==null && other.getDeptNo()==null) || 
             (this.deptNo!=null &&
              this.deptNo.equals(other.getDeptNo()))) &&
            ((this.empNo==null && other.getEmpNo()==null) || 
             (this.empNo!=null &&
              this.empNo.equals(other.getEmpNo()))) &&
            ((this.hireDate==null && other.getHireDate()==null) || 
             (this.hireDate!=null &&
              this.hireDate.equals(other.getHireDate()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.salary==null && other.getSalary()==null) || 
             (this.salary!=null &&
              this.salary.equals(other.getSalary())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getDeptNo() != null) {
            _hashCode += getDeptNo().hashCode();
        }
        if (getEmpNo() != null) {
            _hashCode += getEmpNo().hashCode();
        }
        if (getHireDate() != null) {
            _hashCode += getHireDate().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSalary() != null) {
            _hashCode += getSalary().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
