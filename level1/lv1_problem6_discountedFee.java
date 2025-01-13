import java.util.Scanner;

public class lv1_problem6_discountedFee {
    public static void main(String[] args) {
        // Fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount and final fee
        double discountAmount = (discountPercent / 100.0) * fee;
        double discountedFee = fee - discountAmount;

        // Display output
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}
