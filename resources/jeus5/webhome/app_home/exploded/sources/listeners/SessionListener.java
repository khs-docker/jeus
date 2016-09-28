/*
 * $Header:$
 * $Revision:$
 * $Date:$
 */

package listeners;

import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSession;

/**
 * Simple implementation of HttpSessionListener
 */

public class SessionListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionListener] sessionCreated : id = " + session.getId();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }

    public void sessionDestroyed(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionListener] sessionDestroyed : id = " + session.getId();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }
}
