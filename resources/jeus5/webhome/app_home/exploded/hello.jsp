<%@ page contentType="text/html;charset=EUC-KR"  %>

<%@ page import = "java.rmi.*,
                   javax.naming.*,
                   javax.rmi.*,
                   java.net.*,                   
                   javax.ejb.*,
                   java.util.*,
                   hello.*"
%>

<%
	ResourceBundle res = ResourceBundle.getBundle("WebRes", Locale.getDefault());
%>
<head>
<title>Hello World!</title>
</head>

<body bgcolor="#DCDCDC" TEXT="#000000" LINK="#0000EE" VLINK="#551A8B" ALINK="#FF0000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<br><br><div align="center"><img src="./images/Splash.gif"></div>
<h2 align="center">
<br>JEUS 5 Web Application Server is successfully Installed on this server!</h2>
<h2 align="center">
<br>
    <%
		try{

			InitialContext initial = new InitialContext();
			Object objref = initial.lookup("HelloApp");
			hello.HelloHome home = (hello.HelloHome)PortableRemoteObject.narrow(objref, hello.HelloHome.class);
			
			hello.Hello hello = home.create();
			out.println(hello.sayHello());

		} catch(Exception e) {
			out.println("Error caught : " + e.getMessage());
			e.printStackTrace();
		}

%>
</h2></p>
</body>
</html>


