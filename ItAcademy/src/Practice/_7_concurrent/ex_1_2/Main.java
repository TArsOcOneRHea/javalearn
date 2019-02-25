package Practice._7_concurrent.ex_1_2;

/**
 * Модифицируйте программу ex_1.1 так, чтобы вывод родительской и дочерней нитей был синхронизован:
 * сначала родительская нить выводила первую строку, затем дочерняя, затем родительская вторую строку и т.д.
 * Используйте мьютексы. Запрещается использовать явные (yield()) и неявные (sleep() и т.д.) передачи
 * управления между нитями и ожидание в цикле.
 */
public class Main {

    private static final Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnable = new MyRunnable("Thread text");
        MyRunnable runnable2 = new MyRunnable("Thread text 2");

        new Thread(runnable).start();
        new Thread(runnable2).start();
    }

    private static void print(String message) {
        synchronized (monitor) {
            System.err.println(message);
            try {
                monitor.notify();
                monitor.wait();
                monitor.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MyRunnable implements Runnable {

        final String letter;

        MyRunnable(String letter) {
            this.letter = letter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20; i++) {
                print(letter);
            }
        }
    }
}

