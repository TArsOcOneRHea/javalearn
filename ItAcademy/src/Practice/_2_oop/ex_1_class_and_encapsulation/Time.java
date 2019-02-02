package Practice._2_oop.ex_1_class_and_encapsulation;

/*
Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами: секундами,
минутами и часами. Создать два конструктора: первый принимает общее количество секунд(т.е. 3661s = 1h+1m+1s),
второй - часы, минуты и секунды по отдельности. Создать методы:
- для получения полного количества секунд в объекте.
- для вывода данных.  Написать программу для тестирования возможностей класса.

 */
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    protected Time(int seconds, int minutes, int hours) {
        int sec = seconds % 60;
        int m = (seconds - sec) / 60;
        int min = ((m + minutes) % 60);
        int h = hours + ((m + minutes - min) / 60);
        this.seconds = sec;
        this.minutes = min;
        this.hours = h;
}

    protected Time(String str) {
        this(Integer.valueOf(str));
    }

    protected Time(int allSeconds) {
        int sec = (allSeconds % 3600) % 60;
        int min = (allSeconds / 3600);
        int hrs = (allSeconds % 3600) / 60;
        this.seconds = sec;
        this.minutes = min;
        this.hours = hrs;
    }

    @Override
    public String toString() {
        return "Time {" +
                "hours = " + hours +
                ", minutes = " + minutes +
                ", seconds = " + seconds +
                "}";
    }
}
