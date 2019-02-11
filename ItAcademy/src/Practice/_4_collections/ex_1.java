package Practice._4_collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.02.2019.
 */
public class ex_1 {
    public static void main(String[] args) {

        int size = 10;
        List<Integer> assesment = new ArrayList<>();
        for (int i = 1; i <= size; i++){
            int mark = (int) (Math.random() * 10 + i);
            assesment.add(mark);
        }
        for (int i = 0; i < assesment.size(); i++){
            if (assesment.get(i) < 3){
                assesment.remove(i);
            }
        }
        System.out.println(assesment.toString());


    }
}
