import java.util.HashSet;

public class Lv3_Problem7_OTPGenerator {

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        // Generate a 6-digit OTP number
        return (int) (Math.random() * 900000) + 100000;  // Ensures a number between 100000 and 999999
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Use a HashSet to store unique OTPs
        HashSet<Integer> otpSet = new HashSet<>();
        
        // Add all OTPs to the set
        for (int otp : otps) {
            otpSet.add(otp);
        }

        // If the size of the set is the same as the array length, all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        // Array to store the 10 OTPs generated
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if the OTPs are unique
        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
