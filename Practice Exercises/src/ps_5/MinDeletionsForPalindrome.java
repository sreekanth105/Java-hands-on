package ps_5;

import java.util.Scanner;

public class MinDeletionsForPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Find minimum deletions
        int minDeletions = findMinDeletionsForPalindrome(str);

        // Print the result
        System.out.println("Minimum number of deletions to make the string palindrome: " + minDeletions);
    }

    // Function to find minimum number of deletions to make a string palindrome
    public static int findMinDeletionsForPalindrome(String str) {
        // Find the longest palindromic subsequence (LPS)
        int lpsLength = findLongestPalindromicSubsequenceLength(str);

        // Minimum deletions = Length of string - LPS length
        return str.length() - lpsLength;
    }

    // Function to find the length of the longest palindromic subsequence (LPS)
    public static int findLongestPalindromicSubsequenceLength(String str) {
        // Reverse the string
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Find the length of the longest common subsequence between the string and its reverse
        return findLongestCommonSubsequenceLength(str, reversedStr);
    }

    // Function to find the length of the longest common subsequence between two strings
    public static int findLongestCommonSubsequenceLength(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Create a 2D array to store lengths of longest common subsequences
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dp array using bottom-up dynamic programming approach
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Return the length of the longest common subsequence
        return dp[m][n];
    }
}

