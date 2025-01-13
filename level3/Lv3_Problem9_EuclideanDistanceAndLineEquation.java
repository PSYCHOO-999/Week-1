import java.util.Scanner;

public class Lv3_Problem9_EuclideanDistanceAndLineEquation {

    // Method to calculate Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Calculate the distance using the formula
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    // Method to calculate the slope and y-intercept of the line
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        // Calculate the y-intercept (b)
        double b = y1 - m * x1;
        
        // Return the slope and y-intercept in an array
        return new double[] { m, b };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the points
        System.out.print("Enter the coordinates of the first point (x1, y1): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Enter the coordinates of the second point (x2, y2): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Call the method to calculate the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the two points: " + distance);

        // Call the method to calculate the line equation
        double[] equation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);

        // Close the scanner
        input.close();
    }
}
