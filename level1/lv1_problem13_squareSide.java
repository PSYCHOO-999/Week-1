import java.util.Scanner;

public class lv1_problem13_squareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Display output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}
