import java.util.Scanner;

public class lv1_problem14_distanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        // Display output
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);

        input.close();
    }
}
