package Practice._1_procedural.ex_3_arrays;
/*
Напишите программу, заносящую в массив первые 100 натуральных чисел,
делящихся на 13 или на 17, и печатающую его.
 */
public class ex_2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        proverka(array);
    }

    private static void proverka(int[] array) {
        int i = 0;
        int number = 1;
        while (i != array.length) {
            if ((number % 13 == 0) || (number % 17 == 0)) {
                array[i] = number;
                i++;
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
