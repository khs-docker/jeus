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

            String exceptionString = null;
%>

<%
        
        try {
            
            InitialContext jndiContext = new InitialContext();
            
            Service service = (Service)jndiContext.lookup("java:comp/env/service/EmployeeService");
            java.rmi.Remote port = service.getPort(EmployeeServiceIF.class);
            EmployeeServiceIF empPort = (EmployeeServiceIF)port;
            
			Employee emp_add = new Employee();
			emp_add.setEmpNo(request.getParameter("no"));
			emp_add.setName(request.getParameter("name"));
			emp_add.setJob(request.getParameter("job"));
			emp_add.setManager(request.getParameter("mgr"));
			emp_add.setHireDate(request.getParameter("hiredate"));
			emp_add.setSalary(request.getParameter("sal"));
			emp_add.setCommission(request.getParameter("comm"));
			emp_add.setDeptNo(request.getParameter("deptno"));
			empPort.addEmployee(emp_add);

			out.println("Insert Complete<br>");
			out.println("<a href=\"./index.html\">HOME</a>&nbsp;&nbsp;&nbsp;");
			out.println("<a href=\"./employeeList.jsp\">Employee List</a>");

        } catch (Exception e) {
            exceptionString = e.toString();
            e.printStackTrace();
            System.err.println(exceptionString);
        }
%>

<%=exceptionString %>
