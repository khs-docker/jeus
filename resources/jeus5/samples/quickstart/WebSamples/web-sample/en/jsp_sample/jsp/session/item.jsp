<!-- upper.jsp -->
<%@ include file="../upper.jsp" %>


<form type=POST action=carts.jsp>
<input type="hidden" name="home" value="<%= home%>">
	<b> Using JavaBeans for session scope, you can make a cart. </b>
	<br><br>
	Please select item to add or remove:<br>
	<br>
	Items:&nbsp;&nbsp;&nbsp;&nbsp;
	
	<SELECT NAME="item">
		<OPTION>Tmax
		<OPTION>WebToB
		<OPTION>JEUS
		<OPTION>WebT
	</SELECT>
	
	<br><br>
	<INPUT TYPE=submit name="submit" value="add">
	<INPUT TYPE=submit name="submit" value="remove">
</form>
       
<!-- footer.html -->
<%@ include file="../footer.html" %>
