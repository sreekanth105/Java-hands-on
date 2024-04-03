package ps_5;
import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Replace spaces with '%20'
        String replacedString = replaceSpaces(str);

        // Print the result
        System.out.println("Result after replacing spaces: " + replacedString);
    }

    // Function to replace spaces with '%20'
    public static String replaceSpaces(String str) {
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            // If the character is a space, append "%20" to the result
            if (c == ' ') {
                result.append("%20");
            } else {
                // Otherwise, append the character itself
                result.append(c);
            }
        }
        
        return result.toString();
    }
}
