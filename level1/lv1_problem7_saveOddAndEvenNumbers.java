import java.util.*; // Importing utility classes, including Scanner

// Class definition for saving and displaying odd and even numbers
public class lv1_problem7_saveOddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the range of numbers
        System.out.println("Enter the range: ");
        int number = input.nextInt(); // Read the range as input

        // Validate that the input is a natural number
        if (number < 0) {
            System.out.println("Please provide a value in Natural Numbers.");
            return; // Exit the program if the input is invalid
        }

        // Arrays to store even and odd numbers, with estimated sizes based on the range
        int evenNumbers[] = new int[(number / 2) + 1];
        int oddNumbers[] = new int[(number / 2) + 1];

        // Counters to keep track of the number of even and odd numbers added to the arrays
        int even = 0;
        int odd = 0;

        // Loop through all numbers from 1 to the given range
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) { 
                // If the number is even, add it to the evenNumbers array
                evenNumbers[even++] = i;
            } else {
                // If the number is odd, add it to the oddNumbers array
                oddNumbers[odd++] = i;
            }
        }

        // Print all even numbers stored in the evenNumbers array
        System.out.print("All Even Numbers: ");
        for (int i = 0; i < even; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println(); // Move to the next line for better output formatting

        // Print all odd numbers stored in the oddNumbers array
        System.out.print("All Odd Numbers: ");
        for (int i = 0; i < odd; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        input.close(); // Close the Scanner to release system resources
    }
}