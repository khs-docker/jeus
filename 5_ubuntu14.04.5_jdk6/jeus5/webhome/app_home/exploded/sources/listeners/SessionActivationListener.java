/*
 * $Header:$
 * $Revision:$
 * $Date:$
 */

package listeners;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSession;

/**
 * Simple implementation of HttpSessionActivationListener
 */

public class SessionActivationListener implements HttpSessionActivationListener {

    public void sessionDidActivate(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionListener] sessionActivated : id = " + session.getId();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }

    public void sessionWillPassivate(HttpSessionEvent event) {
        HttpSession session = event.getSession();
        String msg = "[SessionListener] sessionPassivated : id = " + session.getId();
        session.getServletContext().log(msg);
        System.out.println(msg);
    }
}
