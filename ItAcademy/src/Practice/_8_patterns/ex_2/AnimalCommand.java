package Practice._8_patterns.ex_2;

/**
 * Created by user on 11.03.2019.
 */
public class AnimalCommand {


    private String name;

    class AnimalManager{
        Animal animal;

        public void doAction(AnimalAction action){
            action.execute(animal);
        };
    }
}
interface AnimalAction{
    void execute(Animal animal);
}
