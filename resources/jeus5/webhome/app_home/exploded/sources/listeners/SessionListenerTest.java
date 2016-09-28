package listeners;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionListenerTest extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");

	String title = "Session APIs";
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body bgcolor=\"white\">");

        out.println("<a href=\"/examples/index.html\">");
        out.println("<img src=\"/examples/images/home.gif\" height=30 width=38></a>");
        out.println("<a href=\"/examples/index.html\">To Main Page</a>");
        out.println("<a href=\"/examples/WEB-INF/classes/SessionTest.java\">");
        out.println("<img src=\"/examples/images/code.gif\" height=30 width=38></a>");
        out.println("<a href=\"/examples/WEB-INF/classes/SessionTest.java\">View Code</a>");
        out.println("<h1>" + title + "</h1>");


        out.println("<h3>Session Informations</h3>");
        out.println("<table border=\"0\" cellpadding=\"5\">");
        HttpSession session = request.getSession();
        out.println("<tr><td bgcolor=\"#FFFFFF\"><b>HttpSession APIs</b></td><td></td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Engine ID</td><td>");
		jeus.servlet.engine.Context ctx = (jeus.servlet.engine.Context)getServletContext();
		String engineId = ctx.getContainerManager().getEngineName();
        out.println(engineId + "</td></tr>");
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
        String submit = request.getParameter("submit");
        String attrName = request.getParameter("attrname");
        String attrValue = request.getParameter("attrvalue");
        if (submit == null) {
            // do noting
        } else if (submit.equals("add")) {
            if (attrName != null && attrValue != null) {
                session.setAttribute(attrName, attrValue);
            }
        } else if (submit.equals("remove")) {
            if (attrName != null)
                session.removeAttribute(attrName);
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
        out.println("<form action=\"SessionListenerTest\" method=POST>");
        out.println("<table border=\"0\" cellpadding=\"2\">");
        out.println("<tr><td>Attribute Name</td><td>");
        out.println("<input type=text size=20 name=attrname></td></tr>");
        out.println("<tr><td>Attribute Value</td><td>");
        out.println("<input type=text size=20 name=attrvalue></td></tr>");
        out.println("<tr><td>Max Inactive Time(seconds)</td><td>");
        out.println("<input type=text size=20 name=inactive></td></tr>");
        out.println("</table>");
        out.println("</table>");
        out.println("<input type=submit name=\"submit\" value=\"add\">");
        out.println("<input type=submit name=\"submit\" value=\"remove\">");
        out.println("</form>");

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
