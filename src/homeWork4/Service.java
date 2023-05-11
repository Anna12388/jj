package homeWork4;

public class Service implements FindInterface{
    @Override
    public boolean find(Employee employee, String name) {
        Employee[] employees = employee.getEmployees();
        for (Employee emp : employees){
            String empName = emp.name;
            if(empName.equals(name)){
                return true;
            }
        }return false;
    }
}
