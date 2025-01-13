import java.util.*; // Importing utility classes, including Scanner

// Class definition for the program
public class lv1_problem6_meanHeight {

    // Method to calculate and display the mean height of 11 players
    public static void meanHeight(String[] args) {
        // Array to store the heights of 11 players
        double[] heights = new double[11];

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter heights
        System.out.println("Enter the heights of 11 players:");

        // Initialize a variable to calculate the sum of heights
        double sum = 0.0;

        // Loop to read the heights and compute their sum
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble(); // Read height for the current player
            sum += heights[i]; // Add the current height to the sum
        }

        // Calculate the mean height by dividing the sum by the number of players
        double mean = sum / heights.length;

        // Print the mean height of the football team
        System.out.println("The mean height of the football team is: " + mean);

        // Close the Scanner to release system resources
        input.close();
    }
}
