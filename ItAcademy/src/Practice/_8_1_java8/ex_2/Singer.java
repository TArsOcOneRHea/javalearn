package Practice._8_1_java8.ex_2;

/**
 * Created by user on 06.03.2019.
 */
public class Singer {
    final String name;
    final String homeTown;

    public String getName() {
        return name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public Singer(String name, String homeTown) {

        this.name = name;
        this.homeTown = homeTown;
    }
}
