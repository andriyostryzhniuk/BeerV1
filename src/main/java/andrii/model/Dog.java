package andrii.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.io.Serializable;

public class Dog extends Pet implements HttpSessionBindingListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(Dog.class);

    private Integer id;
    private String breed;

    public Dog() {
        super();
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public Dog(Integer id, String name, String breed) {
        super(name);
        this.id = id;
        this.breed = breed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        LOGGER.info("dog's object bounded: " + httpSessionBindingEvent.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        LOGGER.info("dog's object unbounded: " + httpSessionBindingEvent.getName());
    }
}
