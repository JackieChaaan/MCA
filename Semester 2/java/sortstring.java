import java.util.*;

public class sortstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to store the strings
        String[] strings = new String[n];

        // Read the strings from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the strings
        Arrays.sort(strings);

        // Print the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

			
