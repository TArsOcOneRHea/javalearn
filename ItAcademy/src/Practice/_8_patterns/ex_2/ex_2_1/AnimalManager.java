package Practice._8_patterns.ex_2.ex_2_1;

import java.util.List;

/**
 * Created by user on 13.03.2019.
 */
public class AnimalManager {
    private final List<Animal> animals;

    public AnimalManager(List<Animal> animals) {
        this.animals = animals;
    }

    public void forEach(AnimalAction action) {
        for (Animal animal : animals) {
            action.execute(animal);

        }
    }
}
