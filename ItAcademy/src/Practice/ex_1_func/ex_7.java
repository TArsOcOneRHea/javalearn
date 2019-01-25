package Practice.ex_1_func;

import java.util.Scanner;

/*
7. Написать функцию, которая принимает один целочисленный параметр и возвращает значение,
равное этому параметру, возведенному в куб.
 */
public class ex_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.println(cube(number));
    }
    private static int cube(int number){
        int cube = number * number * number;
        return cube;
    }
}
