<!-- upper.jsp -->
<%@ include file="../upper.jsp" %>
<font color="green">
---------------------------------------------<br>
This is including page<br>


<jsp:include page="next.jsp" flush="true">
    <jsp:param name="color" value="violet"/>
    <jsp:param name="ages" value="20"/>
</jsp:include>

---------------------------------------------<br><br>
</font>

<!-- footer.html -->
<%@ include file="../footer.html" %>
