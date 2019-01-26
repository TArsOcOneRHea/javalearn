package Practice._1_procedural.ex_1_func;

import java.util.Scanner;

/*
Написать программу, которая считывает год, введённый пользователем, и определяет, является ли этот год високосным.
Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100, то этот год не високосный,
за исключением годов, делящихся на 400.
Например:
1992 - високосный
1900 - не високосный
2000 – високосный
 */
public class ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        checkYear(year);
    }

    private static void checkYear(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Високосный");
            }
        } else {
            System.out.println("Не високосный");
        }
    }
}
