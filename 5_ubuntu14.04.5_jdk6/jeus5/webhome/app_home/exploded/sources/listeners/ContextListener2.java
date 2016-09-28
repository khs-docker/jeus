/*
 * $Header:$
 * $Revision:$
 * $Date:$
 */

package listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextAttributeEvent;

/**
 * Simple implementation of ServletContextListener
 */

public class ContextListener2 implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        String msg = "[ContextListener2] contextInitialized : contextName = " +
            ctx.getServletContextName();
        ctx.log(msg);
        System.out.println(msg);
    }

    public void contextDestroyed(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        String msg = "[ContextListener2] contextDestroyed : contextName = " +
            ctx.getServletContextName();
        ctx.log(msg);
        System.out.println(msg);
    }
}
