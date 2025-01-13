import java.util.Scanner;

public class lv2_problem4_UnitConverter {

    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmToMiles = 0.621371;
        return km * kmToMiles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;
        return meters * metersToFeet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for conversion
        System.out.println("Enter distance in kilometers:");
        double km = input.nextDouble();
        System.out.println("Kilometers to Miles: " + convertKmToMiles(km));

        System.out.println("Enter distance in miles:");
        double miles = input.nextDouble();
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));

        System.out.println("Enter distance in meters:");
        double meters = input.nextDouble();
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));

        System.out.println("Enter distance in feet:");
        double feet = input.nextDouble();
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));

        input.close();
    }
}
