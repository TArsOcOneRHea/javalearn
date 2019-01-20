package Homework.hw_1_func;

import java.util.Scanner;
/*
3. Написать программу, вычисляющую корни квадратного уравнения вида ax² + bx + c = 0, где a, b и c -
вводимые пользователем из консоли данные. Учитывать только реальные корни
(в случае отрицательного дискриминанта выводить сообщение пользователю).
При решении создать и использовать следующие вынесенные функции:

    функция isPositive, определяющая, является ли число положительным
    функция isZero, определяющая, является ли число нулём
    функция discriminant, вычисляющая дискриминант
 */
public class ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = sc.nextInt();
        System.out.println("Введите b:");
        int b = sc.nextInt();
        System.out.println("Введите c:");
        int c = sc.nextInt();

        int D = discriminant(a, b, c);

        if (isPositive(D)) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("В квадратном уравнении два корня");
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (isZero(D)) {
            double x = ((double)-b / (double) (2 * a));
            System.out.println("В квадратном уравнении один корень");
            System.out.println("x = " + x);
        } else {
            System.out.println("В квадратном уравнении нет корней");
        }
    }
    private static boolean isPositive(int n) {
        return n > 0;
    }
    private static boolean isZero(int n) {
        return n == 0;
    }
    private static int discriminant(int a, int b, int c) {
        return (b * b - 4 * a * c);
    }
}
