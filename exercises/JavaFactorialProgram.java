import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the non-negative integer n
        int n = scanner.nextInt();
        
        // Use long to prevent integer overflow for larger factorials
        long factorial = 1; 
        
        // Execute the do-while loop only if n is greater than 0
        if (n > 0) {
            int i = 1;
            do {
                factorial *= i;
                i++;
            } while (i <= n);
        }
        
        // Print the calculated factorial
        System.out.println(factorial);
        
        scanner.close();
    }
}