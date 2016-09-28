<!-- upper.jsp -->
<%@ include file="../upper.jsp" %>

<jsp:useBean id="cart" scope="session" class="sessions.Cart" />

<jsp:setProperty name="cart" property="*" />
<%
	cart.processRequest(request);
	pageContext.setAttribute("cart", cart, pageContext.SESSION_SCOPE);
%>

<br> You have the following items in your cart:
<ol>
<% 
	String[] items = cart.getItems();
	for (int i=0; i<items.length; i++) 
	{
%>
		<li> <%= items[i] %> 
<%
	}
%>
</ol>

<hr>
<%@ include file ="item.html" %>

<!-- footer.html -->

<%@ include file="../footer.html" %>
