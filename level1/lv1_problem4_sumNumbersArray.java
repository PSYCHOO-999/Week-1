import java.util.Scanner; // Import the Scanner class to take user input

public class lv1_problem4_sumNumbersArray {
    public static void main(String[] args) {
        // Declare an array to store up to 10 numbers
        double[] numbers = new double[10];

        // Initialize a variable to keep track of the total sum
        double total = 0.0;

        // Variable to track the index of the numbers array
        int index = 0;

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.println("Enter numbers (0 or negative to stop):");

        // Use a while loop to read numbers until the array is full or a stopping condition is met
        while (true) {
            // Stop the loop if the array is full
            if (index == 10) break;

            // Read the next number from the user
            double num = input.nextDouble();

            // Break the loop if the number is 0 or negative
            if (num <= 0) break;

            // Store the number in the array and increment the index
            numbers[index++] = num;
        }

        // Use a for loop to calculate the total sum of the entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i]; // Add the current number to the total
        }

        // Display the total sum of the entered numbers
        System.out.println("The sum of all numbers is: " + total);

        // Close the Scanner to release system resources
        input.close();
    }
}
