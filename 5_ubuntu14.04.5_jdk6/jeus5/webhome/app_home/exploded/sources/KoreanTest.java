
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class KoreanTest extends HttpServlet {
    
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html;charset=EUC-KR");
        //response.setContentType("text/html");
        //response.setHeader("Content-Language", "ko");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");

        String title = "Korean Test";
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");
        out.println("<h1>" + title + "</h1>");
        
        out.println("한글 출력이 깨지지 않고 잘 되려나...");
        out.println("<br>This is korean test");
        String name = "서블릿한글테스트";
        byte[] b1 = name.getBytes("KSC5601");
        byte[] b2 = name.getBytes("8859_1");
        out.println("<br>KSC5601:" + b1.length + ", 8859_1:" + b2.length);
        String name2 = new String(name.getBytes("KSC5601"), "8859_1");
        out.println("<br>" + name2);
 
        out.println("<h3>Request Parameters</h3>");
        
        ServletInputStream in = request.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.readLine(buf, 0, buf.length);
        
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String color = request.getParameter("color");
        if (firstName != null || lastName != null || color != null) {
            out.println("<table border=\"0\" cellpadding=\"5\">");
            out.println("<tr><td bgcolor=\"#FDF5E6\">First Name</td><td>");
            out.println(firstName + "</td></tr>");
            out.println("<tr><td bgcolor=\"#FDF5E6\">Last Name</td><td>");
            out.println(lastName + "</td></tr>");
            out.println("<tr><td bgcolor=\"#FDF5E6\">Favorate Colors</td><td>");
            out.println(color + "</td></tr>");
            out.println("</table>");
            
            out.println("<br><br>ASC2KSC Version");
            out.println("<table border=\"0\" cellpadding=\"5\">");
            out.println("<tr><td bgcolor=\"#B0E2FF\">First Name</td><td>");
            out.println(asc2ksc(firstName) + "</td></tr>");
            out.println("<tr><td bgcolor=\"#B0E2FF\">Last Name</td><td>");
            out.println(asc2ksc(lastName) + "</td></tr>");
            out.println("<tr><td bgcolor=\"#B0E2FF\">Favorate Colors</td><td>");
            out.println(asc2ksc(color) + "</td></tr>");
            out.println("</table>");
        } else {
            out.println("No Parameters, Please enter some");
        }
        
        out.println("<p>");
        out.println("<h3>Parameter Input Form by <b>GET</b></h3>");
        out.println("<form action=\"KoreanTest\" method=GET>");
        out.println("<table border=\"0\" cellpadding=\"2\">");
        out.println("<tr><td>First Name</td><td>");
        out.println("<input type=text size=20 name=firstname></td></tr>");
        out.println("<tr><td>Last Name</td><td>");
        out.println("<input type=text size=20 name=lastname></td></tr>");
        out.println("<tr><td>Favorite Colors</td><td>");
        out.println("<input type=text size=20 name=color></td></tr>");
        out.println("</table>");
        out.println("<input type=submit>");
        out.println("</form>");
        
        out.println("<p>");
        out.println("<h3>Parameter Input Form by <b>POST</b></h3>");
        out.println("<form action=\"KoreanTest\" method=POST>");
        out.println("<table border=\"0\" cellpadding=\"2\">");
        out.println("<tr><td>First Name</td><td>");
        out.println("<input type=text size=20 name=firstname></td></tr>");
        out.println("<tr><td>Last Name</td><td>");
        out.println("<input type=text size=20 name=lastname></td></tr>");
        out.println("<tr><td>Favorite Colors</td><td>");
        out.println("<input type=text size=20 name=color></td></tr>");
        out.println("</table>");
        out.println("<input type=submit>");
        out.println("</form>");
        
        out.println("<p>");
        out.println("<h3>Parameter Input by <b>URL</b></h3>");
        out.println("<a href=\"KoreanTest?firstname=재선&lastname=한&color=파랑\">Korean Test</a><br>");
        out.println("<a href=\"KoreanTest?firstname=재선jaesun&lastname=han한&color=파랑blue\">Korean Test2</a>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
    
    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        doGet(request, response);
    }
    
    String asc2ksc (String src)
    {
        try {
            return new String(src.getBytes("8859_1"), "KSC5601");
        } catch (java.io.UnsupportedEncodingException uee) {
            log(uee.getMessage());
            return null;
        }
    }
}
