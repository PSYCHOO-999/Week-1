import java.util.Scanner;

public class lv2_problem1_LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Validate the year and check if it's a leap year
        if (year >= 1582) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be >= 1582.");
        }

        // Close the scanner
        input.close();
    }
}
