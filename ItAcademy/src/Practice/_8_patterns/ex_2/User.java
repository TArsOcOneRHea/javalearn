package Practice._8_patterns.ex_2;

import java.util.List;

/**
 * Created by user on 13.03.2019.
 */
public class User {
    private int id;
    private String name;

    public List<User> getRelatives() {
        return relatives;
    }

    private List<User> relatives;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
