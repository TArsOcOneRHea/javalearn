package Practice._7_concurrent.ex_3_1;

import Practice._7_concurrent.ex_2_2.AddString;

import java.util.Scanner;

/**
 * Created by user on 27.02.2019.
 */
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddString addString = new AddString();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(5000);
                        addString.sortNumbers();
                    } catch (InterruptedException e) {
                    }
                }
            }
        });

        thread.start();

        while (true){
            int i = scanner.nextInt();
            addString.addNumber(i);
        }
    }
}
