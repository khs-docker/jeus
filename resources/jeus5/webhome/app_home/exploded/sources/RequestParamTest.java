
import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestParamTest extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");

        String title = "Request Parameter APIs";
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");

	out.println("<a href=\"/examples/index.html\">");
        out.println("<img src=\"/examples/images/home.gif\" height=30 width=38></a>");
        out.println("<a href=\"/examples/index.html\">To Main Page</a>");
        out.println("<a href=\"/examples/sources/RequestParamTest.java\">");
        out.println("<img src=\"/examples/images/code.gif\" height=30 width=38></a>");
        out.println("<a href=\"/examples/sources/RequestParamTest.java\">View Code</a>");
        out.println("<h1>" + title + "</h1>");

	out.println("<br><h3>Request Parameters</h3>");
        out.println("<table border=\"0\" cellpadding=\"5\">");
        out.println("<tr><td bgcolor=\"#B0E2FF\">getCharacterEncoding()</td><td>");
        out.println(request.getCharacterEncoding() + "</td></tr>");
      
        out.println("<tr><td bgcolor=\"#B0E2FF\">getContentType()</td><td>");
        out.println(request.getContentType() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getContentLength()</td><td>");
        out.println(request.getContentLength() + "</td></tr>");
        
        out.println("<tr><td bgcolor=\"#B0E2FF\">getLocale()</td><td>");
        out.println(request.getLocale() + "</td></tr>");
        
        out.println("<tr><td bgcolor=\"#B0E2FF\">getLocales()</td><td>");
        Enumeration locales = request.getLocales();
        while (locales.hasMoreElements()) {
        	java.util.Locale locale = (java.util.Locale)locales.nextElement();
        	out.println(locale + ",");
        }
        out.println("</td></tr>");
        out.println("</table><br>");
        
        out.println("Parameters in this request<br>");        
   
        Enumeration names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = (String)names.nextElement();
            if (name.equals("color")) {
                String[] values = request.getParameterValues(name);
                out.println("***" + name + " = ");
                for (int i = 0; i < values.length; i++)
                    out.println(values[i] + ",");
                out.println("<br>");
            }
        }

        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        if (firstName != null || lastName != null) {
            out.println("First Name");
            out.println(" = " + firstName + "<br>");
            out.println("Last Name");
            out.println(" = " + lastName);
        } else {
            out.println("No Parameters, Please enter some");
        }
             
        out.println("<P>");
        out.print("<form action=\"");
        out.print("RequestParamTest\" ");
        out.println("method=POST>");
        out.println("First Name");
        out.println("<input type=text size=20 name=firstname>");
        out.println("<br>");
        out.println("Last Name");
        out.println("<input type=text size=20 name=lastname>");
        out.println("<br>");
        out.println("Favorite Color");
        out.println("<input type=text size=20 name=color>");
        out.println("<input type=text size=20 name=color>");
        out.println("<input type=text size=20 name=color>");
        out.println("<br>");
        out.println("<input type=submit>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
        response.setContentLength(100);
    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        doGet(request, response);
    }

}
