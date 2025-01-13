import java.util.Scanner;

public class Lv1_Problem11_WindChill {

    // Method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Wind Chill Formula
        double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
        return windChill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for temperature and wind speed
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        // Calculating the wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // Displaying the wind chill temperature
        System.out.println("The wind chill temperature is: " + windChill + "°F");

        // Close the scanner
        input.close();
    }
}
