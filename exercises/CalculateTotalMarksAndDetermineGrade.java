import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += scanner.nextInt();
        }

        char grade;
        if (totalMarks >= 450) {
            grade = 'A';
        } else if (totalMarks >= 400) {
            grade = 'B';
        } else if (totalMarks >= 350) {
            grade = 'C';
        } else if (totalMarks >= 300) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);

        scanner.close();

    }  

}