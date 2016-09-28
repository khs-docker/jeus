
import java.io.*;
//import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionTest extends HttpServlet {

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
		out.println("<a href='/examples/sources/SessionTest.java'><b><font color='#FFFFFF'><b>view source </b></font></a></td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("</tr>");
		out.println("<td colspan='4' class='tdpadding'>");
		


        out.println("<br><h3>Session Informations</h3>");
        out.println("<table border=\"0\" cellpadding=\"5\">");
        HttpSession session = request.getSession();
        out.println("<tr><td bgcolor=\"#FFFFFF\"><b>HttpSession APIs</b></td><td></td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Session ID</td><td>");
        out.println(session.getId() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Creation Time</td><td>");
        out.println(new Date(session.getCreationTime()) + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Last Access Time</td><td>");
        out.println(new Date(session.getLastAccessedTime()) + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">is New</td><td>");
        out.println(session.isNew() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Max Inactive Interval(seconds)</td><td>");
        out.println(session.getMaxInactiveInterval() + "</td></tr>");
        String inactiveTime = request.getParameter("inactive");
	try {
	    int interval = Integer.parseInt(inactiveTime);
	    if (interval != session.getMaxInactiveInterval()) {
                session.setMaxInactiveInterval(interval);
                out.println("<tr><td bgcolor=\"#B0E2FF\">New Max Inactive Interval</td><td>");
                out.println(session.getMaxInactiveInterval() + "</td></tr>");
	    }
	} catch (NumberFormatException nfe) {
	}
        out.println("<tr><td bgcolor=\"#FFFFFF\"><b>HttpServletRequest APIs</b></td><td></td></tr>");
        out.println("<tr><td bgcolor=\"#CCFFFF\">Session ID</td><td>");
        out.println(request.getRequestedSessionId() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#CCFFFF\">Valid</td><td>");
        out.println(request.isRequestedSessionIdValid() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#CCFFFF\">SessionID From Cookie</td><td>");
        out.println(request.isRequestedSessionIdFromCookie() + "</td></tr>");
        out.println("<tr><td bgcolor=\"#CCFFFF\">SessionID From URL</td><td>");
        out.println(request.isRequestedSessionIdFromURL() + "</td></tr>");
        out.println("</table>");


        out.println("<h3>Session Attributes</h3>");
        String attrName = request.getParameter("attrname");
        String attrValue = request.getParameter("attrvalue");
        if (attrName != null && attrValue != null) {
            session.setAttribute(attrName, attrValue);
        }
        out.println("<table border=\"0\" cellpadding=\"5\">");
        Enumeration names = session.getAttributeNames();
        while (names.hasMoreElements()) {
            String name = (String)names.nextElement(); 
            String value = session.getAttribute(name).toString();
            out.println("<tr><td bgcolor=\"#FDF5E6\">" + name + "</td><td>");
            out.println(value + "</td></tr>");
        }
        out.println("</table>");


        out.println("<p>");
        out.println("<h3>Session Attribute Input Form</h3>");
        out.println("<form action=\"session\" method=POST>");
        out.println("<input type=\"hidden\" name=\"home\" value=\"" + home + "\">");
        out.println("<table border=\"0\" cellpadding=\"2\">");
        out.println("<tr><td>Attribute Name</td><td>");
        out.println("<input type=text size=20 name=attrname></td></tr>");
        out.println("<tr><td>Attribute Value</td><td>");
        out.println("<input type=text size=20 name=attrvalue></td></tr>");
        out.println("<tr><td>Max Inactive Time(seconds)</td><td>");
        out.println("<input type=text size=20 name=inactive></td></tr>");
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
