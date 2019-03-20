package advancedJava._15_ThreadPool;

public class Worker implements Runnable {
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("work " + id + " was completed.");
    }
}
