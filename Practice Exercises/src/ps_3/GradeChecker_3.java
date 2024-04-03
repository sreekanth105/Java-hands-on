package ps_3;

import java.util.Scanner;

public class GradeChecker_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        char grade;

        if (percentage >= 60) {
            grade = 'A';
        } else if (percentage >= 45) {
            grade = 'B';
        } else if (percentage >= 35) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'A':
                System.out.println("A Grade");
                break;
            case 'B':
                System.out.println("B Grade");
                break;
            case 'C':
                System.out.println("C Grade");
                break;
            case 'F':
                System.out.println("Fail");
                break;
        }
    }
}

