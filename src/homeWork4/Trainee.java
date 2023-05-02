package homeWork4;

public class Trainee extends Employee {

    public Trainee(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public void setProf() {
        this.prof = PROF.TRAINEE;
    }
}
