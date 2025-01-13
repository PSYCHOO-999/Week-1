import java.util.Scanner;

public class Lv1_Problem7_SumOfNaturalNumbers {

    // Static method to calculate the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();

        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of n natural numbers
            int sum = calculateSum(n);

            // Display the result
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }

        // Close the Scanner
        input.close();
    }
}
