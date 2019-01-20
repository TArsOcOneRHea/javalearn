package Homework.hw_1_func.hw_2_iter.md;

import java.util.Scanner;

public class ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0){
            sum = sum + (number % 10);
            number = number / 10;
        }
        System.out.println(sum);
    }
}
