package Homework._1_procedural.hw_2_iter;

import java.util.Scanner;

/*
2.1. Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
Рекурсия
 */
public class ex_2_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int number) {
        if (number == 0) return 1;
        if (number == 1) return 1;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}

