package Practice._7_concurrent.ex_2_2;


/**
 * Created by user on 25.02.2019.
 */
public class AddString {
    private static final Object monitor = new Object();

    private String string;

    public AddString(String string) {
        this.string = string;
    }

    public void addToLstringLinkedList(){
        synchronized (monitor){
//            stringLinkedList.add();

        }
    }
}
