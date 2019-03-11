package Practice._8_patterns;

import java.util.List;

/**
 * Created by user on 11.03.2019.
 */
public class User {
    private final String name;
    private final Integer age;
    private final List<User> relatives;

    private User(String name, Integer age, List<User> relatives) {
        this.name = name;
        this.age = age;
        this.relatives = relatives;
    }

    public static Builder builder(){
        return new Builder();

    }

    public static class Builder{
        private String name;
        private Integer age;
        private List<User> relatives;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(Integer age){
            this.age = age;
            return this;
        }

        public Builder relatives(List<User> relatives){
            this.relatives = relatives;
            return this;
        }

        public User build(){
            return new User(this.name, this.age, this.relatives);
        }

    }

}

