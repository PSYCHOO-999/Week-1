import java.util.Scanner; // Import the Scanner class to take user input

public class lv1_problem3_multiplicationTable {
    // Define the main method (Note: the method should be named `main` for execution)
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt(); // Read the number entered by the user

        // Create an array to store the results of the multiplication table
        int[] results = new int[10]; // Array size is 10 to store results from 1 to 10

        // Loop to calculate the multiplication table
        for (int i = 0; i < results.length; i++) {
            results[i] = number * (i + 1); // Store the result of multiplication in the array
        }

        // Loop to display the multiplication table
        for (int i = 0; i < results.length; i++) {
            // Print the multiplication table in a readable format
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }

        // Close the Scanner to release system resources
        input.close();
    }
}
