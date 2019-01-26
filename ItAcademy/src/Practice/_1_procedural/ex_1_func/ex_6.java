package Practice._1_procedural.ex_1_func;

import java.util.Scanner;

/*
6. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */
public class ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2-а числа для сравнения: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        compareTwoDigit(firstNumber, secondNumber);
    }

    private static void compareTwoDigit(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("Наибольшее из них -  " + firstNumber);
        } else {
            System.out.println("Наибольшее из них -  " + secondNumber);
        }
    }
}
