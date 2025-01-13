import java.util.Scanner;

public class lv1_problem7_earthVolume {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        int radiusKm = 6378;

        // Volume of sphere formula
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 / Math.pow(1.6, 3);

        // Display output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}
