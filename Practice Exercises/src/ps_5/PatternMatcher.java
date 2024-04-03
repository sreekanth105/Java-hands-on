package ps_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dictionary
        System.out.println("Enter the dictionary (press enter twice to finish):");
        List<String> dictionary = new ArrayList<>();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            dictionary.add(line);
        }

        // Input the pattern
        System.out.print("Enter the pattern: ");
        String pattern = scanner.nextLine();

        // Find strings that match the pattern
        List<String> matches = findMatches(dictionary, pattern);

        // Print the matches
        System.out.println("Strings that match the pattern:");
        for (String match : matches) {
            System.out.println(match);
        }
    }

    // Function to find strings in the dictionary that match the given pattern
    public static List<String> findMatches(List<String> dictionary, String pattern) {
        List<String> matches = new ArrayList<>();

        // Escape special characters in the pattern
        pattern = Pattern.quote(pattern);

        // Replace '?' in the pattern with '.' for regex matching
        pattern = pattern.replaceAll("\\?", ".");

        // Add anchors to match the entire string
        pattern = "^" + pattern + "$";

        // Compile the pattern
        Pattern regexPattern = Pattern.compile(pattern);

        // Match each string in the dictionary against the pattern
        for (String str : dictionary) {
            Matcher matcher = regexPattern.matcher(str);
            if (matcher.matches()) {
                matches.add(str);
            }
        }

        return matches;
    }
}
