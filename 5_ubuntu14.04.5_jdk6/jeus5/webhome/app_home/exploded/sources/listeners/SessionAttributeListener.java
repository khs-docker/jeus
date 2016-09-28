/*
 * $Header:$
 * $Revision:$
 * $Date:$
 */

package listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSession;

/**
 * Simple implementation of HttpSessionAttributeListener
 */

public class SessionAttributeListener implements HttpSessionAttributeListener {

    public void attributeAdded(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionAttributeListener] sessionAttributeAdded : name = " + event.getName();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }

    public void attributeReplaced(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionAttributeListener] sessionAttributeReplaced : name = " + event.getName();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }

    public void attributeRemoved(HttpSessionBindingEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionAttributeListener] sessionAttributeRemoved : name = " + event.getName();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }
}
