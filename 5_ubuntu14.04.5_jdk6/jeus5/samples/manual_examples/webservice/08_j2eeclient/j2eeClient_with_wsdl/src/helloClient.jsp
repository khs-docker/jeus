<%@ page language="java" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.rmi.*" %>
<%@ page import="java.rmi.RemoteException" %>
<%@ page import="java.util.*" %>

<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.xml.rpc.Service" %>

<%@ page import="import echo.*" %>
<%@ page errorPage="/error.html" %>

<%! String msgToSend = "msg_sent_by_jspClient";
    String ret=null;
    String exceptionString="";
%>

<%
        
        try {
            
            InitialContext jndiContext = new InitialContext();
            
            Service service = (Service)jndiContext.lookup("java:comp/env/service/DocLitEchoService");
            java.rmi.Remote port = service.getPort(Echo.class);
            Echo echoPort = (Echo)port;
            
            System.out.println("Send : " + msgToSend);
            
            ret = echoPort.echoString(msgToSend);

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
