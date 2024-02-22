import java.util.Scanner;

public class d4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double lbs = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        double kg = lbs * 0.45359237;
        double meters = inches * 0.0254;

        double bmi = kg / (meters * meters);

        System.out.println("BMI: " + bmi);
    }
}
/*
o/p
Enter weight in pounds: 215
Enter height in inches: 420
BMI: 0.8569158708753927
*/