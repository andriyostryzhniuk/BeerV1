package andrii.model;

import java.io.Serializable;

public abstract class Person implements Serializable {

    private String name;
    private Dog dog;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
