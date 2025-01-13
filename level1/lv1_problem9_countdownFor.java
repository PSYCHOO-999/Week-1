import java.util.Scanner;

public class lv1_problem9_countdownFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the countdown start number: ");
        int number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket launch!");
        scanner.close();
    }
}
