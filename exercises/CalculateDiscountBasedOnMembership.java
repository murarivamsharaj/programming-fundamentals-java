import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String membership = scanner.next();
        double amount = scanner.nextDouble();

        if (!membership.equals("Gold") && !membership.equals("Silver") && !membership.equals("Regular")) {
            System.out.println("Invalid membership");
        } else if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            double discountRate = 0.0;

            switch (membership) {
                case "Gold":
                    discountRate = 0.30;
                    break;
                case "Silver":
                    discountRate = 0.20;
                    break;
                case "Regular":
                    discountRate = 0.07;
                    break;
            }

            double finalAmount = amount - (amount * discountRate);
            System.out.println("Final Amount after Discount: " + finalAmount);
        }

        scanner.close();

    }

}