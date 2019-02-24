package advancedJava._1_ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            arrayList.add(i);
        }
        for (Integer x: arrayList){
            System.out.println(arrayList.get(x));
        }
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(90));

        System.out.println(arrayList.size());
        arrayList.remove(1);
        System.out.println(arrayList.toString());
    }
}
