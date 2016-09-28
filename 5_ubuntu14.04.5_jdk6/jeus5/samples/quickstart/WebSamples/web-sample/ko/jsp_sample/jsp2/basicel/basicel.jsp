<%@ page contentType="text/html; charset=euc-kr" %>

<html>
<head>
<title>JEUS 5.0 Sample Application</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link href="/web-sample/css/jmtable.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/web-sample/js/common.js"></script>
</head>

	<div style="padding-left:11px"><br>
	<table width="776" border="0" cellspacing="0" cellpadding="0">
		<tr class="JMHeading5">
		<td height="27" bgcolor="F0F0F0"><img src="/web-sample/images/point_01.gif" width="9" height="9" align="absmiddle">
		<a href="/web-sample/ko/jsp_main.html">JSP </a>&gt; EL(Expression Language)</td>
		</tr>
	</table>
	<br>
	<table width="776" border="0" cellspacing="0" cellpadding="0">
		<tr>
		<td width="22">&nbsp;</td>
		<td width="145" valign="top" background="/web-sample/images/b_bg.gif"><a href="intro.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('sub01','','/web-sample/images/b_me1_up.gif',1)"><img src="/web-sample/images/b_me1.gif" name="sub01" width="145" height="26" border="0"></a><a href="basicel.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('sub02','','/web-sample/images/b_me2_up.gif',1)"><img src="/web-sample/images/b_me2.gif" name="sub02" width="145" height="26" border="0"></a><a href="build.html" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('sub03','','/web-sample/images/b_me3_up.gif',1)"><img src="/web-sample/images/b_me3.gif" name="sub03" width="145" height="26" border="0"></a>
		</td>
		<td valign="top"><table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
		<td height="1" bgcolor="CCCCCC"></td>
		</tr>
		<tr>
		<td background="/web-sample/images/con_bg.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
		<td height="39" valign="bottom" class="JMHeading6">
		<img src="/web-sample/images/point_05.gif" width="11" height="12">실 행</td>
		</tr>
		<tr>
		<td align="right"><img src="/web-sample/images/line2.gif" width="597" height="6"></td>
		</tr>
		<tr>
		<!-- contents start -->
		<td class="JMHeading4" width="597">
		<br><br>
	    <P class='JMHeading1'>JSP 2.0 Basic EL</P>
		<P class="JMHeading4">
	    <blockquote>
	      <u><b>arithmetic</b></u>
	      <code>
	        <table border="1" class="JMHeading4">
	          <tr>
		    <td width="200"><b>EL Expression</b></td>
		    <td width="100"><b>Result</b></td>
		  </tr>
		  <tr>
		    <td>\${3}</td>
		    <td>${3}</td>
		  </tr>
		  <tr>
		    <td>\${5 + 2}</td>
		    <td>${5 + 2}</td>
		  </tr>
		  <tr>
		    <td>\${1.5E4 + 1.4}</td>
		    <td>${1.5E4 + 1.4}</td>
		  </tr>
		  <tr>
		    <td>\${-4 - 2}</td>
		    <td>${-4 - 2}</td>
		  </tr>
		  <tr>
		    <td>\${7 * 2}</td>
		    <td>${7 * 2}</td>
		  </tr>
		  <tr>
		    <td>\${6/8}</td>
		    <td>${6/8}</td>
		  </tr>
		  <tr>
		    <td>\${6 div 8}</td>
		    <td>${6 div 8}</td>
		  </tr>
		  <tr>
		    <td>\${3/0}</td>
		    <td>${3/0}</td>
		  </tr>
		  <tr>
		    <td>\${10%3}</td>
		    <td>${10%3}</td>
		  </tr>
		  <tr>
		    <td>\${10 mod 3}</td>
		    <td>${10 mod 3}</td>
		  </tr>
	    	  <tr>
	      	    <td>\${(1==2) ? 3 : 4}</td>
	      	    <td>${(1==2) ? 3 : 4}</td>
	    	  </tr>
		</table>
	      </code>
	      <br>
	      <u><b>Numeric</b></u>
	      <code>
	        <table border="1" class="JMHeading4">
	          <tr>
		    <td width="200"><b>EL Expression</b></td>
		    <td width="100"><b>Result</b></td>
		  </tr>
		  <tr>
		    <td>\${1 &lt; 2}</td>
		    <td>${1 < 2}</td>
		  </tr>
		  <tr>
		    <td>\${1 lt 2}</td>
		    <td>${1 lt 2}</td>
		  </tr>
		  <tr>
		    <td>\${1 &gt; (4/3)}</td>
		    <td>${1 > (4/3)}</td>
		  </tr>
		  <tr>
		    <td>\${1 &gt; (4/3)}</td>
		    <td>${1 > (4/3)}</td>
		  </tr>
		  <tr>
		    <td>\${4.2 &gt;= 3}</td>
		    <td>${4.2 >= 3}</td>
		  </tr>
		  <tr>
		    <td>\${4.2 ge 3}</td>
		    <td>${4.2 ge 3}</td>
		  </tr>
		  <tr>
		    <td>\${4 &lt;= 3}</td>
		    <td>${4 <= 3}</td>
		  </tr>
		  <tr>
		    <td>\${4 le 3}</td>
		    <td>${4 le 3}</td>
		  </tr>
		  <tr>
		    <td>\${10.0 == 10}</td>
		    <td>${10.0 == 10}</td>
		  </tr>
		  <tr>
		    <td>\${10.0 eq 10}</td>
		    <td>${10.0 eq 10}</td>
		  </tr>
		  <tr>
		    <td>\${(10*10) != 100}</td>
		    <td>${(10*10) != 100}</td>
		  </tr>
		  <tr>
		    <td>\${(10*10) ne 100}</td>
		    <td>${(10*10) ne 100}</td>
		  </tr>
		</table>
	      </code>
	      <br>
	      <u><b>Alphabetic</b></u>
	      <code>
	        <table border="1" class="JMHeading4">
	          <thead>
		    <td width="200"><b>EL Expression</b></td>
		    <td width="100"><b>Result</b></td>
		  </thead>
		  <tr>
		    <td>\${'a' &lt; 'd'}</td>
		    <td>${'a' < 'd'}</td>
		  </tr>
		  <tr>
		    <td>\${'foo' &gt; 'zoo'}</td>
		    <td>${'foo' > 'zoo'}</td>
		  </tr>
		  <tr>
		    <td>\${'4' &gt; 3}</td>
		    <td>${'4' > 3}</td>
		  </tr>
		</table>
      </code>
      </P>
		</td>
		<!-- contents end -->
		</tr>
		</table></td>
		</tr>
		<tr>
		<td height="1" bgcolor="CCCCCC"></td>
		</tr>
		</table></td>
		</tr>
		</table>
		<br>
		</div></td>
		</tr>
		<tr>
		<td height="60"><div style="padding-left:11px"><table width="776" border="0" cellspacing="0" cellpadding="0">
		<tr class="JMHeading5">
		<td height="44"><img src="/web-sample/images/copy.gif" width="776" height="44"></td>
		</tr>
	</table>
</div>

</body>
</html>


