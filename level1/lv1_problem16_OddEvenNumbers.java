import java.util.Scanner;

public class lv1_problem16_OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "even" : "odd"));
        }

        scanner.close();
    }
}
