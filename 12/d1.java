public class d1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread is running");
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("Thread is awake after sleeping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        d1 thread = new d1();
        thread.start();
    }
}
/*
o/p
Thread is running
Thread is awake after sleeping
 */