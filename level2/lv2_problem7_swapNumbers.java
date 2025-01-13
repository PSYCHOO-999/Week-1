import java.util.Scanner;

public class lv2_problem7_swapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Swap numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Display output
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        input.close();
    }
}
