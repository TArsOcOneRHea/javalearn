package advancedJava._2_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        measureTime(integerList);
        measureTime(arrayList);

    }
    private static void measureTime(List<Integer> list){
        for (int i = 0; i < 100000; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
