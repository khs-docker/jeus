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
            
			Employee emp_find = new Employee();
			emp_find = empPort.findEmployee(request.getParameter("empNo"));

			/* Find Employees */

			out.println("<table align=\"Center\"><tr>");
			out.println("<td align=\"center\">Employee No</td>");
			out.println("<td>Name</td>");
			out.println("<td>Job</td>");
			out.println("<td align=\"center\">Manager</td>");
			out.println("<td align=\"center\">HireDate</td>");
			out.println("<td align=\"center\">Salary</td>");
			out.println("<td align=\"center\">Commission</td>");
			out.println("<td align=\"center\">Department</td>");
			out.println("<td align=\"center\">Modify</td>");
			out.println("<td align=\"center\">Delete</td>");
			out.println("</tr>");

			out.println("<tr><td>" + emp_find.getEmpNo() + "</td>");
			out.println("<td>" + emp_find.getName() + "</td>");
			out.println("<td>" + emp_find.getJob() + "</td>");

			/* Manager Null Check */
			if(emp_find[j].getManager()==null)
				out.println("<td> </td>");
			else
				out.println("<td>" + employees[j].getManager() + "</td>");

			out.println("<td>" + emp_find.getHireDate() + "</td>");
			out.println("<td>" + emp_find.getSalary() + "</td>");
			/* Commission Null Check */
			if(emp_find.getCommission()==null)
				out.println("<td> </td>");
			else
				out.println("<td>" + emp_find.getCommission() + "</td>");

			/* Department Choice */
			String no = emp_find.getDeptNo();
			if(no.equals("10"))
				out.println("<td>QA</td>");
			else if(no.equals("20"))
				out.println("<td>RESEARCH</td>");
			else if(no.equals("30"))
				out.println("<td>SALES</td>");
			else if(no.equals("40"))
				out.println("<td>OPERATION</td>");

			out.println("<td><a href=\"./modify.jsp?empNo=" + emp_find.getEmpNo() + "\">Modify</a></td>");
			out.println("<td><a href=\"./delete.jsp?empNo=" + emp_find.getEmpNo() + "\">Delete</a></td></tr>");
			out.println("</table>");
			out.println("<a href=\"./index.html\">HOME</a>");

        } catch (Exception e) {
            exceptionString = e.toString();
            e.printStackTrace();
            System.err.println(exceptionString);
        }
%>

<%= exceptionString
%>
