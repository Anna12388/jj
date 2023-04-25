package homeWork3.user;

import static java.lang.System.*;

public enum USER {
    USER1("Irina", "Zaiceva", 55, 'F'),
    USER2("Nikolai", "Petrov", 34, 'M'),
    USER3("Marina", "Belova", 39, 'F');

    private String name;
    private String lastname;
    private int age;
    private char gender;

    USER(String name, String lastname, int age, char gender) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    public void printNameAndLastname() {
        System.out.println(name + " " + lastname);
    }

    public int upAge(int plusAge) {
        age++;
        System.out.println(age);
        return plusAge;
    }
}
