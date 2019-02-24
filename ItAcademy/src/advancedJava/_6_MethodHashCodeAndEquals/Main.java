package advancedJava._6_MethodHashCodeAndEquals;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "One");
        map.put(1, "Two");

        set.add(1);
        set.add(1);

        System.out.println(map);
        System.out.println(set);
        System.out.println("________________________________");

        Map<Person, String> map3 = new HashMap<>();
        Set<Person> set3 = new HashSet<>();

        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");
        Person person3 = new Person(3, "Daniel");

        map3.put(person1, "123");
        map3.put(person2, "123");
        map3.put(person3, "123");

        set3.add(person1);
        set3.add(person2);
        set3.add(person3);

        System.out.println(map3);
        System.out.println(set3);

    }
}
class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

