package chapter11;

public class Person
{
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {}

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Class: Person, Name: " + name;
    }
}
