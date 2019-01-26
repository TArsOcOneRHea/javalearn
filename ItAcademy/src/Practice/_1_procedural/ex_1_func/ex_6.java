package Practice._1_procedural.ex_1_func;

import java.util.Scanner;

/*
6. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */
public class ex_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2-а числа для сравнения: ");
        int first_number = sc.nextInt();
        int second_number = sc.nextInt();

        if (first_number > second_number) {
            System.out.println("Наибольшее из них -  " + first_number);
        } else {
            System.out.println("Наибольшее из них -  " + second_number);
        }

    }
}
