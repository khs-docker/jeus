import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SharedThreadModelTest extends HttpServlet {

    private String name = null;
    private int trials = 0;

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        response.setContentType("text/html;charset=EUC-KR");
        response.setHeader("Content-Language", "ko");
        PrintWriter out = response.getWriter();
	out.println("<h1>this is test</h1>");
	out.println("<h3>before name: " + name + ", trials: " + trials + "</h1>");
	name = "JEUS";
	trials++;
	out.println("<h3>after name: " + name + ", trials: " + trials + "</h1>");
        out.flush();
        out.close();
    }

    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        doGet(request, response);
    }
}
