package Practice._7_concurrent.ex_2;

/**
 * Модифицируйте программу упр. 1 так, чтобы вывод родительской нити производился после завершения дочерней.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable runnable = new MyRunnable("Thread text");
        Thread thread1 = new Thread(runnable);
        thread1.start();
        thread1.join();
        MainThread();
    }

    private static void MainThread() throws InterruptedException {
        for (int i = 0; i < 10; i++){
            System.out.println("Test text");
            Thread.sleep(1000);
        }
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
