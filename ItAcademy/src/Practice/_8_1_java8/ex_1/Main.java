package Practice._8_1_java8.ex_1;

import java.util.function.Predicate;

/**
 * Напишите функциональный интерфейс, который принимает 3 аргумента и возвращает тип boolean.
 */
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> some = arg -> arg > 0;

        SomeInterface<Integer> some3 = (rate1, rate2, rate3) -> rate1 + rate2 + rate3 > 100;

        System.out.println(some3.test(25, 45, 5));


    }
}
