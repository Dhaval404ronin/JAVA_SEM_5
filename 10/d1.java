import java.util.Scanner;

public class d1 {
    public static int findSmallest(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        
        int current = arr[index];
        int smallest = findSmallest(arr, index + 1);
        
        return Math.min(current, smallest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int smallest = findSmallest(arr, 0);
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
/*
o/p
Enter the size of the array: 4
Enter the elements of the array:
8 77 1 36
The smallest element in the array is: 1
 */