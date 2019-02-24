package advancedJava._12_Volatile;

public class MyThread extends  Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutDown(){
        this.running = false;
    }
}
