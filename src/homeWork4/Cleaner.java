package homeWork4;

public class Cleaner extends Worker{

    @Override
    public void setProf() {
        super.setProf();
    }

    public Cleaner(String name, String surname, int exp) {
        super(name, surname, exp);
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
