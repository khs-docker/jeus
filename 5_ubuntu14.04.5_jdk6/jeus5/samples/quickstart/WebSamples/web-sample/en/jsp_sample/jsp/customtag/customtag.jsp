
<!-- upper.jsp -->
<%@ include file="../upper.jsp" %>

<%@ taglib uri="/WEB-INF/tld/taglib.tld" prefix="sample" %>

<%
	int max = 24;
	int min = 0;
%>

<sample:encodeHTML>
<h1>HTML encoding tag example</h1>

if ((x < <%= max %>) && (x > <%= min %>)) {
	fact(x);
}

enter
A	B
In the middle of A and B, Tab character exists.
</sample:encodeHTML>

<!-- footer.html -->
<%@ include file="../footer.html" %>
