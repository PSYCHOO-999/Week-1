import java.util.Scanner;

public class lv2_problem5_tempFtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Display output
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        input.close();
    }
}
