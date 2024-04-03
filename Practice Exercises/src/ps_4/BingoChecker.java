package ps_4;

import java.util.Scanner;

public class BingoChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept two numbers from the user
        System.out.print("Enter two numbers in the range from 1 to 40: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // Single dimension array of five integer elements
        int[] array = {7, 25, 5, 3, 19, 30, 8, 17, 17, 9, 39, 8};

        // Flag to check if both numbers are found in the array
        boolean foundNum1 = false;
        boolean foundNum2 = false;

        // Iterate through the array to check if both numbers are present
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                foundNum1 = true;
            }
            if (array[i] == num2) {
                foundNum2 = true;
            }
        }

        // Check if both numbers are found in the array
        if (foundNum1 && foundNum2) {
            System.out.println("Its Bingo");
        } else {
            System.out.println("Not Found");
        }
    }
}

