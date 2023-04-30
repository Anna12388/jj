package homeWork4;
public abstract class Employee extends Person {

    private int exp;
    protected PROF prof;
    private int basic = 1000;

    public Employee(String name, String surname, int exp) {
        super(name, surname);
        this.exp = exp;
        setProf();

    }
    public abstract void setProf();
    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", surname=" + surname +
                ", exp=" + exp +
                ", prof=" + prof +
                ", salary=" + getSalary() +
                '}';
    }
    public int getSalary(){
        return basic * prof.getKoef() * exp;

    }
}
