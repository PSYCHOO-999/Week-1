import java.util.Scanner;

// Class to compute Simple Interest
public class lv1_Problem1_SimpleInterestCalculator {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for principal, rate, and time
        System.out.print("Enter Principal Amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double interestRate = input.nextDouble();

        System.out.print("Enter Time Period (in years): ");
        double timePeriod = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = calculateSimpleInterest(principalAmount, interestRate, timePeriod);

        // Display the result
        System.out.println("\nThe Simple Interest is " + simpleInterest +
                " for Principal " + principalAmount +
                ", Rate of Interest " + interestRate + "%, and Time " + timePeriod + " years.");

        // Close the scanner object
        input.close();
    }
}
