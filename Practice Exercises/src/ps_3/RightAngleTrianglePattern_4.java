package ps_3;

import java.util.Scanner;

public class RightAngleTrianglePattern_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // Print the current row number
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
