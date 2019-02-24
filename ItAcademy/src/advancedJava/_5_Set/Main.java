package advancedJava._5_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Kate");
        hashSet.add("Mike");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Tom");
        hashSet.add("Tom");

        for (String name: hashSet){
            System.out.println(name);
        }
        System.out.println(hashSet);
        System.out.println("__________________________");
        linkedHashSet.add("Kate");
        linkedHashSet.add("Mike");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for (String name: linkedHashSet){
            System.out.println(name);
        }
        System.out.println("__________________________");

        treeSet.add("Kate");
        treeSet.add("Mike");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String name: treeSet){
            System.out.println(name);
        }

        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));

        System.out.println(hashSet.isEmpty());

    }
}
