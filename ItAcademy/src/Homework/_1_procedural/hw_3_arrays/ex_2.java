package Homework._1_procedural.hw_3_arrays;

public class ex_2 {
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
        int z = 0;
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] != array[i+1]){
                array[z++] = array[i];
            }
        }
        array[z++] = array[array.length - 1];
        return tempArray;
    }
    private static void printArray(int[] array){
        for (int i : array)
            System.out.print(i + " ");
    }
}
