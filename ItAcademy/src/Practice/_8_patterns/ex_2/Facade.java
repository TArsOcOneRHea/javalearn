package Practice._8_patterns.ex_2;

/**
 * Created by user on 13.03.2019.
 */
public class Facade {
    public void printRelativesByAnimal(User user, Animal animal) {
        for (User relative : user.getRelatives()) {
            if (relative.equals(animal.getOwner())) {
                System.out.println(relative);
            }
        }
    }


}
