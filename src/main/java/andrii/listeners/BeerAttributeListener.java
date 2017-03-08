package andrii.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class BeerAttributeListener implements HttpSessionAttributeListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(BeerAttributeListener.class);

    @Override
    public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {

        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();

        LOGGER.info("Attribute: " + name + " added, value: " + value);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {

        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();

        LOGGER.info("Attribute: " + name + " removed, value: " + value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {

        String name = httpSessionBindingEvent.getName();
        Object value = httpSessionBindingEvent.getValue();

        LOGGER.info("Attribute: " + name + " replaced, value: " + value);
    }
}
