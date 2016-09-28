
import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletContextTest extends HttpServlet {
	
    public void init(ServletConfig config) throws ServletException {
	super.init(config);
	ServletContext context = config.getServletContext();
	context.setAttribute("context", "examples");
	context.setAttribute("description", "For testing servlet APIs");
	context.setAttribute("servlet", "ServletContextTest");
    	context.log("ServletContextTest Inited");
    }

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
		out.println("<a href='/examples/sources/ServletContextTest.java'><b><font color='#FFFFFF'><b>view source </b></font></a></td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("</tr>");
		out.println("<td colspan='4' class='tdpadding'>");
        out.println("<br><h3>Servlet Initial Parameters</h3>");
        Enumeration enum = getInitParameterNames();
        while (enum.hasMoreElements()) {
        	String param = (String)enum.nextElement();
        	String value = getInitParameter(param);
        	out.println("GenericServlet.getInitParameter() : " 
        	            + param + " = " + value + "<br>");
        }
        out.println("GenericServlet.getServletName() : " + getServletName() + "<br>");
        out.println("GenericServlet.getServletInfo() : " + getServletInfo() + "<br>");
        
        out.println("<br><h3>Servlet Initial Parameters (ServletConfig)</h3>");
        ServletConfig config = getServletConfig();
        enum = config.getInitParameterNames();
        while (enum.hasMoreElements()) {
        	String param = (String)enum.nextElement();
        	String value = config.getInitParameter(param);
        	out.println("ServletConfig.getInitParameter() : " + param + " = " + value + "<br>");
        }
        out.println("ServletConfig.getServletName() : " + config.getServletName() + "<br>");
       
        out.println("<br><h3>ServletContext Initial Parameters</h3>");
        ServletContext context = getServletContext();
        enum = context.getInitParameterNames();
        while (enum.hasMoreElements()) {
        	String param = (String)enum.nextElement();
        	String value = context.getInitParameter(param);
        	out.println("ServletContext.getInitParameter() : " + param + " = " + value + "<br>");
        }
        out.println("ServletContext.getMajorVersion() : " + context.getMajorVersion() + "<br>");
        out.println("ServletContext.getMinorVersion() : " + context.getMinorVersion() + "<br>");
        out.println("ServletContext.getServerInfo() : " + context.getServerInfo() + "<br>");
        String filepath = context.getRealPath("/") + "images" + File.separator + "code.gif";
        out.println("ServletContext.getMimeType() : " + context.getMimeType(filepath) + "<br>");
        
        out.println("<br><h3>ServletContext Attributes</h3>");
        enum = context.getAttributeNames();
        while (enum.hasMoreElements()) {
        	String param = (String)enum.nextElement();
         	Object value = context.getAttribute(param);
        	if (value instanceof String)
        	    out.println("ServletContext.getAttribute() : " + param + " = " + (String)value + "<br>");
                else
                    out.println("ServletContext.getAttribute() : " + param + " = " + value.toString() + "<br>");
        }
        
        out.println("<br><h3>Modified ServletContext Attributes</h3>");
        out.println("(Removing \"servlet\" attribute)<br>");
        context.removeAttribute("servlet");
        enum = context.getAttributeNames();
        while (enum.hasMoreElements()) {
        	String param = (String)enum.nextElement();
        	Object value = context.getAttribute(param);
        	out.println("ServletContext.getAttribute() : " + param + " = " + value + "<br>");
        }
        
        out.println("<br><h3>Attributes of Other ServletContext</h3>");
        out.println("(Examples servlet context)");
        ServletContext other = context.getContext("/examples");
        enum = other.getAttributeNames();
        while (enum.hasMoreElements()) {
        	String param = (String)enum.nextElement();
        	Object value = other.getAttribute(param);
        	out.println("examples context attribute : " + param + " = " + value + "<br>");
        }
        
        out.println("<br><h3>Deprecated ServletContext APIs</h3>");
        out.println("(Nothing must be printed)");
        enum = context.getServletNames();
        while (enum.hasMoreElements()) {
        	String name = (String)enum.nextElement();
        	Servlet value = (Servlet)context.getServlet(name);
        	out.println("getServletNames() : " + name + "<br>");
        	if (value != null)
        	    out.println("Error : getServlet() returns non-null object !!!<br>");
        }
        enum = context.getServlets();
        while (enum.hasMoreElements()) 
        	out.println("Error : getServlets() returns non-empty enum object !!!<br>");
        
        try {
            out.println("<br><h3>ServletContext Resource APIs</h3>");
            URL url = context.getResource("/hello.html");
            out.println("ServletContext.getResource() (/hello.html) : " + url.toString());
            // will be deleted
            //out.println("<br> host = " + url.getHost() + ", port = " + url.getPort() +
            //            ", protocol = " + url.getProtocol() + ", file = " + url.getFile());
            InputStream is = url.openStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = in.readLine()) != null) {
            	out.println(line);
            }
            
            out.println("ServletContext.getResourceAsStream() (/hello.html)");
            is = context.getResourceAsStream("/hello.html");
            in = new BufferedReader(new InputStreamReader(is));
            while ((line = in.readLine()) != null) {
            	out.println(line);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        out.println("</td></tr></table><br><br>");	
        out.println("</body>");
        out.println("</html>");
    }
}



