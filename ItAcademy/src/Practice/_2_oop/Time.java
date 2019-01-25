package Practice._2_oop;

public class Time {
    int seconds;
    int minutes;
    int hours;

    public Time(int allSeconds){
        int sec = seconds % 3600;
        int min = ((seconds - sec) % 60);
        int hrs = seconds / 3600;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public static void printReselt{
        System.out.println(hours + " " + minutes + " " + seconds);
    }
}
