import java.util.Scanner;

public class lv2_problem12_FindMultiples {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiples of " + number + " below 100:");

        // Loop backward from 100 to 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner resource
        input.close();
    }
}
