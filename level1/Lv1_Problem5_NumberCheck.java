import java.util.Scanner;

public class Lv1_Problem5_NumberCheck {

    // Static method to check the number
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive number
        } else if (number < 0) {
            return -1; // Negative number
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number to check: ");
        int number = input.nextInt();

        // Call the checkNumber method and store the result
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner
        input.close();
    }
}
