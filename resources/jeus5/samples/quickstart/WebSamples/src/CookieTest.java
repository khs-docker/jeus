
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieTest extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html; charset=euc-kr");
        String contextPath = request.getContextPath();
        String home = contextPath + "/ko/servlet_main.html";

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
		out.println("		<a href='" + contextPath + "/ko/servlet_main.html'>Servlet </a>&gt; Cookie</td>");
		out.println("		</tr>");
		out.println("	</table>");
		out.println("	<br>");
		out.println("	<table width='776' border='0' cellspacing='0' cellpadding='0'>");
		out.println("		<tr> ");
		out.println("		<td width='22'>&nbsp;</td>");
		out.println("		<td width='145' valign='top' background='" + contextPath + "/images/b_bg.gif'><a href='" + contextPath + "/ko/servlet_sample/cookie/intro.html' onMouseOut=MM_swapImgRestore()' onMouseOver=\"MM_swapImage('sub01','','" + contextPath + "/images/b_me1_up.gif',1)\"><img src='" + contextPath + "/images/b_me1.gif' name='sub01' width='145' height='26' border='0'></a><a href='" + contextPath + "/cookie' onMouseOut='MM_swapImgRestore()' onMouseOver=\"MM_swapImage('sub02','','" + contextPath + "/images/b_me2_up.gif',1)\"><img src='" + contextPath + "/images/b_me2.gif' name='sub02' width='145' height='26' border='0'></a><a href='" + contextPath + "/ko/servlet_sample/cookie/build.html' onMouseOut='MM_swapImgRestore()' onMouseOver=\"MM_swapImage('sub03','','" + contextPath + "/images/b_me3_up.gif',1)\"><img src='" + contextPath + "/images/b_me3.gif' name='sub03' width='145' height='26' border='0'></a>");
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
		out.println("	    <P class='JMHeading1'>Cookie Informations from browser</P>");
		out.println("		<P class='JMHeading4'>");
        Cookie[] cookies = request.getCookies();
        if (cookies == null){
        	out.println("No cookie form browser");
        }else if (cookies.length > 0) {
            out.println("<table border=\"0\" cellpadding=\"5\" class='JMHeading4' width='597'>");
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

        out.println("<P class='JMHeading2'>Added Cookie Informations</P>");
        try {
            ServletInputStream is = request.getInputStream();
            Hashtable params = HttpUtils.parsePostData(request.getContentLength(), is);
            String[] cookieName = (String[])params.get("cookiename");
            String[] cookieValue = (String[])params.get("cookievalue");
            if ((cookieName != null && !cookieName[0].equals("")) &&
		    (cookieValue != null && !cookieValue[0].equals(""))) {
                Cookie cookie = new Cookie(cookieName[0], cookieValue[0]);
                response.addCookie(cookie);
                out.println("<table border=\"0\" cellpadding=\"5\" class='JMHeading4' width='597'>");
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
        out.println("<P class='JMHeading2'>Cookie Input Form</P>");
        out.println("<form action=\"cookie\" method=POST>");
        out.println("<input type=\"hidden\" name=\"home\" value=\"" + home + "\">");
        out.println("<table border=\"0\" cellpadding=\"2\" class='JMHeading4' width='597'>");
        out.println("<tr><td>Cookie Name</td>");
        out.println("<td><input type=text size=20 name=cookiename></td></tr>");
        out.println("<tr><td>Cookie Value</td>");
        out.println("<td><input type=text size=20 name=cookievalue></td></tr>");
        out.println("</table>");
        out.println("<input type=submit>");
        out.println("</form>");

        out.println("</td></tr></table><br><br>");		out.println("		    </P>");
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


