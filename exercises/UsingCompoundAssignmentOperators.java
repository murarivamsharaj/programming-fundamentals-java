import java.util.Scanner; 

public class Solution { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        
        int initialAmount = sc.nextInt();
        int addition = sc.nextInt();
        int subtraction = sc.nextInt();
        
        // Applying compound assignment operators
        initialAmount += addition;
        initialAmount -= subtraction;
        
        System.out.println(initialAmount);
        
        sc.close(); 
    } 
}