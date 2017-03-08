package andrii.listeners;

import andrii.model.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import static andrii.model.DB_Handler.selectDogs;

public class MyServletSessionListener implements HttpSessionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyServletSessionListener.class);

    private static int activeSessions;

    public static int getActiveSessions() {
        return activeSessions;
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {

        activeSessions++;

        Dog dog = selectDogs().get(0);
        httpSessionEvent.getSession().setAttribute("dog", dog);

        LOGGER.info("session " + httpSessionEvent.getSession().getId() + " created, " +
                "active sessions: " + activeSessions);

        httpSessionEvent.getSession().setMaxInactiveInterval(20);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

        activeSessions--;

        LOGGER.info("session " + httpSessionEvent.getSession().getId() +
                " destroyed, active sessions: " + activeSessions);
    }
}
