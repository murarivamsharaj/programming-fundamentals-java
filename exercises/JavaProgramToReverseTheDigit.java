import java.util.Scanner; 

public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        // Read the integer input
        int n = scanner.nextInt();
        
        // Use long to safely handle potential integer overflow during reversal
        long reversed = 0; 
        
        // Loop to extract and reverse digits
        while (n != 0) {
            int digit = n % 10;                // Extract the last digit
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            n /= 10;                           // Remove the last digit from the original number
        }
        
        // Print the reversed integer
        System.out.println(reversed);
        
        scanner.close(); 
    } 
}