import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Take help of Scanner to take input
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Compare using equality operator and print boolean result
        System.out.println(num1 == num2);

        sc.close();
    }
}