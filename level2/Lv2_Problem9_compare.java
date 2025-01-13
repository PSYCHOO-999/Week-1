import java.util.Scanner;

public class Lv2_Problem9_compare {

    // Method to check whether the number is positive or negative
    public static String isPositive(int number) {
        if (number < 0) {
            return "Negative";
        } else {
            return "Positive";
        }
    }

    // Method to check whether the number is even or odd
    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 < number2) {
            return -1; // number1 is smaller
        } else {
            return 0; // both are equal
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the 5 numbers
        int[] numbers = new int[5];

        // Take user input for the 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check each number for positive/negative and even/odd
        for (int i = 0; i < 5; i++) {
            String positivity = isPositive(numbers[i]);
            if (positivity.equals("Negative")) {
                System.out.println("Number " + numbers[i] + " is Negative");
            } else {
                String evenOrOdd = isEven(numbers[i]);
                System.out.println("Number " + numbers[i] + " is Positive and " + evenOrOdd);
            }
        }

        // Compare the first and last elements of the array
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == -1) {
            System.out.println("First number is less than the last number.");
        } else {
            System.out.println("First number is equal to the last number.");
        }

        scanner.close();
    }
}
