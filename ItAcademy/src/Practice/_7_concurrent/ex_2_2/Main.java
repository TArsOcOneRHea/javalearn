package Practice._7_concurrent.ex_2_2;

import java.util.Scanner;

/**
 * Родительская нить программы должна считывать вводимые пользователем строки и помещать их в
 * начало связанного списка. Строки длиннее 80 символов можно разрезать на несколько строк.
 * При вводе пустой строки программа должна выдавать текущее состояние списка. Дочерняя нить
 * пробуждается каждые пять секунд и сортирует список в лексикографическом порядке (используйте Collections.sort(...)).
 * Все операции над списком должны синхронизоваться при помощи мьютекса.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddString addString = new AddString();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                    addString.sortNumbers();
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
        while (true){
            int i = scanner.nextInt();
            addString.addNumber(i);
        }
    }
}

