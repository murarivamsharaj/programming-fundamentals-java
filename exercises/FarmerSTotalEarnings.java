import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerKg = scanner.nextDouble();
        int quantitySold = scanner.nextInt();

        double totalEarnings = pricePerKg * quantitySold;
        System.out.printf(Locale.US, "%.2f\n", totalEarnings);

        scanner.close();
    }
}