
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestInfoTest extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        String home = request.getParameter("home");
        if ( home == null) home = "index.jsp";
       
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
		out.println("<a href='/examples/" + home + "'><b><font color='#FFFFFF' face='Arial'>home</font></b></a></td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("<a href='/examples/sources/RequestInfoTest.java'><b><font color='#FFFFFF'><b>view source </b></font></a></td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("</tr>");
		out.println("<td colspan='4' class='tdpadding'>");
		
        out.println("<br><h3>Request Informations</h3>");
        out.println("<table border=\"0\" cellpadding=\"5\">");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getMethod()</td><td>");
        out.println(request.getMethod() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getScheme()</td><td>");
        out.println(request.getScheme() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getRequestURI()</td><td>");
        out.println(request.getRequestURI() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">HttpUtils.getRequestURL()</td><td>");
        out.println(HttpUtils.getRequestURL(request) + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getProtocol()</td><td>");
        out.println(request.getProtocol() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getAuthType()</td><td>");
        out.println(request.getAuthType() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getRemoteAddr()</td><td>");
        out.println(request.getRemoteAddr() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getRemoteHost()</td><td>");
        out.println(request.getRemoteHost() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getRemoteUser()</td><td>");
        out.println(request.getRemoteUser() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getContextPath()</td><td>");
        out.println(request.getContextPath() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getServletPath()</td><td>");
        out.println(request.getServletPath() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getPathInfo()</td><td>");
        out.println(request.getPathInfo() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getPathTranslated()</td><td>");
        out.println(request.getPathTranslated() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getRealPath()</td><td>");
        out.println(request.getRealPath("/") + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getServerName()</td><td>");
        out.println(request.getServerName() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">getServerPort()</td><td>");
        out.println(request.getServerPort() + "</td></tr>");

        out.println("<tr><td bgcolor=\"#B0E2FF\">isSecure()</td><td>");
        out.println(request.isSecure() + "</td></tr>");

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
        
        out.println("<tr><td bgcolor=\"#B0E2FF\">getQueryString()</td><td>");
        out.println(request.getQueryString() + "</td></tr>");

        out.println("</table><br>");

        out.println("<h3>Request Parameters</h3>");
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
	StringBuffer colors = new StringBuffer();
        Enumeration names = request.getParameterNames();
        while (names.hasMoreElements()) {
            String name = (String)names.nextElement();
            if (name.equals("color")) {
                String[] values = request.getParameterValues(name);
                for (int i = 0; i < values.length; i++) {
		    if (!values[i].equals(""))
                        colors.append(values[i]).append(",");
		}
		colors.setLength(colors.length() - 1);
            }
        }
        if (firstName != null || lastName != null || colors.length() > 0) {
            out.println("<table border=\"0\" cellpadding=\"5\">");
            out.println("<tr><td bgcolor=\"#FDF5E6\">First Name</td><td>");
            out.println(firstName + "</td></tr>");
            out.println("<tr><td bgcolor=\"#FDF5E6\">Last Name</td><td>");
            out.println(lastName + "</td></tr>");
            out.println("<tr><td bgcolor=\"#FDF5E6\">Favorate Colors</td><td>");
            out.println(colors.toString() + "</td></tr>");
            out.println("</table>");
        } else {
            out.println("No Parameters, Please enter some");
        }
             
        out.println("<p>");
        out.println("<h3>Parameter Input Form</h3>");
        out.println("<form action=\"RequestInfoTest\" method=POST>");
        out.println("<input type=\"hidden\" name=\"home\" value=\"" + home + "\">");
        out.println("<table border=\"0\" cellpadding=\"2\">");
        out.println("<tr><td>First Name</td><td>");
        out.println("<input type=text size=20 name=firstname></td></tr>");
        out.println("<tr><td>Last Name</td><td>");
        out.println("<input type=text size=20 name=lastname></td></tr>");
        out.println("<tr><td>Favorite Colors</td><td>");
        out.println("<input type=text size=20 name=color></td></tr>");
        out.println("<tr><td></td><td><input type=text size=20 name=color></td></tr>");
        out.println("<tr><td></td><td><input type=text size=20 name=color></td></tr>");
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

