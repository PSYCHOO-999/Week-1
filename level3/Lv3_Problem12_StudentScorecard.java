import java.util.Random;

public class Lv3_Problem12_StudentScorecard {

    // Method to generate random 2-digit marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int numberOfStudents) {
        Random random = new Random();
        int[][] marks = new int[numberOfStudents][3];

        // Randomly generate marks for Physics, Chemistry, and Maths for each student
        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = random.nextInt(100);  // Physics marks (0-99)
            marks[i][1] = random.nextInt(100);  // Chemistry marks (0-99)
            marks[i][2] = random.nextInt(100);  // Maths marks (0-99)
        }

        return marks;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][4];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];  // Total marks
            double average = total / 3.0;  // Average marks
            double percentage = (total / 300.0) * 100;  // Percentage

            // Round off values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;

            // Grade determination
            if (percentage >= 80) {
                results[i][3] = 1;  // Grade A
            } else if (percentage >= 70) {
                results[i][3] = 2;  // Grade B
            } else if (percentage >= 60) {
                results[i][3] = 3;  // Grade C
            } else if (percentage >= 50) {
                results[i][3] = 4;  // Grade D
            } else if (percentage >= 40) {
                results[i][3] = 5;  // Grade E
            } else {
                results[i][3] = 6;  // Grade R (Remedial)
            }
        }

        return results;
    }

    // Method to display the scorecard with marks, total, average, percentage, and grades
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade\tRemarks");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            String grade = "";
            String remarks = "";

            // Determine the grade and remarks
            switch ((int) results[i][3]) {
                case 1:
                    grade = "A";
                    remarks = "Above agency-normalized standards";
                    break;
                case 2:
                    grade = "B";
                    remarks = "At agency-normalized standards";
                    break;
                case 3:
                    grade = "C";
                    remarks = "Below, but approaching agency-normalized standards";
                    break;
                case 4:
                    grade = "D";
                    remarks = "Well below agency-normalized standards";
                    break;
                case 5:
                    grade = "E";
                    remarks = "Too below agency-normalized standards";
                    break;
                case 6:
                    grade = "R";
                    remarks = "Remedial standards";
                    break;
            }

            // Display the student's data in tabular format
            System.out.printf("%12d\t%d\t\t%d\t\t%d\t%.2f\t%.2f\t%.2f\t%s\t%s\n", 
                              i + 1, marks[i][0], marks[i][1], marks[i][2], 
                              results[i][0], results[i][1], results[i][2], grade, remarks);
        }
    }

    public static void main(String[] args) {
        // Take input for the number of students
        int numberOfStudents = 5;  // For example, 5 students (this can be changed)

        // Generate random marks for the students
        int[][] marks = generateMarks(numberOfStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(marks);

        // Display the scorecard
        displayScorecard(marks, results);
    }
}
