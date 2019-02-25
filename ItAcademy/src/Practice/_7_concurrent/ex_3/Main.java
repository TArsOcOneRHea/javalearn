package Practice._7_concurrent.ex_3;

/**
 * Напишите программу, которая создает четыре нити, исполняющие одну и ту же функцию.
 * Эта функция должна распечатать последовательность текстовых строк, переданных как параметр.
 * Каждая из созданных нитей должна распечатать различные последовательности строк.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyRunnable("Thread text1"));
        Thread thread2 = new Thread(new MyRunnable("Thread text2"));
        Thread thread3 = new Thread(new MyRunnable("Thread text3"));
        Thread thread4 = new Thread(new MyRunnable("Thread text4"));
        MyThread(thread1, thread2, thread3, thread4);
    }

    private synchronized static void MyThread(Thread thread1, Thread thread2, Thread thread3, Thread thread4) throws InterruptedException {
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
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
