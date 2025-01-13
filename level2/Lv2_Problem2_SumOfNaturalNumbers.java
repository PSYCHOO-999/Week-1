import java.util.Scanner;

public class Lv2_Problem2_SumOfNaturalNumbers {

    // Recursive method to find the sum of n natural numbers
    public static int sumOfNaturalNumbersRecursive(int n) {
        if (n == 1) {
            return 1; // Base case: the sum of the first natural number is 1
        }
        return n + sumOfNaturalNumbersRecursive(n - 1); // Recursive call
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumOfNaturalNumbersFormula(int n) {
        return (n * (n + 1)) / 2; // Formula for the sum of the first n natural numbers
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the input is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            input.close();
            return;
        }

        // Calculate the sum using both methods
        int recursiveSum = sumOfNaturalNumbersRecursive(n);
        int formulaSum = sumOfNaturalNumbersFormula(n);

        // Display the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and match.");
        } else {
            System.out.println("There is a mismatch between the two results.");
        }

        input.close();
    }
}
