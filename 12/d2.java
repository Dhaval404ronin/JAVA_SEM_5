public class d2 implements Runnable {
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
        Thread thread = new Thread(new d2());
        thread.start();
        try {
            thread.join(); // Wait for the thread to finish
            System.out.println("Thread has finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*
o/p
Thread is running
Thread is awake after sleeping
Thread has finished

*/