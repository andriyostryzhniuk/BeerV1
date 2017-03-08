package andrii.servlets;

import andrii.model.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import static andrii.model.DB_Handler.selectDogs;

public class MyServletSessionListener implements HttpSessionListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyServletSessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        LOGGER.info("session " + httpSessionEvent.getSession().getId() + " created");

        Dog dog = selectDogs().get(0);
        httpSessionEvent.getSession().setAttribute("dog", dog);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        LOGGER.info("session " + httpSessionEvent.getSession().getId() + " destroyed");
    }
}
