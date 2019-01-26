package Practice._2_oop.ex_1_class_and_encapsulation;

public class Time {
    int seconds = 3700;
    int minutes;
    int hours;

    public Time(int allSeconds){
        int sec = seconds % 60;
        int min = (seconds - sec) / 60;
        int hrs = ((seconds - sec) - min) / 60;
    }

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
//    public static void printReselt{
//        System.out.println(hours + " " + minutes + " " + seconds);
//    }
}
