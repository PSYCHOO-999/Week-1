import java.util.Scanner;

public class lv2_problem9_GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;

        // Find the greatest factor
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Output the greatest factor
        System.out.println("Greatest factor (besides itself): " + greatestFactor);

        // Close the Scanner resource
        scanner.close();
    }
}
