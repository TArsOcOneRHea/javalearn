package Homework.hw_1_func;

import java.util.Scanner;

/*
Имеются два дома размерами a на b и c на d. Размеры вводятся польователем с консоли.
Проверить, помещаются ли эти дома на участке размерами e на f.
Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
 */
public class ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Разсмер первого дома:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Разсмер второго дома:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Разсмер участка:");
        int e = sc.nextInt();
        int f = sc.nextInt();

        checkTheCapacityOfHouses(a, b, c, d, e, f);
    }

    private static void checkTheCapacityOfHouses(int a, int b, int c, int d, int e, int f) {
        if((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (a + d)) && (f >= c && f >= b)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (a + d)) && (e >= c && e >= b)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("Можно построить 2 дома");
        } else
            System.out.println("Нельзя построить 2 дома");
    }
}
