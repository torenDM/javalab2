import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name; // Имя отдела
    private Employee head; // Начальник отдела
    private List<Employee> employees; // Список сотрудников отдела

    // Конструктор для создания отдела с именем
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>(); // Инициализируем список сотрудников
    }

    // Метод для установки начальника отдела
    public void setHead(Employee employee) {
        this.head = employee;
        employee.setDepartment(this); // Устанавливаем отдел для начальника
    }

    // Метод для получения имени отдела
    public String getName() {
        return name;
    }

    // Метод для получения начальника отдела
    public Employee getHead() {
        return head;
    }

    // Метод для получения списка сотрудников отдела
    public List<Employee> getEmployees() {
        return employees;
    }

    // Метод для добавления сотрудника в список сотрудников отдела
    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) { // Проверяем, чтобы избежать дублирования
            employees.add(employee);
        }
    }
}
