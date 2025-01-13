import java.util.Scanner;

public class Lv2_Problem3_LeapYear {

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        // Check if the year is greater than or equal to 1582 (Gregorian calendar)
        if (year >= 1582) {
            // A leap year is divisible by 4, but not divisible by 100, unless divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true; // Leap year
            } else {
                return false; // Not a leap year
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close();
    }
}
