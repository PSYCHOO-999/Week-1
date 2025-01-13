import java.util.Scanner;

// Class to calculate and display maximum handshakes
public class Lv1_Problem3_MaximumHandshakes {

    // Static method to calculate maximum handshakes
    public static int calculateMaxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Validate the input
        if (numberOfStudents <= 0) {
            System.out.println("Error: Number of students must be a positive integer.");
        } else {
            // Call the method to calculate maximum handshakes
            int maxHandshakes = calculateMaxHandshakes(numberOfStudents);

            // Display the result
            System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + maxHandshakes);
        }

        // Close the Scanner
        input.close();
    }
}
