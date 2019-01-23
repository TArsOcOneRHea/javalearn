package Homework.hw_3_arrays;
/*
1. Напишите программу, которая циклически сдвигает элементы
массива вправо на одну позицию, и печатает результат.
 */
public class ex_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        before_transposition(array);
//        after_transposition(array);
    }
    public static void  before_transposition(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(i + " ");
        }
    }
//    public static void after_transposition(int[] array ){
//        int i = 0;
//        int b = 3;
//
//        int tmp = a;
//        a = b;
//        b = tmp;
//
//    }
}
