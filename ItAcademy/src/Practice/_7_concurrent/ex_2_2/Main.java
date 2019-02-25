package Practice._7_concurrent.ex_2_2;

import java.util.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Родительская нить программы должна считывать вводимые пользователем строки и помещать их в
 * начало связанного списка. Строки длиннее 80 символов можно разрезать на несколько строк.
 * При вводе пустой строки программа должна выдавать текущее состояние списка. Дочерняя нить
 * пробуждается каждые пять секунд и сортирует список в лексикографическом порядке (используйте Collections.sort(...)).
 * Все операции над списком должны синхронизоваться при помощи мьютекса.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 65, 34, 7777, 4));
        ReentrantLock reentrantLock = new ReentrantLock();
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
//        new Thread(()


//        List<String> stringLinkedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }


}

