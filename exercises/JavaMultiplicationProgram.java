import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        if (n <= 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Multiplication Table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        }

        scanner.close();
    }
}