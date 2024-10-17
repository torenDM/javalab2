import java.util.List;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
        department.addEmployee(this); // Добавляем сотрудника в отдел
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public List<Employee> getColleagues() {
        return department.getEmployees(); // Возвращаем всех сотрудников отдела
    }

    @Override
    public String toString() {
        if (department.getHead() == this) {
            return name + " - начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() +
                    ", начальник которого " + department.getHead().getName();
        }
    }
}