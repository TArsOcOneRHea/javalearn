package Practice._7_concurrent.ex_2_2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Родительская нить программы должна считывать вводимые пользователем строки и помещать их в
 * начало связанного списка. Строки длиннее 80 символов можно разрезать на несколько строк.
 * При вводе пустой строки программа должна выдавать текущее состояние списка. Дочерняя нить
 * пробуждается каждые пять секунд и сортирует список в лексикографическом порядке (используйте Collections.sort(...)).
 * Все операции над списком должны синхронизоваться при помощи мьютекса.
 */
public class AddString {
    private final Object monitor = new Object();

    private List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        synchronized (monitor) {
            numbers.add(number);
        }
    }

    public void sortNumbers() {
        synchronized (monitor) {
            numbers.sort(Comparator.naturalOrder());
            System.out.println(numbers);
        }
    }
}
