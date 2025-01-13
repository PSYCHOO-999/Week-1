import java.util.Scanner;

public class Lv1_Problem12_TrigonometricFunctions {

    // Method to calculate trigonometric functions (sin, cos, tan) for a given angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculating sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Returning the results as an array
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Calculating the trigonometric functions
        double[] trigFunctions = calculateTrigonometricFunctions(angle);

        // Displaying the results
        System.out.println("For the angle " + angle + " degrees:");
        System.out.println("Sine: " + trigFunctions[0]);
        System.out.println("Cosine: " + trigFunctions[1]);
        System.out.println("Tangent: " + trigFunctions[2]);

        // Close the scanner
        input.close();
    }
}
