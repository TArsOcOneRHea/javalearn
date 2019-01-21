package Practice.ex_3_arrays;

public class ex_1 {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        sequence(array);
        System.out.println("");
        invert(array);
    }

    private static void sequence(int[] array) {
        for (int arg : array) {
            System.out.print(arg + " ");
        }
    }

    private static void invert(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
