import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Check the triangle inequality theorem:
        // The sum of any two sides must be strictly greater than the third side.
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a valid triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

        scanner.close();

    }

}