import java.util.Scanner;

class Lv1_Problem1_CompareStrings {

    public static boolean compareStringsCharAt(String str1, String str2) {
        // If lengths are not equal, strings are not equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt user for second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare strings using charAt() method
        boolean resultUsingCharAt = compareStringsCharAt(str1, str2);

        // Compare strings using equals() method
        boolean resultUsingEquals = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);

        // Verify if both methods return the same result
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Both methods produce the same result.");
        } else {
            System.out.println("The methods produce different results.");
        }

        // Close scanner
        scanner.close();
    }
}
