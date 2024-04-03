package ps_4;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        String input = "123";
        int k = 2;

        List<String> result = findCombinations(input, k);
        
        // Print the result
        for (String combination : result) {
            System.out.println(combination);
        }
    }

    public static List<String> findCombinations(String input, int k) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), input, k, 0);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder temp, String input, int k, int start) {
        if (temp.length() == k) {
            result.add(temp.toString());
            return;
        }
        
        for (int i = start; i < input.length(); i++) {
            temp.append(input.charAt(i));
            backtrack(result, temp, input, k, i + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
