import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        // Задача 1.3: Создание сущности имени с последующим выводом на экран
        System.out.println("\n=== Задача 1.3: Создание сущности имени с последующим выводом на экран");
        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);
        System.out.println(name1); // Клеопатра
        System.out.println(name2); // Пушкин Александр Сергеевич
        System.out.println(name3); // Маяковский Владимир

        // Задача 1.4: Создание объектов времени и вывод их текстового представления
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println("\n=== Задача 1.4: Создание объектов времени и вывод их текстового представления");
        System.out.println("Время для 10 секунд: " + time1);
        System.out.println("Время для 10000 секунд: " + time2);
        System.out.println("Время для 100000 секунд: " + time3);

        // Задача 4.4: Создание объектов времени с указанием часов, минут и секунд
        Time time4 = new Time(10000);
        Time time5 = new Time(2, 3, 5);

        System.out.println("\n=== Задача 4.4: Создание объектов времени с указанием часов, минут и секунди");
        System.out.println("Время для 10000 секунд: " + time4);
        System.out.println("Время для 2 часов, 3 минут, 5 секунд: " + time5);

        // Задача 5.4: Получение информации о текущем времени
        System.out.println("\n=== Задача 5.4: Получение информации о текущем времени");
        System.out.println("Часы для времени 34056: " + new Time(34056).getHours());
        System.out.println("Минуты для времени 4532: " + new Time(4532).getMinutes());
        System.out.println("Секунды для времени 123: " + new Time(123).getSeconds());

        // Задача 2.4: Создание отдела и сотрудников с последующим выводом на экран
        Department itDepartment = new Department("IT");

        Employee petrov = new Employee("Петров");
        Employee sidorov = new Employee("Сидоров");
        Employee kozlov = new Employee("Козлов");

        itDepartment.setHead(kozlov);
        petrov.setDepartment(itDepartment);
        sidorov.setDepartment(itDepartment);

        System.out.println("\n=== Задача 2.4: Создание отдела и сотрудников с последующим выводом на экран");
        System.out.println(petrov);
        System.out.println(sidorov);
        System.out.println(kozlov);

        // Задача 3.4: Создание отдела и сотрудников с последующим выводом на экран
        System.out.println("\n=== Задача 3.4: Создание отдела и сотрудников с последующим выводом на экран");
        System.out.println("Сотрудники в одном отделе с " + petrov.getName() + ":");
        for (Employee colleague : petrov.getColleagues()) {
            System.out.println(colleague.getName());
        }
    }
}
