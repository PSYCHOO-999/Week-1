import java.util.*;

public class lv1_problem8_findFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxFactor = 10;
        int[] factor = new int[maxFactor];
        int index = 0;

        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Check if resizing is needed
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the array size
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factor, 0, temp, 0, index); // Use 'index' instead of 'maxFactor'
                    factor = temp; // Assign resized array back to factor
                }
                factor[index++] = i; // Store the factor
            }
        }

        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factor[i] + " ");
        }

        input.close();
    }
}
