package Practice._7_concurrent.ex_3_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 27.02.2019.
 */
public class AddString {
    private final Object monitor = new Object();

    private List<Integer> numbers = new ArrayList<>();

    void addNumber(int number) {
        synchronized (monitor) {
            numbers.add(number);
        }
    }

    void sortNumbers() {
        synchronized (monitor) {
            numbers.sort(Comparator.naturalOrder());
            System.out.println(numbers);
        }
    }
}
