import java.util.Scanner;

public class lv3_problem5_dayofweek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = input.nextInt();
        System.out.print("Enter year: ");
        int y = input.nextInt();

        int yo = y - (14 - m) / 12;
        int x = yo + yo / 4 - yo / 100 + yo / 400;
        int mm = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + (31 * mm) / 12) % 7;

        System.out.println("Day of the week: " + dayOfWeek);
        input.close();
    }
}