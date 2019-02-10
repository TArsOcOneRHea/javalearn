package Homework._1_procedural.hw_3_arrays;
/*
1. Напишите программу, которая циклически сдвигает элементы
массива вправо на одну позицию, и печатает результат.
 */
public class ex_1 {
    public static void main(String[] args) {
        int[] oldArray = new int[10];
        beforeTransposition(oldArray);
        System.out.println();
        int[] newArray = afterTransposition(oldArray);
        printArray(newArray);
    }
    private static void  beforeTransposition(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + " ");
        }
    }
     private static int[] afterTransposition(int[] array ){
        int[] tempArray = new int[array.length];
         for (int j = 0; j < array.length - 1; j++){
             tempArray[j + 1] = array[j];
         }
         tempArray[0] = array[array.length - 1];
         return tempArray;
    }
    private static void printArray(int[] array){
        for (int i : array)
            System.out.print(i + " ");
    }
}
