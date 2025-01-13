import java.util.Scanner;

public class lv2_problem3_doubleOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input three double values
        System.out.print("Enter the first double (a): ");
        double a = input.nextDouble();
        System.out.print("Enter the second double (b): ");
        double b = input.nextDouble();
        System.out.print("Enter the third double (c): ");
        double c = input.nextDouble();

        // Perform operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display output
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " 
                           + result3 + ", and " + result4);

        input.close();
    }
}
