import java.util.Scanner;

public class Lv1_Problem8_SmallestAndLargest {

    // Static method to find the smallest and largest of the three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2]; // Array to store smallest and largest
        result[0] = Math.min(number1, Math.min(number2, number3)); // Smallest number
        result[1] = Math.max(number1, Math.max(number2, number3)); // Largest number
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        // Find the smallest and largest using the method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the smallest and largest numbers
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);

        // Close the Scanner
        input.close();
    }
}
