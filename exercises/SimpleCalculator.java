import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();

        if (op.length() != 1) {
            System.out.println("Invalid Operation");
        } else {
            char operation = op.charAt(0);
            switch (operation) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.println(a / b);
                    }
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }

        sc.close();
    }
}