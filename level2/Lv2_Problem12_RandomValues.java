import java.util.Random;

public class Lv2_Problem12_RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();

        // Generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + rand.nextInt(9000); // Random number between 1000 and 9999
        }

        return numbers;
    }

    // Method to find average, min and max values from an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = sum / numbers.length;

        // Return average, min, and max in an array
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nAverage: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
