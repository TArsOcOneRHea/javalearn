package Practice.ex_1_func;

import java.util.Scanner;

/*
8. Написать функцию, которая определяет, является ли последняя цифра переданного целого числа – цифрой 3.
(является четной/нечетной).
 */
public class ex_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        int lastDigit = number % 10;

        if (lastDigit == 1 || lastDigit == 3 || lastDigit == 5 || lastDigit == 7 || lastDigit == 9) {
            System.out.println("Не четное");
        } else {
            System.out.println("Четное");
        }
    }
}
