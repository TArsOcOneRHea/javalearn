package Practice._5_exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.
 */
public class ex_2 {
    public static void main(String[] args) throws Exception {
        try {
            List<String> array = new ArrayList<>();
            array.add("1");
            array.add("2");
            array.get(999);

        } catch (IndexOutOfBoundsException E) {
            System.err.println("ArrayIndexOutOfBoundsException");
        }
    }
}
