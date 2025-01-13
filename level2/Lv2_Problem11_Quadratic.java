import java.util.Scanner;

public class Lv2_Problem11_Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate the discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is negative, return an empty array indicating no real roots
        if (delta < 0) {
            return new double[0]; // Empty array indicates no real roots
        }

        // If delta is zero, there is only one root
        if (delta == 0) {
            double root = -b / (2 * a);
            return new double[] { root }; // Single root
        }

        // If delta is positive, calculate the two roots
        double root1 = (-b + Math.sqrt(delta)) / (2 * a);
        double root2 = (-b - Math.sqrt(delta)) / (2 * a);

        return new double[] { root1, root2 }; // Two roots
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        // Call method to find the roots
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("There are no real roots for the given quadratic equation.");
        } else if (roots.length == 1) {
            System.out.println("The root of the equation is: " + roots[0]);
        } else {
            System.out.println("The roots of the equation are: " + roots[0] + " and " + roots[1]);
        }

        scanner.close();
    }
}
