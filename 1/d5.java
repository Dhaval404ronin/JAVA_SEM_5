import java.util.Arrays;
import java.util.Scanner;

public class d5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int[] nums = {num1, num2, num3};
        Arrays.sort(nums);

        System.out.println("Integers in decreasing order: " + nums[2] + ", " + nums[1] + ", " + nums[0]);
    }
}
/*
o/p
Enter three integers: 915 666 69
Integers in decreasing order: 915, 666, 69
*/