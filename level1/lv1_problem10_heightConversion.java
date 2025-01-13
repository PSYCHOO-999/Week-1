import java.util.Scanner;

public class lv1_problem10_heightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion factors
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display output
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + " and inches is " + inches);

        input.close();
    }
}
