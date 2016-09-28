/**
 * EmployeeServiceIF.java
 *
 * This file was auto-generated from WSDL
 *  by the JEUS Web Services Wsdl-to-Java Emitter
 */

package com.tmax.webservice.employee;

public interface EmployeeServiceIF extends java.rmi.Remote {
    public void addEmployee(com.tmax.webservice.employee.Employee in0) throws java.rmi.RemoteException;

    public void modifyEmployee(com.tmax.webservice.employee.Employee in0) throws java.rmi.RemoteException;

    public void removeEmployee(java.lang.String in0) throws java.rmi.RemoteException;

    public com.tmax.webservice.employee.Employee findEmployee(java.lang.String in0) throws java.rmi.RemoteException;

    public com.tmax.webservice.employee.Employee[] findEmployees() throws java.rmi.RemoteException;

}
