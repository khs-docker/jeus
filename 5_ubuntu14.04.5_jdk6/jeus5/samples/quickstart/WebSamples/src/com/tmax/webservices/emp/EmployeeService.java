/**
 * EmployeeService.java
 *
 * This file was auto-generated from WSDL
 *  by the JEUS Web Services Wsdl-to-Java Emitter
 */

package com.tmax.webservices.emp;

public interface EmployeeService extends javax.xml.rpc.Service {
    public java.lang.String getEmployeeServiceIFPortAddress();

    public com.tmax.webservices.emp.EmployeeServiceIF getEmployeeServiceIFPort() throws javax.xml.rpc.ServiceException;

    public com.tmax.webservices.emp.EmployeeServiceIF getEmployeeServiceIFPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
