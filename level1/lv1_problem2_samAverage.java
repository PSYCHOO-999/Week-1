import java.util.Scanner;

public class lv1_problem2_samAverage {
    public static void main(String[] args) {
        // Define marks for Math, Physics, and Chemistry
        int mathMarks = 94, physicsMarks = 95, chemistryMarks = 96;

        // Calculate average
        double average = (mathMarks + physicsMarks + chemistryMarks) / 3.0;

        // Display output
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
