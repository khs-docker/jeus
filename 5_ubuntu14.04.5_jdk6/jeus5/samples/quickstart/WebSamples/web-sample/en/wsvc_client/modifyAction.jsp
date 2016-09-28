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
			Employee emp_mod = new Employee();
			emp_mod.setEmpNo(request.getParameter("empNo"));
			emp_mod.setName(request.getParameter("name"));
			emp_mod.setJob(request.getParameter("job"));
			emp_mod.setManager(request.getParameter("mgr"));
			emp_mod.setHireDate(request.getParameter("hiredate"));
			emp_mod.setSalary(request.getParameter("sal"));
			emp_mod.setCommission(request.getParameter("comm"));
			emp_mod.setDeptNo(request.getParameter("deptno"));

			empPort.modifyEmployee(emp_mod);

			out.println("Modify Complete");
			out.println("<a href=\"./index.html\">HOME</a>");
			out.println("<a href=\"./employeeList.jsp\">List</a>");

        } catch (Exception e) {
            exceptionString = e.toString();
            e.printStackTrace();
            System.err.println(exceptionString);
        }
%>

<%=exceptionString %>
