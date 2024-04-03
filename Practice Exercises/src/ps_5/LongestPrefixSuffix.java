package ps_5;

import java.util.Scanner;

public class LongestPrefixSuffix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Find the length of the longest prefix which is also a suffix
        int length = longestPrefixSuffix(s);

        // Print the result
        System.out.println("Length of the longest prefix which is also a suffix: " + length);
    }

    // Function to find the length of the longest prefix which is also a suffix
    public static int longestPrefixSuffix(String s) {
        int n = s.length();

        // Calculate the LPS array
        int[] lps = computeLPSArray(s);

        // Length of the longest prefix which is also a suffix
        int longest = lps[n - 1];

        // If the longest prefix which is also a suffix includes the entire string,
        // we need to find the next longest prefix which is also a suffix
        if (longest > 0 && n % (n - longest) == 0) {
            longest = lps[longest - 1];
        }

        return longest;
    }

    // Function to compute the LPS (Longest Prefix Suffix) array using KMP algorithm
    private static int[] computeLPSArray(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}

