package Practice._5_exceptions.ex_3;

import java.util.function.Supplier;

/**
 * Created by user on 13.02.2019.
 */
public class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}

