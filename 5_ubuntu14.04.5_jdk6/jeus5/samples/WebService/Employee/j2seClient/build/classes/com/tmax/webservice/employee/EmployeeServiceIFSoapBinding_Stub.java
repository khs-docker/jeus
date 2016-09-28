/**
 * EmployeeServiceIFSoapBinding_Stub.java
 *
 * This file was auto-generated from WSDL
 *  by the JEUS Web Services Wsdl-to-Java Emitter
 */

package com.tmax.webservice.employee;

public class EmployeeServiceIFSoapBinding_Stub extends com.tmax.axis.client.Stub implements com.tmax.webservice.employee.EmployeeServiceIF {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static com.tmax.axis.description.OperationDesc [] _operations;

    static {
        _operations = new com.tmax.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        com.tmax.axis.description.OperationDesc oper;
        oper = new com.tmax.axis.description.OperationDesc();
        oper.setName("addEmployee");
        oper.addParameter(new javax.xml.namespace.QName("", "in0"), new javax.xml.namespace.QName("urn:EmployeeService", "Employee"), com.tmax.webservice.employee.Employee.class, com.tmax.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(com.tmax.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(com.tmax.axis.constants.Style.RPC);
        oper.setUse(com.tmax.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new com.tmax.axis.description.OperationDesc();
        oper.setName("modifyEmployee");
        oper.addParameter(new javax.xml.namespace.QName("", "in0"), new javax.xml.namespace.QName("urn:EmployeeService", "Employee"), com.tmax.webservice.employee.Employee.class, com.tmax.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(com.tmax.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(com.tmax.axis.constants.Style.RPC);
        oper.setUse(com.tmax.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new com.tmax.axis.description.OperationDesc();
        oper.setName("removeEmployee");
        oper.addParameter(new javax.xml.namespace.QName("", "in0"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, com.tmax.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(com.tmax.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(com.tmax.axis.constants.Style.RPC);
        oper.setUse(com.tmax.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new com.tmax.axis.description.OperationDesc();
        oper.setName("findEmployee");
        oper.addParameter(new javax.xml.namespace.QName("", "in0"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, com.tmax.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("urn:EmployeeService", "Employee"));
        oper.setReturnClass(com.tmax.webservice.employee.Employee.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findEmployeeReturn"));
        oper.setStyle(com.tmax.axis.constants.Style.RPC);
        oper.setUse(com.tmax.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new com.tmax.axis.description.OperationDesc();
        oper.setName("findEmployees");
        oper.setReturnType(new javax.xml.namespace.QName("urn:EmployeeService", "ArrayOfEmployee"));
        oper.setReturnClass(com.tmax.webservice.employee.Employee[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findEmployeesReturn"));
        oper.setStyle(com.tmax.axis.constants.Style.RPC);
        oper.setUse(com.tmax.axis.constants.Use.ENCODED);
        _operations[4] = oper;

    }

    public static com.tmax.axis.description.OperationDesc[] getOperations() {
        return _operations;
    }

    public EmployeeServiceIFSoapBinding_Stub() throws com.tmax.axis.AxisFault {
         this(null);
    }

    public EmployeeServiceIFSoapBinding_Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws com.tmax.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public EmployeeServiceIFSoapBinding_Stub(javax.xml.rpc.Service service) throws com.tmax.axis.AxisFault {
        if (service == null) {
            super.service = new com.tmax.axis.client.Service();
        } else {
            super.service = service;
        }
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = com.tmax.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = com.tmax.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = com.tmax.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = com.tmax.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = com.tmax.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = com.tmax.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = com.tmax.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = com.tmax.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = com.tmax.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = com.tmax.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:EmployeeService", "Employee");
            cachedSerQNames.add(qName);
            cls = com.tmax.webservice.employee.Employee.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(com.tmax.axis.encoding.ser.BaseSerializerFactory.createFactory(com.tmax.axis.encoding.ser.BeanSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(com.tmax.axis.encoding.ser.BaseDeserializerFactory.createFactory(com.tmax.axis.encoding.ser.BeanDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:EmployeeService", "ArrayOfEmployee");
            cachedSerQNames.add(qName);
            cls = com.tmax.webservice.employee.Employee[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(com.tmax.axis.encoding.ser.BaseSerializerFactory.createFactory(com.tmax.axis.encoding.ser.ArraySerializerFactory.class, cls, qName, new javax.xml.namespace.QName("urn:EmployeeService", "Employee")));
            cachedDeserFactories.add(com.tmax.axis.encoding.ser.BaseDeserializerFactory.createFactory(com.tmax.axis.encoding.ser.ArrayDeserializerFactory.class, cls, qName));

    }

    private com.tmax.axis.client.Call _createCall() throws java.rmi.RemoteException {
        try {
            com.tmax.axis.client.Call _call = super.__createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (_firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(com.tmax.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(com.tmax.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        com.tmax.axis.encoding.SerializerFactory sf = (com.tmax.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                        com.tmax.axis.encoding.DeserializerFactory df = (com.tmax.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                        _call.registerTypeMapping(cls, qName, sf, df, false);
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new com.tmax.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void addEmployee(com.tmax.webservice.employee.Employee in0) throws java.rmi.RemoteException {
    try {
        com.tmax.axis.client.Call _call = _createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("empAction");
        _call.setSOAPVersion(com.tmax.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EmployeeService", "addEmployee"));


        _setRequestHeaders(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

    } catch (com.tmax.axis.AxisFault af) {
        Throwable t = af.detail;
        if (t == null) {
            throw af;
        } else {
            if (t instanceof javax.xml.rpc.JAXRPCException) {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            } else if (t instanceof java.lang.RuntimeException) {
                throw (java.lang.RuntimeException)t;
            } else {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            }
        }
    }
    }

    public void modifyEmployee(com.tmax.webservice.employee.Employee in0) throws java.rmi.RemoteException {
    try {
        com.tmax.axis.client.Call _call = _createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("empAction");
        _call.setSOAPVersion(com.tmax.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EmployeeService", "modifyEmployee"));


        _setRequestHeaders(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

    } catch (com.tmax.axis.AxisFault af) {
        Throwable t = af.detail;
        if (t == null) {
            throw af;
        } else {
            if (t instanceof javax.xml.rpc.JAXRPCException) {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            } else if (t instanceof java.lang.RuntimeException) {
                throw (java.lang.RuntimeException)t;
            } else {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            }
        }
    }
    }

    public void removeEmployee(java.lang.String in0) throws java.rmi.RemoteException {
    try {
        com.tmax.axis.client.Call _call = _createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("empAction");
        _call.setSOAPVersion(com.tmax.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EmployeeService", "removeEmployee"));


        _setRequestHeaders(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

    } catch (com.tmax.axis.AxisFault af) {
        Throwable t = af.detail;
        if (t == null) {
            throw af;
        } else {
            if (t instanceof javax.xml.rpc.JAXRPCException) {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            } else if (t instanceof java.lang.RuntimeException) {
                throw (java.lang.RuntimeException)t;
            } else {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            }
        }
    }
    }

    public com.tmax.webservice.employee.Employee findEmployee(java.lang.String in0) throws java.rmi.RemoteException {
    try {
        com.tmax.axis.client.Call _call = _createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("empAction");
        _call.setSOAPVersion(com.tmax.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EmployeeService", "findEmployee"));


        _setRequestHeaders(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {in0});

            try {
                return (com.tmax.webservice.employee.Employee) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.tmax.webservice.employee.Employee) com.tmax.axis.utils.JavaUtils.convert(_resp, com.tmax.webservice.employee.Employee.class);
            }
    } catch (com.tmax.axis.AxisFault af) {
        Throwable t = af.detail;
        if (t == null) {
            throw af;
        } else {
            if (t instanceof javax.xml.rpc.JAXRPCException) {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            } else if (t instanceof java.lang.RuntimeException) {
                throw (java.lang.RuntimeException)t;
            } else {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            }
        }
    }
    }

    public com.tmax.webservice.employee.Employee[] findEmployees() throws java.rmi.RemoteException {
    try {
        com.tmax.axis.client.Call _call = _createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("empAction");
        _call.setSOAPVersion(com.tmax.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:EmployeeService", "findEmployees"));


        _setRequestHeaders(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

            try {
                return (com.tmax.webservice.employee.Employee[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.tmax.webservice.employee.Employee[]) com.tmax.axis.utils.JavaUtils.convert(_resp, com.tmax.webservice.employee.Employee[].class);
            }
    } catch (com.tmax.axis.AxisFault af) {
        Throwable t = af.detail;
        if (t == null) {
            throw af;
        } else {
            if (t instanceof javax.xml.rpc.JAXRPCException) {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            } else if (t instanceof java.lang.RuntimeException) {
                throw (java.lang.RuntimeException)t;
            } else {
                throw new java.rmi.RemoteException(t.getMessage(), t);
            }
        }
    }
    }

}
