package user;
public enum USER {
    USER1("Irina", "Zaiceva", "F"),
    USER2("Nikolai", "Petrov", "M"),
    USER3("Marina", "Belova", "F");

    private String name;
    private String lastname;
    private int age;
    private char gender;

    USER(String name,String lastname,int age,char gender) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }
    public void printNameAndLastname(){
        System.out.println(name + " " + lastname);
    }
}
