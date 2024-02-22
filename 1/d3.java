import java.util.Scanner;

public class d3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a distance in meters: ");
        double m = scanner.nextDouble();

        double ft = m * 3.28084;

        System.out.println(m + " meters is equal to " + ft + " feet.");
    }
}
/*
o/p
Enter a distance in meters: 69
69.0 meters is equal to 226.37796 feet.
*/