import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class HelloWorldServlet extends HttpServlet
{
   public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
   {
      res.setContentType("text/html");

      PrintWriter out = res.getWriter();
      out.println("<HTML>");
      out.println("<HEAD>");
      out.println("<TITLE>Hello World Sample</TITLE>");
      out.println("</HEAD>");
      out.println("<BODY>");
      out.println("<CENTER><H1>Hello World!</H1></CENTER>");
      out.println("</BODY>");
      out.println("</HTML>");
      out.close();
   }
}
