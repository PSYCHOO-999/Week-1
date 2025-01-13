import java.util.*;

public class lv1_problem9_copy2Dto1DArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of rows in the matrix
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Prompt user to enter the number of columns in the matrix
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Create a 2D array (matrix) with the specified number of rows and columns
        int[][] matrix = new int[rows][cols];

        // Prompt user to enter the elements of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) { // Iterate through each row
            for (int j = 0; j < cols; j++) { // Iterate through each column
                matrix[i][j] = input.nextInt(); // Assign input values to matrix
            }
        }

        // Create a 1D array to store the matrix elements
        int[] array = new int[rows * cols];
        int index = 0;

        // Copy elements from the 2D matrix into the 1D array
        for (int i = 0; i < rows; i++) { // Iterate through each row
            for (int j = 0; j < cols; j++) { // Iterate through each column
                array[index++] = matrix[i][j]; // Add matrix element to 1D array
            }
        }

        // Print the 1D array
        System.out.println("1D Array: " + Arrays.toString(array));

        // Close the Scanner to prevent resource leaks
        input.close();
    }
}
