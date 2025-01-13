import java.util.Scanner; // Import the Scanner class to take user input

public class lv1_problem2_checkNumberProperties {
    public static void main(String[] args) {
        // Declare an array to store 5 integers
        int[] numbers = new int[5];
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter 5 numbers
        System.out.println("Enter 5 numbers:");

        // Loop to take input for all 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt(); // Store each input in the array
        }

        // Loop to process each number in the array
        for (int num : numbers) {
            if (num > 0) {
                // If the number is positive, check if it is even or odd
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                // If the number is negative
                System.out.println(num + " is negative.");
            } else {
                // If the number is zero
                System.out.println(num + " is zero.");
            }
        }

        // Compare the first and last elements of the array
        if (numbers[0] == numbers[numbers.length - 1]) {
            // If the first and last elements are equal
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            // If the first element is greater than the last element
            System.out.println("The first element is greater than the last element.");
        } else {
            // If the first element is less than the last element
            System.out.println("The first element is less than the last element.");
        }

        // Close the Scanner to release system resources
        input.close();
    }
}
