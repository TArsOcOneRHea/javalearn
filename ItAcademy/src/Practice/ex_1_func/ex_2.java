package Practice.ex_1_func;

import java.util.Scanner;

/*
2. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля") (if-else && switch)
 */
public class ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int rouble = sc.nextInt();
        int lastDigit = rouble % 10;

        if (rouble > 10 && rouble < 20) {
            System.out.println(rouble + " рублей");
        } else if (lastDigit == 1) {
            System.out.println(rouble + " рубль");
        } else if (lastDigit == 2 || lastDigit == 3 || lastDigit == 4) {
            System.out.println(rouble + " рубля");
        } else {
            System.out.println(rouble + " рублей");
        }
    }

}

