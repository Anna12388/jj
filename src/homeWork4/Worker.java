package homeWork4;

import java.util.Arrays;

public class Worker extends Employee {
    public Worker(String name, String surname, int exp) {
        super(name, surname, exp);

    }

    @Override
    public void setProf() {
        this.prof = PROF.WORKER;

    }

    @Override
    public void addWorker(Employee employee) {

        if (employee == employee) {
            super.addWorker(employee);
        else{
                System.out.printf("Можно нанимать только стажеров");
            }
        }
    }
}
