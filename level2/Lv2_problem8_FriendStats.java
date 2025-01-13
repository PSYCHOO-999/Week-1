import java.util.Scanner;

public class Lv2_problem8_FriendStats {

    // Method to find the youngest friend
    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngest = "Amar";

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = (i == 1) ? "Akbar" : "Anthony";
            }
        }
        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallest(int[] heights) {
        int maxHeight = heights[0];
        String tallest = "Amar";

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = (i == 1) ? "Akbar" : "Anthony";
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the ages and heights of Amar, Akbar, and Anthony
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Take user input for the ages and heights of the three friends
        System.out.print("Enter Amar's age: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter Amar's height: ");
        heights[0] = scanner.nextInt();

        System.out.print("Enter Akbar's age: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter Akbar's height: ");
        heights[1] = scanner.nextInt();

        System.out.print("Enter Anthony's age: ");
        ages[2] = scanner.nextInt();
        System.out.print("Enter Anthony's height: ");
        heights[2] = scanner.nextInt();

        // Find and display the youngest and tallest friends
        System.out.println("The youngest friend is: " + findYoungest(ages));
        System.out.println("The tallest friend is: " + findTallest(heights));

        scanner.close();
    }
}
