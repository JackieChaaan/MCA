import java.util.Scanner;

public class SortStringExample {
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

        // Sort the strings using bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    // Swap strings[j] and strings[j + 1]
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        // Print the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
