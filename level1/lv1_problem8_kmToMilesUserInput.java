import java.util.Scanner;

public class lv1_problem8_kmToMilesUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion factor
        double miles = km / 1.6;

        // Display output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");

        input.close();
    }
}
