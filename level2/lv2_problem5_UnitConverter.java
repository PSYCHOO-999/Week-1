import java.util.Scanner;

public class lv2_problem5_UnitConverter {

    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsToFeet = 3;
        return yards * yardsToFeet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToYards = 0.333333;
        return feet * feetToYards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToInches = 39.3701;
        return meters * metersToInches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesToMeters = 0.0254;
        return inches * inchesToMeters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesToCm = 2.54;
        return inches * inchesToCm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for conversion
        System.out.println("Enter distance in yards:");
        double yards = input.nextDouble();
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));

        System.out.println("Enter distance in feet:");
        double feet = input.nextDouble();
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));

        System.out.println("Enter distance in meters:");
        double meters = input.nextDouble();
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));

        System.out.println("Enter distance in inches:");
        double inches = input.nextDouble();
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));

        input.close();
    }
}
