package advancedJava._11_Flow;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Hello from Mythread" + i);
        }
    }
}
