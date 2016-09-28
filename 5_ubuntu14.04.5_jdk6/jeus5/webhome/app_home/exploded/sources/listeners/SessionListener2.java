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

public class SessionListener2 implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionListener2] sessionCreated : id = " + session.getId();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }

    public void sessionDestroyed(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionListener2] sessionDestroyed : id = " + session.getId();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }
}
