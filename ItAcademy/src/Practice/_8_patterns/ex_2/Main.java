package Practice._8_patterns.ex_2;

import java.util.Arrays;

/**
 * Created by user on 13.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Animal("Rex", null);
        Animal dog2 = new Animal("Bender", null);
        Animal dog3 = new Animal("Fry", null);
        AnimalManager animalManager = new AnimalManager(Arrays.asList(dog1, dog2, dog3));
        animalManager.forEach(new SitDown());
        animalManager.forEach(new Bark());
        animalManager.forEach(new LayDown());

    }
}
