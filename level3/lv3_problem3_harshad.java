import java.util.Scanner;

public class lv3_problem3_harshad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number, sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        input.close();
    }
}