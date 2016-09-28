<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.*" %>

<%@ include file="../../upper.jsp"%>

<br>
<h2>&lt;out&gt; Test</h2>
<br>
<%
Reader r1 = new StringReader("<test>This is escapeXml test and c:out test</test>");
pageContext.setAttribute("Reader1", r1);
Reader r2 = new StringReader("<test>This is escapeXml test and c:out test</test>");
pageContext.setAttribute("Reader2", r2);
%>
<table>
<tr><td width="150" bgcolor="f5f5dc"><b>Input Data</b></td><td><b><c:out value="<test>This is escapeXml test and c:out test</test>"/></b></td></tr>
<tr><td bgcolor="f5f5dc">escapeXml = true</td><td> <c:out value="${Reader1}"/> </td></tr>
<tr><td bgcolor="f5f5dc">escapeXml = false</td><td> <c:out value="${Reader2}" escapeXml="false"/> </td></tr>
</table>
<br><br><br>
Please input string has any tag<br>
<form action="cout.jsp" method="GET">
<input type="text" name="cout_test" value="${param["cout_test"]}">
<input type="submit">
</form>
<table>
<tr><td bgcolor="f5f5dc" width="150"><b><center>escapeXml = true</center></b></td><td> <c:out value="${param.cout_test}"/> </td></tr>
<tr><td bgcolor="f5f5dc"><b><center>escapeXml = false</center></b></td><td> <c:out value="${param.cout_test}" escapeXml="false"/> </td></tr>
</table>

<%@ include file="../../footer.html" %>