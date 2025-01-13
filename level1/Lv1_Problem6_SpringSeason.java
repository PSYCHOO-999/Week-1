import java.util.Scanner;

public class Lv1_Problem6_SpringSeason {

    // Static method to check if it's Spring season
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) { // March 20 and after
            return true;
        } else if (month > 3 && month < 6) { // April and May
            return true;
        } else if (month == 6 && day <= 20) { // Up to June 20
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Validate month and day input
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date. Please enter a valid month (1-12) and day (1-31).");
        } else {
            // Check if it's spring season
            boolean isSpring = isSpringSeason(month, day);

            // Display the result
            if (isSpring) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }

        // Close the Scanner
        input.close();
    }
}
