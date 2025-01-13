import java.util.Scanner;

public class lv2_problem12_weightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        // Convert to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        // Display output
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kg is " + weightInKilograms);

        input.close();
    }
}
