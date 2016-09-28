package filters;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public final class HitCounterFilter implements Filter {

    private FilterConfig filterConfig = null;
    private Counter counter;

    public void init(FilterConfig filterConfig) throws ServletException {
        filterConfig.getServletContext().log("[DDD] HitCounterFilter init");
        this.filterConfig = filterConfig;
        counter = (Counter)filterConfig.getServletContext().getAttribute("hitCounter");

        if (counter == null) {
            counter = new Counter();
            filterConfig.getServletContext().setAttribute("hitCounter", counter);
        }
    }

    public void destroy() {
        this.filterConfig = null;
        counter.destroy();
        System.out.println("[DDD] HitCounterFilter destroy");
    }

    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException,
                         ServletException {
        if (filterConfig == null)
            return;

        PrintWriter out = response.getWriter();
        CharResponseWrapper wrapper = new
            CharResponseWrapper((HttpServletResponse)response);
        chain.doFilter(request, wrapper);
        StringWriter sw = new StringWriter();
        PrintWriter writer = new PrintWriter(sw);
        
        Counter counter =
            (Counter)filterConfig.getServletContext().getAttribute("hitCounter");
        int count = counter.incCounter();
        writer.println();
        writer.println("=====================================");
        writer.println("The number of hits is : " + count);
        writer.println("=====================================");
        writer.flush();
        filterConfig.getServletContext().log(sw.getBuffer().toString());
        
        CharArrayWriter caw = new CharArrayWriter();
        int pos = wrapper.toString().indexOf("</body>");
        if (pos > 0) {
            caw.write(wrapper.toString().substring(0, pos-1));
            caw.write("<hr><center><p>\nYou are visitor number <font color='red'>" +
                      count + "</font></center>");
            caw.write("\n</body></html>");
            response.setContentLength(caw.toString().length());
            out.write(caw.toString());
        } else {
            System.out.println("[DDD] 2 " + wrapper.toString());
        }
        out.close();
    }
}

