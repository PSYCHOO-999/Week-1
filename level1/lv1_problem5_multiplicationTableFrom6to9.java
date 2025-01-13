import java.util.*; // Import all utility classes, including Scanner

// Class definition for the program
public class lv1_problem5_multiplicationTableFrom6to9 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number (though not used in the logic)
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Outer loop to iterate through numbers 6 to 9 (inclusive)
        for (int i = 6; i <= 9; i++) {
            // Print the header for the current multiplication table
            System.out.println("Multiplication Table for " + i + ":");

            // Inner loop to calculate and print the multiplication table for the current number
            for (int j = 1; j <= 10; j++) {
                // Print the multiplication result for the current row
                System.out.println(i + " * " + j + " = " + (i * j));
            }

            // Print an empty line to separate tables for better readability
            System.out.println();
        }

        // Close the Scanner to release system resources
        input.close();
    }
}
