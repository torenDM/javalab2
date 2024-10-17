public class Name {
    private String surname; // Фамилия
    private String name; // Имя
    private String patronymic; // Отчество

    // Конструктор
    public Name(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.name = firstName;
        this.patronymic = patronymic;
    }

    // Метод для получения строкового представления
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Добавляем фамилию, если она задана
        if (surname != null && !surname.isEmpty()) {
            sb.append(surname);
        }

        // Добавляем личное имя, если оно задано
        if (name != null && !name.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" "); // Добавляем пробел, если уже есть фамилия
            }
            sb.append(name);
        }

        // Добавляем отчество, если оно задано
        if (patronymic != null && !patronymic.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(" "); // Добавляем пробел, если уже есть фамилия или имя
            }
            sb.append(patronymic);
        }

        return sb.toString(); // Возвращаем строку
    }
}