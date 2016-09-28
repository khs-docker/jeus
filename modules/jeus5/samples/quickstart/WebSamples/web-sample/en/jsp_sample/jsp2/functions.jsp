<%@ taglib prefix="jsp2" uri="/WEB-INF/tld/jsp2/jsp2-taglib.tld"%>

<html>
  <head>
    <title>JSP 2.0 EL Functions</title>
  </head>
  <body>
    <h1>JSP 2.0 EL Functions</h1>
    <blockquote>
      <u><b>Insert Parameter</b></u>
      <form action="functions.jsp" method="GET">
	  foo = <input type="text" name="foo" value="${param['foo']}">
          <input type="submit">
      </form>
      <br>
      <code>
        <table border="1">
          <tr>
	    <td width="200"><b>EL Expression</b></td>
	    <td width="100"><b>Result</b></td>
	  </tr>
	  <tr>
	    <td>\${param["foo"]}</td>
	    <td>${param["foo"]}&nbsp;</td>
	  </tr>
	  <tr>
	    <td>\${jsp2:reverse(param["foo"])}</td>
	    <td>${jsp2:reverse(param["foo"])}&nbsp;</td>
	  </tr>
	  <tr>
	    <td>\${jsp2:reverse(jsp2:reverse(param["foo"]))}</td>
	    <td>${jsp2:reverse(jsp2:reverse(param["foo"]))}&nbsp;</td>
	  </tr>
	  <tr>
	    <td>\${jsp2:countNum(param["foo"])}</td>
	    <td>${jsp2:countNum(param["foo"])}&nbsp;</td>
	  </tr>
	  <tr>
	    <td>\${jsp2:toupper(param["foo"])}</td>
	    <td>${jsp2:toupper(param["foo"])}&nbsp;</td>
	  </tr>
	  <tr>
	    <td>\${jsp2:tolower(param["foo"])}</td>
	    <td>${jsp2:tolower(param["foo"])}&nbsp;</td>
	  </tr>
	</table>
      </code>
    </blockquote>
  </body>
</html>

