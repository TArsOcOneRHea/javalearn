package advancedJava._3_HashMap;

import java.util.HashMap;
import java.util.Map;
/*
Урок 3. Связный список (LinkedList) - Введение
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println(map);

        map.put(3, "Another value");

        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.get(20)); //null

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
