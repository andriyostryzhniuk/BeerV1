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

    public Employee(String name, int empID, Dog dog) {
        super(name, dog);
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}
