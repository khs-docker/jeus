/**
 * EmployeeServiceIF.java
 *
 * This file was auto-generated from WSDL
 *  by the JEUS Web Services Wsdl-to-Java Emitter
 */

package com.tmax.webservices.emp;

public interface EmployeeServiceIF extends java.rmi.Remote {
    public void addEmployee(com.tmax.webservices.emp.Employee in0) throws java.rmi.RemoteException;

    public void modifyEmployee(com.tmax.webservices.emp.Employee in0) throws java.rmi.RemoteException;

    public void removeEmployee(java.lang.String in0) throws java.rmi.RemoteException;

    public com.tmax.webservices.emp.Employee findEmployee(java.lang.String in0) throws java.rmi.RemoteException;

    public com.tmax.webservices.emp.ArrayOfEmployee findEmployees() throws java.rmi.RemoteException;

}
