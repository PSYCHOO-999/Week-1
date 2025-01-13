import java.util.Scanner;

public class Lv1_Problem10_ChocolatesDivision {

    // Static method to find the number of chocolates each child gets and remaining chocolates
    public static int[] findChocolatesDistribution(int numberOfChocolates, int numberOfChildren) {
        int[] result = new int[2]; // Array to store chocolates per child and remaining chocolates
        result[0] = numberOfChocolates / numberOfChildren; // Chocolates per child
        result[1] = numberOfChocolates % numberOfChildren; // Remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Check for zero children to avoid division by zero
        if (numberOfChildren == 0) {
            System.out.println("Error: Number of children cannot be zero.");
            input.close();
            return;
        }

        // Find the number of chocolates each child gets and the remaining chocolates
        int[] result = findChocolatesDistribution(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child will get: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        // Close the Scanner
        input.close();
    }
}
