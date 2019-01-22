package hw_2_iter;

import java.util.Scanner;
/*
2.1. Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
Цикл
 */
public class ex_2_cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        fibonacci(number);

    }
    private static void fibonacci(int number){
        int ft1 = 0;
        int sc2 = 1;
        System.out.print(sc2 + " ");
        int summFibonacci;
        for (int i = 0; i < number; i++){
            summFibonacci = ft1 + sc2;
            ft1 = sc2;
            sc2 = summFibonacci;
            System.out.print(summFibonacci + " ");
        }
    }
}
