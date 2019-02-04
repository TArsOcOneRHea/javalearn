package Practice._2_oop;

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

    public void setSeconds(int seconds){
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

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
        int sec = allSeconds % 60;
        int m = (allSeconds - sec) / 60;
        int min = ((m + minutes) % 60);
        int h = hours + ((m + minutes - min) / 60);
        this.seconds = sec;
        this.minutes = min;
        this.hours = h;
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
