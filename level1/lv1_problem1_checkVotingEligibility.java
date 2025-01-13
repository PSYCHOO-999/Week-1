import java.util.Scanner;

public class lv1_problem1_checkVotingEligibility {
    public static void main(String[] args) {
        // Declare an array to store the ages of 10 students
        int[] ages = new int[10];
        
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the ages of 10 students
        System.out.println("Enter the ages of 10 students:");

        // Loop to take input for all 10 students
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt(); // Store each age in the array
        }

        // Loop to process each age and check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                // If the age is negative, print an error message
                System.out.println("Invalid age");
            } else if (age >= 18) {
                // If the age is 18 or above, the student can vote
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                // If the age is less than 18, the student cannot vote
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        
        // Close the Scanner to release system resources
        input.close();
    }
}
