
<!-- upper.jsp -->
<%@ include file="../upper.jsp" %>
<h2> Request Information </h2>
	JSP Request Method: <%= request.getMethod() %>
	<br>
	Request URI: <%= request.getRequestURI() %>
	<br>
	Request Protocol: <%= request.getProtocol() %>
	<br>
	Servlet path: <%= request.getServletPath() %>
	<br>
	Path info: <%= request.getPathInfo() %>
	<br>
	Path translated: <%= request.getPathTranslated() %>
	<br>
	Query string: <%= request.getQueryString() %>
	<br>
	Content length: <%= request.getContentLength() %>
	<br>
	Content type: <%= request.getContentType() %>
	<br>
	Server name: <%= request.getServerName() %>
	<br>
	Server port: <%= request.getServerPort() %>
	<br>
	Remote user: <%= request.getRemoteUser() %>
	<br>
	Remote address: <%= request.getRemoteAddr() %>
	<br>
	Remote host: <%= request.getRemoteHost() %>
	<br>
	Authorization scheme: <%= request.getAuthType() %> 
	<hr>
	The browser you are using is <%= request.getHeader("User-Agent") %>
	<hr>

<!-- footer.html -->
<%@ include file="../footer.html" %>
