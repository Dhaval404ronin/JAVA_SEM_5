public class d3 implements Runnable {
    private static Integer sum = 0;

    @Override
    public synchronized void run() {
        sum += 1;
        System.out.println(Thread.currentThread().getName() + " - Sum: " + sum);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new d3());
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final Sum: " + sum);
    }
}
/* o/p
Thread-0 - Sum: 1
Thread-1 - Sum: 2
Thread-9 - Sum: 10
Thread-7 - Sum: 8
Thread-2 - Sum: 3
Thread-6 - Sum: 7
Thread-4 - Sum: 5
Thread-3 - Sum: 4
Thread-8 - Sum: 9
Thread-5 - Sum: 6
Final Sum: 10*/