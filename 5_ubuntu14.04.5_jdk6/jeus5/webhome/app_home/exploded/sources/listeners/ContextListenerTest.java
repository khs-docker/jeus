package listeners;

import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ContextListenerTest extends HttpServlet {

    public void init(ServletConfig config) {
        ServletContext context = config.getServletContext();
        context.setAttribute("attr1", "attr1");
        // attribute removed
        context.setAttribute("attr1", null);
        context.setAttribute("attr2", "attr2");
        // attribute removed
        context.removeAttribute("attr2");
        context.setAttribute("attr3", "attr3");
        // attribute replaced
        context.setAttribute("attr3", "attr3-1");
    }
    
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws IOException, ServletException
    {
    }
}

