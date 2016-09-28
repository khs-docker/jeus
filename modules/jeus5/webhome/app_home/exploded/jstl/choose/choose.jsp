<%@ page contentType="text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../../upper.jsp"%>

<br>
<h2> &lt;choose&gt;Test </h2>
<br>
<h5><u>admin : red, administrator : blue, others : green</u></h5>
        
<form action="choose.jsp" method="GET">
input your ID( administrator or admin )<br> 
<input type="text" name="id">             
<input type="submit">       
</form>    
<c:choose>     
<c:when test="${param.id=='admin'}"><font color="red">Hello~! admin~!</font></c:when>
<c:when test="${param.id=='administrator'}"><font color="blue">Hello~! administrator~!</font></c:when>
<c:when test="${param.id==''}">you didn't input ID</c:when>
<c:otherwise> <c:if test="${!empty param.id}"><font color="green">you input wrong ID : <c:out value="${param.id}"/>. </c:if></font></c:otherwise>
</c:choose> 

<%@ include file="../../footer.html" %>
