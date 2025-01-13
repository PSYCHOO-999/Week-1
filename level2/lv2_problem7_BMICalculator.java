import java.util.Scanner;

public class lv2_problem7_BMICalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input weight in kilograms
        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        // Input height in centimeters
        System.out.print("Enter height in cm: ");
        double heightCm = scanner.nextDouble();

        // Convert height from centimeters to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI: "+ bmi);

        // Determine and display weight status based on BMI
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        // Close the Scanner resource
        scanner.close();
    }
}
