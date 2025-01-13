import java.util.Scanner;

public class Lv02_Program09_Percentage2D {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.println("Enter the number of students");

        // Read the number of students
        int number = input.nextInt();

        // Check if the number of students is positive
        if (number <= 0) {
            System.out.println("Enter a valid number");
            return; // Exit if the input is not valid
        }

        // Define arrays to store student data: marks for each subject, percentage, and grade
        double personData[][] = new double[number][3]; // 2D array: {Physics, Chemistry, Math}
        double percentage[] = new double[number]; // Store the percentage of each student
        char grade[] = new char[number]; // Store the grade of each student

        // Take marks for each student as input
        for (int i = 1; i <= personData.length; i++) {
            // Prompt for Physics marks and store them
            System.out.print("Enter the marks of student in Physics: ");
            personData[i - 1][0] = input.nextDouble();

            // Prompt for Chemistry marks and store them
            System.out.print("Enter the marks of student in Chemistry: ");
            personData[i - 1][1] = input.nextDouble();

            // Prompt for Math marks and store them
            System.out.print("Enter the marks of student in Maths: ");
            personData[i - 1][2] = input.nextDouble();

            // Check if any marks entered are negative (invalid)
            if (personData[i - 1][0] < 0 || personData[i - 1][1] < 0 || personData[i - 1][2] < 0) {
                System.out.println("Enter valid marks");

                // If any marks are invalid, prompt again for the same student
                if (i > 1) {
                    i--; // Decrease i to redo the input for the current student
                } else {
                    i = 0; // Reset i to 0 to repeat the first student input
                }
            }
        }

        // Calculate percentage and assign grades for each student
        for (int i = 0; i < number; i++) {
            // Calculate the percentage for the student
            double percen = ((personData[i][0] + personData[i][1] + personData[i][2]) / 3) * 100;
            percentage[i] = percen;

            // Assign grades based on percentage
            if (percen >= 80) {
                grade[i] = 'A';
            } else if (percen >= 70 && percen <= 79) {
                grade[i] = 'B';
            } else if (percen >= 60 && percen <= 69) {
                grade[i] = 'C';
            } else if (percen >= 50 && percen <= 59) {
                grade[i] = 'D';
            } else if (percen >= 40 && percen <= 49) {
                grade[i] = 'E';
            } else {
                grade[i] = 'F'; // Failed if percentage is less than 40
            }
        }

        // Display the results for each student: total marks, percentage, and grade
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + " Total Marks: " + (personData[i][0] + personData[i][1] + personData[i][2]) +
                    ", Percentage: " + percentage[i] + "%, Grade: " + grade[i]);
        }

        // Close the Scanner to prevent resource leaks
        input.close();
    }
}
