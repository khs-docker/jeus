
import java.io.*;
import java.text.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestHeaderTest extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html");
        String home = "index.jsp";
        
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
		out.println("<a href='/examples/sources/RequestHeaderTest.java'><b><font color='#FFFFFF'><b>view source </b></font></a></td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("<td  width=\"25%\" align=\"center\" onMouseover=\"this.style.backgroundColor='#0099cc'\" onMouseout=\"this.style.backgroundColor='#999999'\">");
		out.println("</td>");
		out.println("</tr>");
		out.println("<td colspan='4' class='tdpadding'>");
        out.println("<br><h3>Request Headers</h3>");
        out.println("<table border=\"0\" cellpadding=\"10\">");
        Enumeration e = request.getHeaderNames();
        while (e.hasMoreElements()) {
            String headerName = (String)e.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("<tr><td bgcolor=\"#B0E2FF\">" + headerName);
            out.println("</td><td>" + headerValue + "</td></tr>");
        }
        out.println("</table>");

        out.println("<table border=\"0\" cellpadding=\"10\">");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Content-Length by getIntHeader()</td><td>");
        out.println(request.getIntHeader("Content-Length") + "</td></tr>");
        out.println("<tr><td bgcolor=\"#B0E2FF\">Date by getDateHeader()</td><td>");
        out.println(request.getDateHeader("Date") + "</td></tr>");
        e = request.getHeaders("Accept-Language");
        while (e.hasMoreElements()) {
            String lang = (String)e.nextElement();
            out.println("<tr><td bgcolor=\"#B0E2FF\">Accept-Language by getHeaders()</td><td>");
            out.println(lang + "</td></tr>");
        }
        out.println("</table>");
        
        out.println("<br><h3>ServletContext Attributes</h3>");
        ServletContext context = getServletContext();
        Enumeration enum = context.getAttributeNames();
        while (enum.hasMoreElements()) {
       	    String param = (String)enum.nextElement();
            Object value = context.getAttribute(param);
            out.println("ServletContext.getAttribute() : " + param + " = " + value + "<br>");
        }
        
        out.println("<br><h3>Request Parameters (getting by getReader())</h3>");    
        String contentType = request.getContentType();
        System.out.println("content type ==> " + contentType);
        if (contentType != null) {
            try {
                int contentLength = request.getContentLength();
                System.out.println("content length ==> " + contentLength);
                char[] buf = new char[contentLength];      		
       	        BufferedReader br = request.getReader();
       	        System.out.println("reading 1 ==>" + br.read());
       	        int readbytes = br.read(buf, 0, contentLength);
       	        System.out.println("readbytes ==> " + readbytes);
                String queryString = new String(buf);
                System.out.println("querystring ==> " + queryString);
       	        out.println(queryString + "<br>");
                Hashtable params = HttpUtils.parseQueryString(queryString);
                Enumeration names = params.keys();
                out.println("<table border=\"0\" cellpadding=\"5\">");
                while (names.hasMoreElements()) {
                    String name = (String)names.nextElement();
                    String[] values = (String[])params.get(name);
		    for (int i = 0; i < values.length; i++) {
                        out.println("<tr><td bgcolor=\"#FDF5E6\">" + name + "</td><td>");
                        out.println(values[i]+ "</td></tr>");
		    }
                }
                out.println("</table>");
            } catch (IllegalStateException ise) {
        	out.println("IllegalStateException catched..." + ise.getMessage());
        	ise.printStackTrace();
                return;
            } catch (UnsupportedEncodingException uee) {
        	out.println("UnsupportedEncodingException catched...");
        	uee.printStackTrace();
                return;
            } catch (Exception ex) {
		ex.printStackTrace();
                return;
            }
        } else
            out.println("<br>No Parameters, Please enter some");

        out.println("<p>");
        out.println("<h3>Parameter Input Form</h3>");
        out.print("<form action=\"RequestHeaderTest\" method=POST>");
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
		out.println("</td></tr></table><br><br>");	
        out.println("</body>");
        out.println("</html>");
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

