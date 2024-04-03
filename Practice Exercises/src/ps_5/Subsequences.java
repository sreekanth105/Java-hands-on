package ps_5;

import java.util.*;

public class Subsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Print all subsequences
        System.out.println("Subsequences of the string:");
        printSubsequences(str);
    }

    // Function to print all subsequences of a string
    public static void printSubsequences(String str) {
        // Helper function to generate subsequences recursively
        generateSubsequences(str, 0, "");
    }

    private static void generateSubsequences(String str, int index, String current) {
        // Base case: If the current index is equal to the length of the string, print the current subsequence
        if (index == str.length()) {
            if (!current.isEmpty()) {
                System.out.print(current + ", ");
            }
            return;
        }

        // Recursive case: Include the current character in the subsequence and move to the next index
        generateSubsequences(str, index + 1, current + str.charAt(index));

        // Recursive case: Exclude the current character from the subsequence and move to the next index
        generateSubsequences(str, index + 1, current);
    }
}

