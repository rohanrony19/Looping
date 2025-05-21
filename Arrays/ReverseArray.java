package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Input: Elements of array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Output: Original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse and output
        System.out.print("\nReversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
