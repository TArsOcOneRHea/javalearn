package Practice._5_exceptions;

/**
 * Created by user on 13.02.2019.
 */
public class ex_1 {
    public static void main(String[] args) throws Exception {
        String s = null;
        nullMethod(null);
    }

    public static void nullMethod(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
    }
}
