package Practice._8_patterns.ex_2;

/**
 * Created by user on 13.03.2019.
 */
public class Bark implements AnimalAction {

    @Override
    public void execute(Animal animal) {
        animal.startBarking();
    }
}
