import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        // Loop to extract each digit and add it to the sum
        while (n > 0) {
            sum += n % 10; // Add the last digit
            n /= 10;      // Remove the last digit
        }

        System.out.println(sum);

        scanner.close();
    }

}