package andrii.listeners;

import andrii.model.Dog;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import static andrii.model.DB_Handler.selectDogs;

public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();

//        String dogBreed = servletContext.getInitParameter("breed");
//        Dog dog = new Dog(dogBreed);

        Dog dog = selectDogs().get(0);

        servletContext.setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
