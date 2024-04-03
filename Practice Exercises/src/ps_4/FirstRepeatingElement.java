package ps_4;

import java.util.*;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int N = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        // Map to store the index of each element
        Map<Integer, Integer> indexMap = new HashMap<>();

        // Initialize the index of repeating element as -1
        int repeatingIndex = -1;

        // Iterate through the array
        for (int i = 0; i < N; i++) {
            if (indexMap.containsKey(arr[i])) {
                repeatingIndex = indexMap.get(arr[i]);
                break;
            } else {
                indexMap.put(arr[i], i);
            }
        }

        // Print the index of the first repeating element
        if (repeatingIndex != -1) {
            System.out.println("Index of first repeating element: " + repeatingIndex);
        } else {
            System.out.println("No repeating element found.");
        }
    }
}

