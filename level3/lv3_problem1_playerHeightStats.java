import java.util.Random;
import java.util.Scanner;

public class lv3_problem1_playerHeightStats {

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter the number of players in the football team: ");
        int numPlayers = input.nextInt();

        // Initialize the heights array
        int[] heights = new int[numPlayers];

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < numPlayers; i++) {
            heights[i] = 150 + random.nextInt(101); // Random height between 150 and 250
        }

        // Display the heights
        System.out.println("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate statistics
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, numPlayers);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display the results
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");

        input.close();
    }
}
