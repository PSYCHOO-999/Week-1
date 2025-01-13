import java.util.Scanner;

public class lv2_problem6_UnitConverter {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitToCelsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;
        return celsiusToFahrenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsToKilograms = 0.453592;
        return pounds * poundsToKilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsToPounds = 2.20462;
        return kilograms * kilogramsToPounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToLiters = 3.78541;
        return gallons * gallonsToLiters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersToGallons = 0.264172;
        return liters * litersToGallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for conversion
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = input.nextDouble();
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        System.out.println("Enter temperature in Celsius:");
        double celsius = input.nextDouble();
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));

        System.out.println("Enter weight in kilograms:");
        double kilograms = input.nextDouble();
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));

        System.out.println("Enter volume in gallons:");
        double gallons = input.nextDouble();
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));

        System.out.println("Enter volume in liters:");
        double liters = input.nextDouble();
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));

        input.close();
    }
}
