<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.io.*" %>

<%@ include file="../../upper.jsp"%>

<br>

<html>
<head>
  <title>JSTL: Iterator Support -- Simple Range Iteration Example</title>
</head>
<body bgcolor="#FFFFFF">
<h3>Simple Range Iteration</h3>

<h4>1 to 10</h4>

<c:forEach var="i" begin="1" end="10">
	<c:out value="${i}"/>
</c:forEach>
</body>
</html>

<%@ include file="../../footer.html" %>