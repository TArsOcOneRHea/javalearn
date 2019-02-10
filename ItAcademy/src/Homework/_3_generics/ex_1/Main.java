package Homework._3_generics.ex_1;
/*
1. Реализуйте обобщенный класс `Pair<E>`, позволяющий сохранять пару элементов типа `Е`.
 Предоставьте методы доступа для получения первого и второго элементов.
 */
public class Main {
    public static void main(String[] args) {

        Pair<Integer> stringPair = new Pair<>(256, 5698);

        System.out.println(stringPair.getFirstElement());
        System.out.println(stringPair.getSecondElement());
    }
}
