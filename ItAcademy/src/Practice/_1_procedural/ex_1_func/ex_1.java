package Practice._1_procedural.ex_1_func;

import java.util.Scanner;
import java.lang.String;
/*
Задачка с порами года (if-else && switch)
 */
public class ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число месяца : ");
        int month = sc.nextInt();

        checkMonth(month);
    }

    private static void checkMonth(int month) {
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("Febryary");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}