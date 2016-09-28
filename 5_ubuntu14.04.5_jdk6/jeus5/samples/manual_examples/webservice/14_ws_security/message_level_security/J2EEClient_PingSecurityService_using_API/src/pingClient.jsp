<%@ page language="java" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.rmi.*" %>
<%@ page import="java.rmi.RemoteException" %>
<%@ page import="java.util.*" %>

<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.xml.rpc.Service" %>
<%@ page import="javax.xml.namespace.QName" %>

<%@ page import="jeus.webservices.wssecurity.SecurityConfiguration" %>
<%@ page import="jeus.webservices.wssecurity.Keystore" %>

<%@ page import="import ping.*" %>
<%@ page errorPage="/error.html" %>

<%! String msgToSend = "msg_sent_by_jspClient";
    String ret=null;
    String exceptionString="";
%>

<%
        
        try {
            Keystore keystore = new Keystore("JKS", "keystore_password", "client-keystore.jks");
            Keystore truststore = new Keystore("JKS", "keystore_password", "client-keystore.jks");
            
            InitialContext jndiContext = new InitialContext();
            
            Service service = (Service)jndiContext.lookup("java:comp/env/service/PingSecurityService");
            QName portName = new QName("urn:PingSecurityService", "PingPort");
            
            SecurityConfiguration sconfig = new SecurityConfiguration(service, portName);
            sconfig.setUsername("JEUS_CLIENT");
            sconfig.setRequestPasswordCallbackClass("ping.PingPWCallback");
            
            sconfig.addUTRequest(true, true);
            sconfig.addSignRequest(null, "DirectReference", keystore);
            sconfig.addEncryptRequest(null, "DirectReference", truststore, "JEUS_SERVER", null);
            
            sconfig.setResponsePasswordCallbackClass("ping.PingPWCallback");
            sconfig.addUTResponse();
            sconfig.addSignResponse(truststore);
            sconfig.addDecryptResponse(keystore);
            
            java.rmi.Remote port = service.getPort(portName, Ping.class);
            Ping pingPort = (Ping)port;
            
            ((javax.xml.rpc.Stub)pingPort)._setProperty(
                javax.xml.rpc.Stub.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8088/PingSecurity/PingSecurityService");
            
            System.out.println("Send : " + msgToSend);
            
            ret = pingPort.ping(msgToSend);

            System.out.println("You received : " + ret);

        } catch (Exception e) {
            exceptionString = e.toString();
            e.printStackTrace();
            System.err.println(exceptionString);
        }
%>

<%= "Result is "+ret+"......" 
%>

<%= exceptionString
%>
