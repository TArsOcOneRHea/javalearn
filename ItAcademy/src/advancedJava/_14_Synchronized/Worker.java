package advancedJava._14_Synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
    Random random = new Random();

    Object lock1 = new Object();
    Object lock2 = new Object();


    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1(){
        synchronized (lock1){
            for (int i = 0; i < 1000; i++){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                list1.add(random.nextInt(100));

            }
        }
    }

    public void addToList2(){
        synchronized (list2){
            for (int i = 0; i < 1000; i++){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                list2.add(random.nextInt(100));
            }
        }
    }

    public void work(){
        addToList1();
        addToList2();
    }

    public void main(){
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();

        System.out.println("Program took " + (after - before));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.size());
        System.out.println(list2.size());

    }
}
