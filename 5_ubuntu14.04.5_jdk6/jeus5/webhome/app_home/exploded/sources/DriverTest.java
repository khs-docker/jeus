
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DriverTest extends HttpServlet {
    
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");

        String title = "DB Connection Performace Test";
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.println("<h1>" + title + "</h1>");

        String driver = request.getParameter("driver");
        String trialStr = request.getParameter("trial");
        
        int trial = 100;
        try {
            trial = Integer.parseInt(trialStr);
        } catch (Exception e) {
        }
        
        String driverClassName = null;
        if (driver != null && driver.equals("jeus")) {
            driverClassName = "jeus.jdbc.pool.Driver";
        } else if (driver.equals("weblogic")) {
            driverClassName = "weblogic.jdbc.pool.Driver";
        } else {
            driverClassName = "oracle.jdbc.driver.OracleDriver";
        }
        
        out.println("<br><h4>Tested Driver: " + driverClassName);
        out.println("<br>Tested trial: " + trial + "</h4>");
        
	try {
	    Class.forName(driverClassName);
	} catch (ClassNotFoundException cnfe) {
            String msg = "<br><h3>Class " + driverClassName + " is not found</h3>";
            out.println(msg);
            //out.println("</body>");
            //out.println("</html>");
            //out.close();
	}
	
	long totalConnectionTime = 0;
	long beginTop = System.currentTimeMillis();
	for (int i = 0; i < trial; i++) {
            
	    Connection con = null;
	    Statement stmt = null;
	    ResultSet rs = null;
            try {
            	long begin = System.currentTimeMillis();
            	if (driverClassName.startsWith("jeus")) {
                    con = DriverManager.getConnection ("jdbc:jeus:pool:oraclePool", null);
                } else if (driverClassName.startsWith("weblogic")) {
                    con = DriverManager.getConnection ("jdbc:weblogic:pool:oraclePool", null);
                } else {
                    con = DriverManager.getConnection (
		       "jdbc:oracle:thin:@143.248.148.39:1521:ORA805", "system", "manager");
		}
		long end = System.currentTimeMillis();
		long diff = end - begin;
		totalConnectionTime += diff;
		out.println("<br>[" + i + "] DB Connection Success, time = " + diff + ", " + con);
		
                stmt = con.createStatement();
                rs = stmt.executeQuery("select * from customer");
                while(rs.next()) {
                    String id= rs.getString(1);
                    String name  = rs.getString(2);
                    int age = rs.getInt(3);

                    //out.println("<br> id = " + id);
                    //out.println("<br> name= "+ name);
                    //out.println("<br> age= "+ age);
                }
                stmt.close();
                con.close();
	    } catch (SQLException se) {
	        se.printStackTrace();
	        out.println("<br>[" + i + "] DB Query failed");
	        try {
	            if (stmt != null) {
	                stmt.close();
	            }
	            if (con != null) {
	                con.close();
	            }
	        } catch (Exception e) {
	        }
	    }
	}
	long endBottom = System.currentTimeMillis();
	
	out.println("<br><br> <h3>### Result Performace ###</h3>");
	out.println("<h4> total connection time = " + totalConnectionTime);
	out.println("<br> total elapsed time = " + (endBottom - beginTop) + "</h4>");
        
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

}

