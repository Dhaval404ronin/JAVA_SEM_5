import java.util.ArrayList;
import java.util.HashSet;

public class d2 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Create a HashSet to store unique elements
        HashSet<E> set = new HashSet<>(list);

        // Create a new ArrayList from the HashSet
        ArrayList<E> result = new ArrayList<>(set);

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(4);
        originalList.add(1);

        ArrayList<Integer> newList = removeDuplicates(originalList);
        System.out.println("Original List: " + originalList);
        System.out.println("New List (without duplicates): " + newList);
    }
}
/*
o/p
Original List: [1, 2, 3, 2, 4, 1]
New List (without duplicates): [1, 2, 3, 4]
 */