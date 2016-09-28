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

    InitialContext jndiContext = new InitialContext();

    Service service = (Service)jndiContext.lookup("java:comp/env/service/EmployeeService");
    java.rmi.Remote port = service.getPort(EmployeeServiceIF.class);
    EmployeeServiceIF empPort = (EmployeeServiceIF)port;

    Employee emp_find = new Employee();
    emp_find = empPort.findEmployee(request.getParameter("empNo"));
%>

<html>
<body>
<table>
	<form action="./modifyAction.jsp" method="post">
<tr>
	<td>Employee No(ex:1234)</td>
	<td>
		<input type="text" name=no size=4 maxlength=4 value="<%=request.getParameter("empNo")%>" disabled>
	</td>
<tr>
	<td>Name(ex:Peter)</td>
	<td>
		<input type="text" name=name size=10 maxlength=16 value="<%=emp_find.getName()%>">
	</td>
</tr>
<tr>
	<td>Job(ex:SALESMAN)</td>
	<td>
		<input type="text" name=job size=12 maxlength=12 value="<%=emp_find.getJob()%>">
	</td>
</tr>
<tr>
	<td>MANAGER(ex:7272)</td>
	<td>
		<input type="text" name=mgr size=4 maxlength=4 value="<%=emp_find.getManager()%>">
	</td>
</tr>
<tr>
	<td>HIREDATE(ex :2005-01-11)</td>
	<td>
		<input type="text" name=hiredate size=10 maxlength=10 value="<%=emp_find.getHireDate()%>">
	</td>
</tr>
<tr>
	<td>SALARY(ex: 2500)</td>
	<td>
		<input type="text" name=sal size=10 maxlength=10 value="<%=emp_find.getSalary()%>">
	</td>
</tr>
<tr>
	<td>COMMISSION(ex: 500)</td>
	<td>
		<input type="text" name=comm size=4 maxlength=10 value="<%=emp_find.getCommission()%>">
	</td>
</tr>
<tr>
	<td>DEPARTMENT</td>
	<td>
		<select name=deptno>
<%
	String deptn = emp_find.getDeptNo();
            if(deptn.equals("10")) {
				out.println("<option value=\"10\" selectecd>QA</option>");
				out.println("<option value=\"20\">RESEARCH</option>");
				out.println("<option value=\"30\">SALES</option>");
				out.println("<option value=\"40\">OPERATIONS</option>");
			} else if(deptn.equals("20")) {
				out.println("<option value=\"10\">QA</option>");
				out.println("<option value=\"20\" selected>RESEARCH</option>");
				out.println("<option value=\"30\">SALES</option>");
				out.println("<option value=\"40\">OPERATIONS</option>");
			} else if(deptn.equals("30")) {
				out.println("<option value=\"10\">QA</option>");
				out.println("<option value=\"20\">RESEARCH</option>");
				out.println("<option value=\"30\" selected>SALES</option>");
				out.println("<option value=\"40\">OPERATIONS</option>");
			} else if(deptn.equals("40")) {
				out.println("<option value=\"10\">QA</option>");
				out.println("<option value=\"20\">RESEARCH</option>");
				out.println("<option value=\"30\">SALES</option>");
				out.println("<option value=\"40\" selected>OPERATIONS</option>");
			}
%>
		</select>
	</td>
</tr>
<tr>
	<td colspan=2>
		<input type="hidden" name="empNo" value="<%=request.getParameter("empNo")%>" size=10>
		<input type="submit" name="submit" value="Modify" size=10>
        <input type="button" name="list" size=12 onClick='javascript:window.location="./employeeList.jsp"' value="Employee List"> 
		<input type="button" name="home" size=12 onClick='javascript:window.location="./index.html"' value="HOME">
	</td>
</tr>
	</form>
</table>
</body>
</html>
