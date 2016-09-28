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
%>
	<center>
	Are you sure remove an employee?<br>
	<form action="./deleteAction.jsp" method="post">
		<input type="hidden" name=empNo value="<%=request.getParameter("empNo")%>">
		<input type="submit" name=submit value="Delete">&nbsp;&nbsp;&nbsp;
		<input type="button" name=prev value="Previous" onClick="history.back();">
	</form>
	</center>
</table>
</body>
</html>
