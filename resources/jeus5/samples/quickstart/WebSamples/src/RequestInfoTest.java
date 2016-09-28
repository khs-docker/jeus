
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestInfoTest extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html; charset=euc-kr");
        String contextPath = request.getContextPath();
        String home = "" + contextPath + "/ko/servlet_main.html";

        PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>JEUS 5.0 Sample Application</title>");
		out.println("<meta http-equiv='Content-Type' content='text/html; charset=euc-kr'>");
		out.println("<link href='" + contextPath + "/css/jmtable.css' rel='stylesheet' type='text/css'>");
		out.println("<script language='javascript' src='" + contextPath + "/js/common.js'></script>");
		out.println("</head>");
		out.println("");
		out.println("	<div style='padding-left:11px'><br>");
		out.println("	<table width='776' border='0' cellspacing='0' cellpadding='0'>");
		out.println("		<tr class='JMHeading5'> ");
		out.println("		<td height='27' bgcolor='F0F0F0'><img src='" + contextPath + "/images/point_01.gif' width='9' height='9' align='absmiddle'> ");
		out.println("		<a href='" + contextPath + "/ko/servlet_main.html'>Servlet </a>&gt; RequestInfo</td>");
		out.println("		</tr>");
		out.println("	</table>");
		out.println("	<br>");
		out.println("	<table width='776' border='0' cellspacing='0' cellpadding='0'>");
		out.println("		<tr> ");
		out.println("		<td width='22'>&nbsp;</td>");
		out.println("		<td width='145' valign='top' background='" + contextPath + "/images/b_bg.gif'><a href='" + contextPath + "/ko/servlet_sample/info/intro.html' onMouseOut='MM_swapImgRestore()' onMouseOver=\"MM_swapImage('sub01','','" + contextPath + "/images/b_me1_up.gif',1)\"><img src='" + contextPath + "/images/b_me1.gif' name='sub01' width='145' height='26' border='0'></a><a href='" + contextPath + "/a.info' onMouseOut='MM_swapImgRestore()' onMouseOver=\"MM_swapImage('sub02','','" + contextPath + "/images/b_me2_up.gif',1)\"><img src='" + contextPath + "/images/b_me2.gif' name='sub02' width='145' height='26' border='0'></a><a href='" + contextPath + "/ko/servlet_sample/info/build.html' onMouseOut='MM_swapImgRestore()' onMouseOver=\"MM_swapImage('sub03','','" + contextPath + "/images/b_me3_up.gif',1)\"><img src='" + contextPath + "/images/b_me3.gif' name='sub03' width='145' height='26' border='0'></a>");
		out.println("		</td>");
		out.println("		<td valign='top'><table width='100%' height='100%' border='0' cellpadding='0' cellspacing='0'>");
		out.println("		<tr> ");
		out.println("		<td height='1' bgcolor='CCCCCC'></td>");
		out.println("		</tr>");
		out.println("		<tr> ");
		out.println("		<td background='" + contextPath + "/images/con_bg.gif'><table width='100%' border='0' cellspacing='0' cellpadding='0'>");
		out.println("		<tr> ");
		out.println("		<td height='39' valign='bottom' class='JMHeading6'>");
		out.println("		<img src='" + contextPath + "/images/point_05.gif' width='11' height='12'>실 행</td>");
		out.println("		</tr>");
		out.println("		<tr> ");
		out.println("		<td align='left'><img src='" + contextPath + "/images/line2.gif' width='597' height='6'></td>");
		out.println("		</tr>");
		out.println("		<tr> ");
		out.println("		<!-- contents start -->");
		out.println("		<td class='JMHeading4' width='597'>");
		out.println("		<br><br>");
		out.println("	    <P class='JMHeading1'>Request Informations</P>");
		out.println("		<P class='JMHeading4'>");
		out.println("<table border=\"0\" cellpadding=\"5\" class='JMHeading4' width='597' >");

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

        out.println("<P class='JMHeading2'>Request Parameters</P>");
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
            out.println("<table border=\"0\" cellpadding=\"5\" class='JMHeading4' width='597'>");
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
        out.println("<P class='JMHeading2'>Parameter Input Form</P>");
        out.println("<form action=\"RequestInfoTest\" method=POST>");
        out.println("<input type=\"hidden\" name=\"home\" value=\"" + home + "\">");
        out.println("<table border=\"0\" cellpadding=\"2\" class='JMHeading4' width='597'>");
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
		out.println("		    </P>");
		out.println("		</td>");
		out.println("		<!-- contents end -->");
		out.println("		</tr>");
                out.println("		<tr> ");
                out.println("		<td height='1' bgcolor='CCCCCC'></td>");
                out.println("		</tr>");
		out.println("		</table></td>");
		out.println("		</tr>");
		out.println("		<tr> ");
		out.println("		<td height='1'></td>");
		out.println("		</tr>");
		out.println("		</table></td>");
		out.println("		</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		</div></td>");
		out.println("		</tr>");
		out.println("		<tr>");
		out.println("		<td height='60'><div style='padding-left:11px'><table width='776' border='0' cellspacing='0' cellpadding='0'>");
		out.println("		<tr class='JMHeading5'> ");
		out.println("		<td height='44'><img src='" + contextPath + "/images/copy.gif' width='776' height='44'></td>");
		out.println("		</tr>");
		out.println("	</table>");
		out.println("</div>");
		out.println("");
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

