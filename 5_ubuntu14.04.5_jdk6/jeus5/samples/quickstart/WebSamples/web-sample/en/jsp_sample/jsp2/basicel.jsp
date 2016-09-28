<html>
  <head>
    <title>JSP 2.0 Basic EL</title>
  </head>
  <body>
    <h1>JSP 2.0 Basic EL</h1>
    <hr>
    <blockquote>
      <u><b>arithmetic</b></u>
      <code>
        <table border="1">
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
        <table border="1">
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
        <table border="1">
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
  </body>
</html>
