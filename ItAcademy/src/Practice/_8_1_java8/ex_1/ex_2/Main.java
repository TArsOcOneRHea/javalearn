package Practice._8_1_java8.ex_1.ex_2;

import java.util.stream.Stream;

/**
 * Created by user on 04.03.2019.
 */
public class Main {
    static int addApp(Stream<Integer> numbers){
        return numbers.reduce(0, (arg1, arg2) -> arg1 + arg2);
    };

    public static void main(String[] args) {
//        addApp()
    }
}
