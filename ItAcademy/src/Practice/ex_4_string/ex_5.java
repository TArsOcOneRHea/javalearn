//package Practice.ex_4_string;
//
//public class ex_5 {
//    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] array2 = {7, 2, 3, 5, 4, 6, 1, 8};
//    }
//
//    private static void streamline1(int[] array1) {
//        for (int i = 0; i < array1.length - 1; i++) {
//            int min_idx = i;
//            for (int index = i + 1; index < array1.length; index++) {
//                if (array1[min_idx] > array1[index]) {
//                    min_idx = index;
//                }
//            }
//            int tmp = array1[i];
//            array1[i] = array1[min_idx];
//            array1[min_idx] = tmp;
//
//        }
//    }
//
//    private static void streamline2(int[] array2) {
//        for (int i = 0; i < array2.length - 1; i++) {
//            int min_idx = i;
//            for (int index = i + 1; index < array2.length; index++) {
//                if (array2[min_idx] > array2[index]) {
//                    min_idx = index;
//                }
//            }
//            int tmp = array2[i];
//            array2[i] = array2[min_idx];
//            array2[min_idx] = tmp;
//
//        }
//    }
//
//    private static boolean proverka(int[] array1, int[] array2) {
//
//
//    }
//
//
//}
//}
