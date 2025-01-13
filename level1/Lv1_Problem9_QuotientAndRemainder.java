import java.util.Scanner;

public class Lv1_Problem9_QuotientAndRemainder {

    // Static method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2]; // Array to store quotient and remainder
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        int number = input.nextInt();
        System.out.print("Enter the second number (divisor): ");
        int divisor = input.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
            input.close();
            return;
        }

        // Find the quotient and remainder using the method
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the quotient and remainder
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        // Close the Scanner
        input.close();
    }
}
