import java.util.Scanner;

public class lv1_problem14_FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Not a positive integer.");
            scanner.close();
            return;
        }

        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is " + factorial);

        scanner.close();
    }
}
