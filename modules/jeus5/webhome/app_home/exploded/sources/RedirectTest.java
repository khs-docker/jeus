
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RedirectTest extends HttpServlet {
    
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
        //response.setContentType("text/html;charset=EUC-KR");
        response.sendRedirect("/examples/index.jsp");        
    }

}

