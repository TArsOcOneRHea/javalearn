package advancedJava._11_Flow;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("Hello world");
        Thread.sleep(9000);
    }
}
