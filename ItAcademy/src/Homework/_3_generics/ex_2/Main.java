package Homework._3_generics.ex_2;

public class Main {
    public static void main(String[] args) {
        MaxMin<Integer> maxMin = new MaxMin<>(256, 578);

        System.out.println(maxMin.min());
        System.out.println(maxMin.max());
    }
}
