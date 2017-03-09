package andrii.model;

public class Employee extends Person {

    private int empID;

    public Employee() {
        super();
    }

    public Employee(String name, int empID) {
        super(name);
        this.empID = empID;
    }
}
