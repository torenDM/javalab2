import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Time {
    private int seconds;

    // Конструктор для инициализации времени по количеству секунд с начала суток
    public Time(int seconds) {
        this.seconds = seconds % 86400; // 86400 секунд в сутках
    }

    // Конструктор для инициализации времени по часам, минутам и секундам
    public Time(int hours, int minutes, int seconds) {
        this.seconds = (hours * 3600 + minutes * 60 + seconds) % 86400; // 86400 секунд в сутках
    }

    // Метод для получения текстового представления времени
    public String toString() {
        int hours = (seconds / 3600) % 24;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        return String.format("%d:%02d:%02d", hours, minutes, secs);
    }

    // Метод для получения текущего часа
    public int getHours() {
        return (seconds / 3600) % 24;
    }

    // Метод для получения минут, прошедших с начала текущего часа
    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    // Метод для получения секунд, прошедших с начала текущей минуты
    public int getSeconds() {
        return seconds % 60;
    }
}