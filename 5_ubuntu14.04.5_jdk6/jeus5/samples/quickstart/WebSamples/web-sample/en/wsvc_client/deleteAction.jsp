<%@ page language="java" %>
<%@ page import="javax.naming.*" %>
<%@ page import="javax.rmi.*" %>
<%@ page import="java.rmi.RemoteException" %>
<%@ page import="java.util.*" %>

<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.xml.rpc.Service" %>

<%@ page import="import com.tmax.webservices.emp.*" %>

<%
/**
 * <p>Title: JEUS Webservice Test Program</p>    
 * <p>Copyright: Copyright (c) 2004</p>
 * <p>Company: TmaxSoft Co., Ltd.</p>
 * @author Go, Seoung Hyun
 * @version 1.0
 */

    String exceptionString="";
%>

<%
        
        try {
            
            InitialContext jndiContext = new InitialContext();
            
            Service service = (Service)jndiContext.lookup("java:comp/env/service/EmployeeService");
            java.rmi.Remote port = service.getPort(EmployeeServiceIF.class);
            EmployeeServiceIF empPort = (EmployeeServiceIF)port;
            
			empPort.removeEmployee(request.getParameter("empNo"));

			out.println("Remove Employee Complete<br>");
			out.println("<a href=\"./index.html\">HOME</a>&nbsp;&nbsp;&nbsp;");
			out.println("<a href=\"./employeeList.jsp\">Employee List</a>");

        } catch (Exception e) {
            exceptionString = e.toString();
            e.printStackTrace();
            System.err.println(exceptionString);
        }
%>

<%= exceptionString
%>
