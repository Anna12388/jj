package homeWork4;

public class Person {
    protected String name;
    protected String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
