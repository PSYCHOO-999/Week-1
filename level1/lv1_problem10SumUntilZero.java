import java.util.Scanner;

public class lv1_problem10SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;

        System.out.println("Enter numbers to sum (0 to stop):");
        while (true) {
            double value = scanner.nextDouble();
            if (value == 0) break;
            total += value;
        }
        System.out.println("Total sum: " + total);

        scanner.close();
    }
}
