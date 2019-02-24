package advancedJava._7_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("snake");
        animals.add("hyppopotamus");

        Collections.sort(animals);
        System.out.println(animals);
        animals.sort(new StringLenthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);
        numbers.add(69);

        Collections.sort(numbers);
        System.out.println(numbers);
        numbers.sort(new BackwardsIntegerComparator());
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(4, "Daniel"));
        people.add(new Person(5, "Tom"));
        people.add(new Person(1, "Jack"));
        people.add(new Person(2, "John"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(people);
    }
}
