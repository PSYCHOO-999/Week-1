import java.util.Random;

public class Lv3_Problem11_ZaraBonusCalculation {

    // Method to generate a random salary (5-digit) and years of service for each employee
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numberOfEmployees][2];

        // Randomly generate salary and years of service for each employee
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i][0] = random.nextInt(90000) + 10000;  // Salary between 10000 and 99999
            employeeData[i][1] = random.nextInt(20) + 1;          // Years of service between 1 and 20
        }

        return employeeData;
    }

    // Method to calculate the new salary and bonus based on the service years
    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        double[][] resultData = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus;

            // Determine the bonus based on the years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;  // 5% bonus for employees with more than 5 years of service
            } else {
                bonus = oldSalary * 0.02;  // 2% bonus for employees with less than or equal to 5 years of service
            }

            // Calculate the new salary (old salary + bonus)
            double newSalary = oldSalary + bonus;

            // Save the result (new salary and bonus) in the resultData array
            resultData[i][0] = oldSalary;      // Old Salary
            resultData[i][1] = newSalary;     // New Salary
            resultData[i][2] = bonus;         // Bonus
        }

        return resultData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplayTotals(double[][] resultData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Calculate totals
        for (int i = 0; i < resultData.length; i++) {
            totalOldSalary += resultData[i][0];
            totalNewSalary += resultData[i][1];
            totalBonus += resultData[i][2];
        }

        // Display the data in a tabular format
        System.out.println("Employee No. | Old Salary | New Salary | Bonus");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < resultData.length; i++) {
            System.out.printf("%12d | %10.2f | %10.2f | %10.2f\n", (i + 1), resultData[i][0], resultData[i][1], resultData[i][2]);
        }
        System.out.println("-----------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        // Number of employees (10 in this case)
        int numberOfEmployees = 10;

        // Generate random salary and years of service for each employee
        int[][] employeeData = generateEmployeeData(numberOfEmployees);

        // Calculate new salary and bonus for each employee
        double[][] resultData = calculateNewSalaryAndBonus(employeeData);

        // Calculate and display the totals (old salary, new salary, and bonus)
        calculateAndDisplayTotals(resultData);
    }
}
