package homeWork4;

public class Worker extends Employee {
    public Worker (String name, String surname, int exp) {
        super(name, surname, exp);

    }
    @Override
    public void setProf() {
        this.prof = PROF.WORKER;

    }

}
