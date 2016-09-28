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
            
            
			/* Find Employees */
			ArrayOfEmployee emps = new ArrayOfEmployee();
			Employee [] employees = null;
			emps = empPort.findEmployees();
			employees = emps.getItem();

			out.println("<table align=\"Center\"><tr>");
			out.println("<th align=\"center\">Employee No</th>");
			out.println("<th>Name</th>");
			out.println("<th>Job</th>");
			out.println("<th align=\"center\">Manager</th>");
			out.println("<th align=\"center\">HireDate</th>");
			out.println("<th align=\"center\">Salary</th>");
			out.println("<th align=\"center\">Commission</th>");
			out.println("<th align=\"center\">Department</th>");
			out.println("<th align=\"center\">Modify</th>");
			out.println("<th align=\"center\">Delete</th>");
			out.println("</tr>");
			for(int j=0; j<employees.length; j++)
			{
				out.println("<tr><td>" + employees[j].getEmpNo() + "</td>");
				out.println("<td>" + employees[j].getName() + "</td>");
				out.println("<td>" + employees[j].getJob() + "</td>");

				/* Manager Null Check */
				if(employees[j].getManager()==null)
					out.println("<td> </td>");
				else
					out.println("<td>" + employees[j].getManager() + "</td>");

				out.println("<td>" + employees[j].getHireDate() + "</td>");
				out.println("<td>" + employees[j].getSalary() + "</td>");
				/* Commission Null Check */
				if(employees[j].getCommission()==null)
					out.println("<td> </td>");
				else
					out.println("<td>" + employees[j].getCommission() + "</td>");

				/* Department Choice */
				String no = employees[j].getDeptNo();
				if(no.equals("10"))
					out.println("<td>QA</td>");
				else if(no.equals("20"))
					out.println("<td>RESEARCH</td>");
				else if(no.equals("30"))
					out.println("<td>SALES</td>");
				else if(no.equals("40"))
					out.println("<td>OPERATION</td>");

				out.println("<td><a href=\"./modify.jsp?empNo=" + employees[j].getEmpNo() + "\">Modify</a></td>");
				out.println("<td><a href=\"./delete.jsp?empNo=" + employees[j].getEmpNo() + "\">Delete</a></td></tr>");
			}
			out.println("<tr><td colspan=10 align=center><a href=\"./index.html\">HOME</a>&nbsp;&nbsp;&nbsp;<a href=\"./insert.html\">Add Employee</a></td></tr>");
			out.println("</table>");

        } catch (Exception e) {
            exceptionString = e.toString();
            e.printStackTrace();
            System.err.println(exceptionString);
        }
%>

<%= exceptionString
%>
