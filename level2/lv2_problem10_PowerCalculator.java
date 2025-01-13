import java.util.Scanner;

public class lv2_problem10_PowerCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
        // Input base number and power
        System.out.print("Enter base number: ");
        int number = input.nextInt();

        System.out.print("Enter power: ");
        int power = input.nextInt();

        int result = 1;

        // Calculate power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Output the result
        System.out.println("Result: " + result);

        // Close the input resource
        input.close();
    }
}
