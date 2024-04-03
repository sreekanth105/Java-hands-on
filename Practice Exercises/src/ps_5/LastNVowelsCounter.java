package ps_5;

import java.util.Scanner;

public class LastNVowelsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Number of last 'n' vowels to count
        System.out.print("Enter the number of last 'n' vowels to count: ");
        int n = scanner.nextInt();

        // Count the last 'n' vowels
        String lastNVowels = countLastNVowels(inputString, n);

        // Print the result
        System.out.println("Last " + n + " vowels: " + lastNVowels);
    }

    // Function to count the last 'n' vowels of a string
    public static String countLastNVowels(String str, int n) {
        int vowelCount = 0;
        StringBuilder lastNVowels = new StringBuilder();

        // Traverse the string from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                lastNVowels.insert(0, ch); // Insert vowel at the beginning to maintain order
            }

            // Stop when 'n' vowels are found
            if (vowelCount == n) {
                break;
            }
        }

        // Check if the number of vowels found is less than 'n'
        if (vowelCount < n) {
            System.out.println("Mismatch in Vowel Count");
            return "";
        }

        return lastNVowels.toString();
    }
}

