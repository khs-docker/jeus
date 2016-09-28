/**
 * EmployeeService_Impl.java
 *
 * This file was auto-generated from WSDL
 *  by the JEUS Web Services Wsdl-to-Java Emitter
 */

package com.tmax.webservice.employee;

public class EmployeeService_Impl extends com.tmax.axis.client.Service implements com.tmax.webservice.employee.EmployeeService {

    // Use to get a proxy class for EmployeeServiceIFPort
    private java.lang.String EmployeeServiceIFPort_address = "http://localhost:8088/Employee/EmployeeService";

    public java.lang.String getEmployeeServiceIFPortAddress() {
        return EmployeeServiceIFPort_address;
    }

    // The WSDD service name defaults to the port name.
    private javax.xml.namespace.QName EmployeeServiceIFPortWSDDServiceName = new javax.xml.namespace.QName("urn:EmployeeService", "EmployeeServiceIFPort");

    public javax.xml.namespace.QName getEmployeeServiceIFPortWSDDServiceName() {
        return EmployeeServiceIFPortWSDDServiceName;
    }

    public void setEmployeeServiceIFPortWSDDServiceName(javax.xml.namespace.QName name) {
        EmployeeServiceIFPortWSDDServiceName = name;
    }

    public com.tmax.webservice.employee.EmployeeServiceIF getEmployeeServiceIFPort() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint = null;
        try {
            endpoint = new java.net.URL(EmployeeServiceIFPort_address);
        }
        catch (java.net.MalformedURLException e) {
        }
        return getEmployeeServiceIFPort(endpoint);
    }

    public com.tmax.webservice.employee.EmployeeServiceIF getEmployeeServiceIFPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.tmax.webservice.employee.EmployeeServiceIFSoapBinding_Stub _stub = new com.tmax.webservice.employee.EmployeeServiceIFSoapBinding_Stub(portAddress, this);
            _stub._setPortName(getEmployeeServiceIFPortWSDDServiceName());
            return _stub;
        }
        catch (com.tmax.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmployeeServiceIFPortEndpointAddress(java.lang.String address) {
        EmployeeServiceIFPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            javax.xml.namespace.QName wsdlPortName = (javax.xml.namespace.QName)portInfoMap.get(serviceEndpointInterface.getName());
            if(wsdlPortName !=null){
                return getPort(wsdlPortName, serviceEndpointInterface);
            }
            if (com.tmax.webservice.employee.EmployeeServiceIF.class.isAssignableFrom(serviceEndpointInterface)) {
                java.net.URL endpoint = null;
                try {
                    endpoint = new java.net.URL(EmployeeServiceIFPort_address);
                }
                catch (java.net.MalformedURLException e) {
                }
                com.tmax.webservice.employee.EmployeeServiceIFSoapBinding_Stub _stub = new com.tmax.webservice.employee.EmployeeServiceIFSoapBinding_Stub(endpoint, this);
                _stub._setPortName(getEmployeeServiceIFPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        try {
            if (portName.equals(getEmployeeServiceIFPortWSDDServiceName())) {
                com.tmax.axis.client.Stub _stub = null;
                if (com.tmax.webservice.employee.EmployeeServiceIF.class.isAssignableFrom(serviceEndpointInterface)) {
                    _stub = new com.tmax.webservice.employee.EmployeeServiceIFSoapBinding_Stub(new java.net.URL(EmployeeServiceIFPort_address), this);
                    ((com.tmax.axis.client.Stub) _stub)._setPortName(portName);
                }
                return (java.rmi.Remote) _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException (portName +  ": no such Qname Port");
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:EmployeeService", "EmployeeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:EmployeeService", "EmployeeServiceIFPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        if ("EmployeeServiceIFPort".equals(portName)) {
            setEmployeeServiceIFPortEndpointAddress(address);
            return;
        }
        else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
