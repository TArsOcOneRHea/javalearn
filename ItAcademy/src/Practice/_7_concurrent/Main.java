package Practice._7_concurrent;

import java.time.LocalTime;

/**
 * Напишите программу, которая создает Thread. Используйте атрибуты по умолчанию.
 * Родительская и вновь созданная нити должны распечатать по десять строк текста.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println("Main text");
        }
        MyRunnable runnable = new MyRunnable("Thread text");
        new Thread(runnable).start();
    }


    public static class MyRunnable implements Runnable{
        final String letter;

        MyRunnable(String letter) {
            this.letter = letter;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(letter);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
