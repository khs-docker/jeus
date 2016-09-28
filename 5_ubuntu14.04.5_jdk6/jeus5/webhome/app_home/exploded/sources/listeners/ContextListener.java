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
 * Simple implementation of ServletContextListener and
 * ServletContextAttributeListener
 */

public class ContextListener implements ServletContextListener,
                                        ServletContextAttributeListener {

    public void attributeAdded(ServletContextAttributeEvent event) {
        ServletContext ctx = event.getServletContext();
        String msg = "[ContextListener] attributeAdded : name = " +
            event.getName() + ", value = " + event.getValue() ;
        ctx.log(msg);
        System.out.println(msg);
    }

    public void attributeRemoved(ServletContextAttributeEvent event) {
        ServletContext ctx = event.getServletContext();
        String msg = "[ContextListener] attributeRemoved : name = " +
            event.getName() + ", value = " + event.getValue() ;
        ctx.log(msg);
        System.out.println(msg);
    }

    public void attributeReplaced(ServletContextAttributeEvent event) {
        ServletContext ctx = event.getServletContext();
        String msg = "[ContextListener] attributeReplaced : oldName = " +
            event.getName() + ", oldValue = " + event.getValue() ;
        ctx.log(msg);
        System.out.println(msg);
    }

    public void contextInitialized(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        String msg = "[ContextListener] contextInitialized : contextName = " +
            ctx.getServletContextName();
        ctx.log(msg);
        System.out.println(msg);
    }

    public void contextDestroyed(ServletContextEvent event) {
        ServletContext ctx = event.getServletContext();
        String msg = "[ContextListener] contextDestroyed : contextName = " +
            ctx.getServletContextName();
        ctx.log(msg);
        System.out.println(msg);
    }
}
