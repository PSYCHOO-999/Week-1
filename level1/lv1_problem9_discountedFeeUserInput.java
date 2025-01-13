import java.util.Scanner;

public class lv1_problem9_discountedFeeUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input fee and discount percentage
        System.out.print("Enter the student fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discountAmount = (discountPercent / 100.0) * fee;
        double discountedFee = fee - discountAmount;

        // Display output
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + discountedFee);

        input.close();
    }
}
