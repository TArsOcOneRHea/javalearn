package advancedJava._8_Comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Set<Person> personSet = new TreeSet<>();

        addElements(personList);
        addElements(personSet);

        System.out.println(personList);
        System.out.println(personSet);

    }
    private static void addElements(Collection collection){
        collection.add(new Person(5, "Bob"));
        collection.add(new Person(6, "Frank"));
        collection.add(new Person(2, "Vera"));
        collection.add(new Person(4, "Poll"));
        collection.add(new Person(3, "Billy"));
    }
}
