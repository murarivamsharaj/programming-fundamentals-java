import java.util.Scanner; 
public class Solution { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);

        // Input values
        int costPerDozen = sc.nextInt();
        int numberOfDozens = sc.nextInt();
        int perDiscount = sc.nextInt();

        // Calculate total cost
        int totalCost = costPerDozen * numberOfDozens;

        // Calculate discount amount
        double percentageLess = totalCost * (perDiscount / 100.0);

        // Calculate final price
        int finalPrice = (int)(totalCost - percentageLess);

        // Print final amount
        System.out.println(finalPrice);
    } 
}