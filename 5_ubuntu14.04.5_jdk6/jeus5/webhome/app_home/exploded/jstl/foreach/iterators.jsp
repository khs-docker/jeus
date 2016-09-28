<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../../upper.jsp" %>

<br>
<h2>&lt;forEach&gt; Test</h2>
<br>
<form action="iterators.jsp" method="GET">
input number you want to iterate( 0 < x <= 100 )<br>
<input type="text" size="3" name="iterate" value="${param["iterate"]}">
<input type="submit" value="submit">
</form>

<c:catch>
<c:choose>     
<c:when test="${param.iterate > 0 && param.iterate <= 100}">
<c:forEach var="i" begin="1" end="${param.iterate}">
  ${i} <br>
</c:forEach>
</c:when>
<c:when test="${empty param.iterate}"></c:when>
<c:otherwise> you have to input number 1 to 100 </c:otherwise>
</c:choose> 
</c:catch>
<%@ include file="../../footer.html" %>