import java.util.List;

public class Employee {
    private String name; // Имя сотрудника
    private Department department; // Отдел, к которому принадлежит сотрудник

    // Конструктор для создания сотрудника с именем
    public Employee(String name) {
        this.name = name;
    }

    // Метод для установки отдела для сотрудника
    public void setDepartment(Department department) {
        this.department = department;
        department.addEmployee(this); // Добавляем сотрудника в отдел
    }

    // Метод для получения имени сотрудника
    public String getName() {
        return name;
    }

    // Метод для получения отдела сотрудника
    public Department getDepartment() {
        return department;
    }

    // Метод для получения списка коллег в одном отделе
    public List<Employee> getColleagues() {
        return department.getEmployees(); // Возвращаем всех сотрудников отдела
    }

    @Override
    public String toString() {
        // Форматируем строку представления сотрудника
        if (department.getHead() == this) {
            return name + " - начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() +
                    ", начальник которого " + department.getHead().getName();
        }
    }
}
