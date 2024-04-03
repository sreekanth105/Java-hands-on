package ps_5;

import java.util.*;

public class StringCircleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();

        // Input the strings
        System.out.println("Enter the strings separated by space:");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        // Check if the strings can be chained to form a circle
        boolean result = canFormCircle(strings);

        // Print the result
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Function to check if the given strings can be chained to form a circle
    public static boolean canFormCircle(String[] strings) {
        // Create a graph represented as an adjacency list
        Map<Character, List<String>> graph = new HashMap<>();
        for (String str : strings) {
            char startChar = str.charAt(0);
            char endChar = str.charAt(str.length() - 1);
            if (!graph.containsKey(startChar)) {
                graph.put(startChar, new ArrayList<>());
            }
            graph.get(startChar).add(str);
        }

        // Initialize visited set
        Set<String> visited = new HashSet<>();

        // Perform depth-first search to find a Hamiltonian path
        for (String str : strings) {
            if (dfs(graph, str, visited)) {
                return true;
            }
        }

        return false;
    }

    // Depth-first search function to find a Hamiltonian path
    public static boolean dfs(Map<Character, List<String>> graph, String current, Set<String> visited) {
        char endChar = current.charAt(current.length() - 1);

        if (visited.contains(current)) {
            return false;
        }

        visited.add(current);

        if (!graph.containsKey(endChar)) {
            visited.remove(current);
            return false;
        }

        for (String neighbor : graph.get(endChar)) {
            if (!visited.contains(neighbor)) {
                if (dfs(graph, neighbor, visited)) {
                    return true;
                }
            }
        }

        visited.remove(current);
        return false;
    }
}

