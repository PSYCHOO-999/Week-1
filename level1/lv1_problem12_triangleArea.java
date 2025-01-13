import java.util.Scanner;

public class lv1_problem12_triangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        // Calculate area
        double areaCm2 = 0.5 * base * height;

        // Convert area to square inches
        double areaInches2 = areaCm2 / 6.4516;

        // Display output
        System.out.println("The area of the triangle is " + areaCm2 + " square cm and " + areaInches2 + " square inches.");

        input.close();
    }
}
