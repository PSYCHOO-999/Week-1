import java.util.Scanner;

public class lv2_problem3_GradeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter marks for each subject
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        // Calculate total and average marks
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

        // Display average marks
        System.out.println("Average Marks: ", percentage);

        // Determine and display grade and remarks based on percentage
        if (percentage >= 80) {
            System.out.println("Grade: A\nRemarks: Level 4, above agency-normalized standards");
        } else if (percentage >= 70) {
            System.out.println("Grade: B\nRemarks: Level 3, at agency-normalized standards");
        } else if (percentage >= 60) {
            System.out.println("Grade: C\nRemarks: Level 2, below, but approaching agency-normalized standards");
        } else if (percentage >= 50) {
            System.out.println("Grade: D\nRemarks: Level 1, well below agency-normalized standards");
        } else if (percentage >= 40) {
            System.out.println("Grade: E\nRemarks: Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Grade: R\nRemarks: Remedial standards");
        }

        // Close the Scanner resource
        input.close();
    }
}
