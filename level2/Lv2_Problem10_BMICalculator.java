import java.util.Scanner;

public class Lv2_Problem10_BMICalculator {

    // Public static method to calculate BMI for each person
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0]; // weight in kg
            double height = data[i][1] / 100.0; // height in meters (convert cm to m)
            data[i][2] = weight / (height * height); // BMI = weight / (height^2)
        }
    }

    // Public static method to determine BMI status for each person
    public static void calculateStatus(double[][] data, String[] status) {
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] data = new double[10][3]; // Array to store weight, height, and BMI
        String[] status = new String[10]; // Array to store BMI status

        // Input weight and height for 10 people
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) and height (cm) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // weight
            data[i][1] = scanner.nextDouble(); // height
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Calculate BMI status for each person
        calculateStatus(data, status);

        // Display the results
        System.out.println("\nPerson No.\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s\n", 
                              i + 1, data[i][0], data[i][1], data[i][2], status[i]);
        }

        scanner.close();
    }
}
