import java.util.Scanner;

public class lv2_problem4_tempCtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display output
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");

        input.close();
    }
}
