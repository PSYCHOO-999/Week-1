import java.util.Scanner;

public class Lv1_Problem4_TriangularPark {

    // Static method to calculate the perimeter of the triangle
    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    // Static method to calculate the number of rounds
    public static int calculateRounds(double perimeter, double totalDistance) {
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the sides of the triangular park
        System.out.print("Enter the length of the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the length of the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the length of the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();

        // Validate the input to ensure it forms a triangle
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || 
            (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            System.out.println("Error: Invalid triangle sides. Please enter positive values that form a valid triangle.");
        } else {
            // Calculate the perimeter of the triangle
            double perimeter = calculatePerimeter(side1, side2, side3);
            System.out.printf("The perimeter of the triangle is: %.2f meters\n", perimeter);

            // Define the total distance for the run (5 km = 5000 meters)
            double totalDistance = 5000.0;

            // Calculate the number of rounds needed
            int rounds = calculateRounds(perimeter, totalDistance);

            // Display the result
            System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        }

        // Close the Scanner
        input.close();
    }
}
