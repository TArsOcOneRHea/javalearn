package Practice._8_patterns.ex_2.ex_2_1;

/**
 * Created by user on 13.03.2019.
 */
public class Animal {
    private String name;
    private User owner;

    public Animal(String name, User owner) {
        this.name = name;
        this.owner = owner;
    }

    public void startBarking() {
        System.out.println("Bark-Bark!!!");
    }

    public void startLayDown() {
        System.out.println("Start lay down");
    }

    public void startSitDown() {
        System.out.println("Start sit down");
    }


}
