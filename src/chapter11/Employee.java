package chapter11;

public class Employee extends Person
{

    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee(String name, String address, String phone, String email,
                    String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                "} " + super.toString();
    }
}
