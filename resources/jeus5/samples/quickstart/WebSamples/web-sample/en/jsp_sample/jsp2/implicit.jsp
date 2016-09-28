<html>
  <head>
    <title>JSP 2.0 EL Implicit Objects</title>
  </head>
  <body>
    <h1>JSP 2.0 EL Implicit Objects</h1>
    <hr>

    <blockquote>
      <u><b>Insert Parameter</b></u>
      <form action="implicit.jsp" method="GET">
	  foo = <input type="text" name="foo" value="${param["foo"]}">
          <input type="submit">
      </form>
      <br>
      <code>
        <table border="1">
          <tr>
	    <td width="200"><b>EL Expression</b></td>
	    <td><b>Result</b></td>
	  </tr>
	  <tr>
	    <td>\${param.foo}</td>
	    <td>${param.foo}&nbsp;</td>
	  </tr>
	  <tr>
	    <td>\${param["foo"]}</td>
	    <td>${param["foo"]}&nbsp;</td>
	  </tr>
	  <tr>
	    <td>\${header["host"]}</td>
	    <td>${header["host"]}</td>
	  </tr>
	  <tr>
	    <td>\${header["accept"]}</td>
	    <td>${header["accept"]}</td>
	  </tr>
	  <tr>
	    <td>\${header["user-agent"]}</td>
	    <td>${header["user-agent"]}</td>
	  </tr>
	</table>
      </code>
    </blockquote>
  </body>
</html>
