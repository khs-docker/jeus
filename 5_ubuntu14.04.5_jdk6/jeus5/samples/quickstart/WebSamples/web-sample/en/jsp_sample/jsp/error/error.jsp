
<!-- upper.jsp -->
<%@ include file="../upper.jsp" %>
<h3> This sample uses <b>errorpage</b> directive </h3>
<br>
<h3> Select a fruit that I think.</h3>
<h3> If you want to show the error page, don't select the middle one.</h3>

<form method=get action=err.jsp>
<input type="hidden" name="home" value="<%= home%>">
<!-- <br> Make a choice: -->
	<SELECT NAME="name" SIZE=3>
		<OPTION VALUE="apple"> Apple <BR>
		<OPTION VALUE="orange"> Orange <BR>
		<OPTION VALUE="grape"> Grape <BR>
	</SELECT>
	<p><INPUT TYPE=submit name=submit Value="Submit">
</form>

<!-- footer.html -->
<%@ include file="../footer.html" %>
