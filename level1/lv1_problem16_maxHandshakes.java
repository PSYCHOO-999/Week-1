import java.util.Scanner;

public class lv1_problem16_maxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display output
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);

        input.close();
    }
}
