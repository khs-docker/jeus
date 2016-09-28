
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieTest extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
		out.println("<head>");
		out.println("<title>JEUS Samples</title>");
		out.println("<link rel='stylesheet' type='text/css' href='infolink.css'>");
		out.println("</head>");
		
		out.println("<body BGCOLOR='#FFFFFF' TEXT='#000000' LINK='#0000EE' VLINK='#551A8B' ALINK='#FF0000' leftmargin='0' topmargin='0' marginwidth='0' marginheight='0'>");
		out.println("<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		out.println("<tr>");
		out.println("<td height='67' background='images/bgColor.gif'><img src='images/logo.gif' width='237' height='67'></td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td height='11' background='images/bgline.gif'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<br>");
		out.println("<table width='760' border='0' align='left' cellpadding='1' cellspacing='1' bgcolor='#FFFFFF'>");
		out.println("<tr bgcolor='#999999'>");
		out.println("<td  width=\"25%\" height=\"27\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("<a href='/examples/index2.jsp'><b><font color='#FFFFFF' face='Arial'>home</font></b></a></td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("<a href='/examples/sources/CookieTest.java'><b><font color='#FFFFFF'><b>view source </b></font></a></td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("</tr>");
		out.println("<td colspan='4' class='tdpadding'>");
        out.println("<br><h3>Cookie Informations from browser</h3>");
        Cookie[] cookies = request.getCookies();
        if (cookies == null){
        	out.println("No cookie form browser");
        }else if (cookies.length > 0) {
            out.println("<table border=\"0\" cellpadding=\"5\">");
            out.println("<tr><td bgcolor=\"#FFD700\"><b>Cookie Name</b></td>");
            out.println("<td bgcolor=\"FFD700\"><b>Cookie Value</b></td></tr>");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                out.println("<tr><td bgcolor=\"#FDF5E6\">" + cookie.getName() + "</td><td>");
                out.println(cookie.getValue() + "</td></tr>");
            }
            out.println("</table>");
        } else {
            out.println("No cookie form browser");
        }

        out.println("<h3>Added Cookie Informations</h3>");
        try {
            ServletInputStream is = request.getInputStream();
            Hashtable params = HttpUtils.parsePostData(request.getContentLength(), is);
            String[] cookieName = (String[])params.get("cookiename");
            String[] cookieValue = (String[])params.get("cookievalue");
            if ((cookieName != null && !cookieName[0].equals("")) && 
		    (cookieValue != null && !cookieValue[0].equals(""))) {
                Cookie cookie = new Cookie(cookieName[0], cookieValue[0]);
                response.addCookie(cookie);
                out.println("<table border=\"0\" cellpadding=\"5\">");
                out.println("<tr><td bgcolor=\"#B0E2FF\">Cookie Name</td><td>");
                out.println(cookie.getName() + "</td></tr>");
                out.println("<tr><td bgcolor=\"#B0E2FF\">Cookie Value</td><td>");
                out.println(cookie.getValue() + "</td></tr>");
                out.println("</table>");
            } else {
                out.println("No cookie is added, fill in the form");
            }
        } catch (IOException ioe) {
            out.println("Exception : " + ioe.getMessage());
        }

        
        out.println("<p>");
        out.println("<h3>Cookie Input Form</h3>");
        out.println("<form action=\"cookie\" method=POST>");
        out.println("<table border=\"0\" cellpadding=\"2\">");
        out.println("<tr><td>Cookie Name</td>");
        out.println("<td><input type=text size=20 name=cookiename></td></tr>");
        out.println("<tr><td>Cookie Value</td>");
        out.println("<td><input type=text size=20 name=cookievalue></td></tr>");
        out.println("</table>");
        out.println("<input type=submit>");
        out.println("</form>");

        out.println("</td></tr></table><br><br>");	
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        doGet(request, response);
    }

}


