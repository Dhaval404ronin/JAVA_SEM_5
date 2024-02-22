import java.util.PriorityQueue;

public class MYPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {
    @Override
    public MYPriorityQueue<E> clone() {
        MYPriorityQueue<E> clonedQueue = new MYPriorityQueue<>();
        clonedQueue.addAll(this);
        return clonedQueue;
    }

    public static void main(String[] args) {
        MYPriorityQueue<Integer> originalQueue = new MYPriorityQueue<>();
        originalQueue.add(10);
        originalQueue.add(5);
        originalQueue.add(20);

        MYPriorityQueue<Integer> clonedQueue = originalQueue.clone();

        System.out.println("Original Queue: " + originalQueue);
        System.out.println("Cloned Queue: " + clonedQueue);
    }
}
/*
o/p
Original Queue: [5, 10, 20]
Cloned Queue: [5, 10, 20] 
*/