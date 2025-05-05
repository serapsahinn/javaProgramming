package chapter11;

public class Faculty extends Employee
{


    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email,
                   String office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "officeHours='" + officeHours + '\'' +
                ", rank='" + rank + '\'' +
                "} " + super.toString();
    }
}
