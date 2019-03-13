package Practice._8_patterns.ex_2;

import java.util.Arrays;

/**
 * Created by user on 13.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Daniel");
        User user2 = new User(2, "Chack");
        User user3 = new User(3, "Tom");
        Animal dog1 = new Animal("Rex", user1);
        Animal dog2 = new Animal("Bender", user2);
        Animal dog3 = new Animal("Fry", user3);
        AnimalManager animalManager = new AnimalManager(Arrays.asList(dog1, dog2, dog3));
        animalManager.forEach(new SitDown());
        animalManager.forEach(new Bark());
        animalManager.forEach(new LayDown());

    }
}
