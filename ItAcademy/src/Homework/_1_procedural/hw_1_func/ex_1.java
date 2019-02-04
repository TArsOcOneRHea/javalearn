package Homework._1_procedural.hw_1_func;

import java.util.Scanner;

/*
1. Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */
public class ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = sc.nextInt();
        System.out.println("Введите месяц:");
        int month = sc.nextInt();
        System.out.println("Введите год:");
        int year = sc.nextInt();
        System.out.println("Введенная дата:" + day + "." + month + "." + year);

        int daysInMonth = checkDaysInMonth(month, year);

        if (day > daysInMonth || month > 12) {
            System.out.println("Дата введена некорректно");
        } else if (day < daysInMonth) {
            System.out.println("Полученная дата:" + (day + 1) + "." + month + "." + year);
        } else {
            if (month != 12) {
                System.out.println("Полученная дата:" + 1 + "." + (month + 1) + "." + year);
            } else {
                System.out.println("Полученная дата:" + 1 + "." + 1 + "." + (year) + 1);
            }
        }
    }

    private static int checkDaysInMonth(int month, int year) {
        int days = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 31;
                break;
            case 2:
                if (year % 4 == 0) {
                    if ((year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                        break;
                    }
                } else {
                    days = 28;
                    break;
                }
        }
        return days;
    }
}
