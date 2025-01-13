import java.util.Scanner;

public class lv2_problem8_FriendsComparison {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Input age and height of three friends
        System.out.print("Enter age and height of Amar: ");
        int ageAmar = scanner.nextInt();
        double heightAmar = scanner.nextDouble();

        System.out.print("Enter age and height of Akbar: ");
        int ageAkbar = scanner.nextInt();
        double heightAkbar = scanner.nextDouble();

        System.out.print("Enter age and height of Anthony: ");
        int ageAnthony = scanner.nextInt();
        double heightAnthony = scanner.nextDouble();

        // Determine the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (youngestAge == ageAmar) {
            System.out.println("Youngest: Amar");
        } else if (youngestAge == ageAkbar) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        // Determine the tallest friend
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (tallestHeight == heightAmar) {
            System.out.println("Tallest: Amar");
        } else if (tallestHeight == heightAkbar) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }

        // Close the Scanner resource
        scanner.close();
    }
}
