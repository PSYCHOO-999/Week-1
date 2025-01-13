import java.util.Scanner;

public class lv2_problem11_FactorsFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Display factors
        System.out.println("Factors:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the input resource
        input.close();
    }
}
