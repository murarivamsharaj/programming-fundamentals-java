import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer input for the year
        if (scanner.hasNextInt()) {
            int year = scanner.nextInt();
            
            // Check the leap year conditions
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}