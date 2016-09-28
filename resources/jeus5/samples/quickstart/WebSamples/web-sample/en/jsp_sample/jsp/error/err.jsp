<!-- upper.jsp -->
<%@ include file="../upper.jsp" %>

<%@ page errorPage="errorpge.jsp" %>
<% 
	String name = null;
	String query = null;
	
		query = request.getParameter("name");

	  	if (query.equalsIgnoreCase("orange")) 
	  		name = query;
	  	
	  	// if you don't select a orange, name is null object
	  	// so name.equalsIgnoreCase("orange") will make a Null Pointer Exception 
	  	// and request will be forwarded to the Error page specified in the page directive
	  	if (name.equalsIgnoreCase("orange"))
	  	{
%>
			<H2> Yes. I think a orange.
<% 
	  	}
%>	

<!-- footer.html -->
<%@ include file="../footer.html" %>
