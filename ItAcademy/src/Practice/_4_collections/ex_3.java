//package Practice._4_collections;
//
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by user on 11.02.2019.
// */
//public class ex_3 {
//    public static void main(String[] args) {
//        HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();
//        myHashMap.put(1, 6);
//        myHashMap.put(2, 5);
//        myHashMap.put(3, 4);
//        myHashMap.put(4, 3);
//        myHashMap.put(5, 2);
//        myHashMap.put(6, 1);
//
//        System.out.println();
//    }
//    private static int countAloneElements(List<Integer> elements){
//        HashMap<Integer, Integer> numToCount = new HashMap<>();
//        for (Integer number : elements){
//            Integer val = numToCount.get(number);
//            if (val == null){
//                numToCount.put(number, 1);
//            } else {
//                numToCount.put(number, val + 1);
//            }
//            int unique = 0;
//            for (Integer value : numToCount.values()){
//
//            }
//        }
//}
