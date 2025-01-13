import java.util.Scanner;

public class Lv3_Problem10_CollinearPoints {

    // Method to check if points are collinear using slope formula
    public static boolean arePointsCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the slopes AB, BC, and AC
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // If slopes are equal, the points are collinear
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    // Method to check if points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area using the determinant formula
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // If area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for points A, B, and C
        System.out.print("Enter coordinates of point A (x1, y1): ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter coordinates of point B (x2, y2): ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("Enter coordinates of point C (x3, y3): ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Check if points are collinear using slope formula
        if (arePointsCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear based on slope formula.");
        } else {
            System.out.println("The points are not collinear based on slope formula.");
        }

        // Check if points are collinear using area formula
        if (arePointsCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear based on area formula.");
        } else {
            System.out.println("The points are not collinear based on area formula.");
        }

        // Close the scanner
        input.close();
    }
}
