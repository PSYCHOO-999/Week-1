import java.util.Scanner;

public class lv2_problem7_StudentVoteChecker {

    // Method to check if the student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age (negative number)
        }
        return age >= 18; // If age is 18 or above, student can vote
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        lv2_problem7_StudentVoteChecker checker = new lv2_problem7_StudentVoteChecker();

        // Array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Loop through and take input for 10 students' ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            // Check if the student can vote
            if (checker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        input.close();
    }
}
