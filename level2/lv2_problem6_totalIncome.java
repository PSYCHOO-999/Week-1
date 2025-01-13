import java.util.Scanner;

public class lv2_problem6_totalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input salary and bonus
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter your bonus: ");
        double bonus = input.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Display output
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome);

        input.close();
    }
}
