<%
	String home = request.getParameter("home");
%>

<html>
<head>
<title>JEUS Samples</title>
<link rel="stylesheet" type="text/css" href="/examples/infolink.css">
</head>

<body BGCOLOR="#FFFFFF" TEXT="#000000" LINK="#0000EE" VLINK="#551A8B" ALINK="#FF0000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr> 
		<td height="67" background="/examples/images/bgColor.gif"><img src="/examples/images/logo.gif" width="237" height="67"></td>
	</tr>
	<tr> 
		<td height="11" background="/examples/images/bgline.gif"></td>
	</tr>
</table>
<br>
<table width="760" border="0" align="left" cellpadding="1" cellspacing="1" bgcolor="#FFFFFF">
  <tr bgcolor="#999999"> 
    <td  width="25%" height="27" align="center" onMouseover="this.style.backgroundColor='#0099cc'" onMouseout="this.style.backgroundColor='#999999'"> 
    <a href="/examples/<%= home%>"><b><font color="#FFFFFF" face="Arial">home</font></b></a></td>
    <td  width="25%" align="center" onMouseover="this.style.backgroundColor='#0099cc'" onMouseout="this.style.backgroundColor='#999999'">
    <a href="src.txt"><b><font color="#FFFFFF"><b>view source </b></font></a></td>
    <td  width="25%" align="center" onMouseover="this.style.backgroundColor='#0099cc'" onMouseout="this.style.backgroundColor='#999999'"></td>
    <td  width="25%" align="center" onMouseover="this.style.backgroundColor='#0099cc'" onMouseout="this.style.backgroundColor='#999999'"></td>
  <tr> 
	<td colspan="4" class='tdpadding'>
<br><br>
