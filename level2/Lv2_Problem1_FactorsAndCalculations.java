import java.util.Scanner;

public class Lv2_Problem1_FactorsAndCalculations {

    // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        // Finding count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initializing the array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Storing factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the square of the factors
    public static double sumOfSquaresFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Finding the factors of the number
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        // Calculating and displaying the sum of the factors
        int sum = sumFactors(factors);
        System.out.println("\nSum of factors: " + sum);

        // Calculating and displaying the product of the factors
        int product = productFactors(factors);
        System.out.println("Product of factors: " + product);

        // Calculating and displaying the sum of squares of the factors
        double sumOfSquares = sumOfSquaresFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);

        // Closing the scanner
        input.close();
    }
}
