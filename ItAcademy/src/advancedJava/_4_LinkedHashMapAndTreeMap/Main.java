package advancedJava._4_LinkedHashMapAndTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //внутри нет порядка
        Map<Integer, String> hashMap = new HashMap<>();
        //в каком порядке добавили в таком и выведет
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        //сортировка производится по ключе
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        System.out.println("_______________________");
        testMap(linkedHashMap);
        System.out.println("_______________________");
        testMap(treeMap);

    }
    public static void testMap(Map<Integer, String> map){
        map.put(39, "Bob");
        map.put(32, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
