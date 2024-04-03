package ps_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringSplitChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the string can be split into four distinct strings
        boolean canBeSplit = checkStringSplit(str);

        // Print the result
        if (canBeSplit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Function to check if the given string can be split into four distinct strings
    public static boolean checkStringSplit(String str) {
        int n = str.length();

        // Try all possible ways to split the string into four parts
        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    String part1 = str.substring(0, i);
                    String part2 = str.substring(i, j);
                    String part3 = str.substring(j, k);
                    String part4 = str.substring(k, n);

                    // Check if all four parts are distinct
                    if (areDistinct(part1, part2, part3, part4)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    // Function to check if four strings are distinct
    public static boolean areDistinct(String s1, String s2, String s3, String s4) {
        Set<String> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        return set.size() == 4;
    }
}

