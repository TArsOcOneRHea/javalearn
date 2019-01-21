package Practice.ex_3_arrays;

public class ex_2 {
    public static void main(String[] args) {
        int[] array = new int[100];
    }

    static void proverka(int[] array) {
        int i = 0;
        int number = 1;
        while (i != array.length) {
            if ((number % 13 == 0) || (number % 17 == 0)) {
                array[i] = number;
            }
            number++;
        }


    }
}
