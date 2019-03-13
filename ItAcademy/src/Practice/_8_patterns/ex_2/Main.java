package Practice._8_patterns.ex_2;

import java.util.Arrays;

/**
 * Created by user on 13.03.2019.
 */
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Rex", null);
        AnimalManager animalManager = new AnimalManager(Arrays.asList(dog));
        animalManager.forEach(new SitDown());
        animalManager.forEach(new Bark());
        animalManager.forEach(new LayDown());

    }
}
