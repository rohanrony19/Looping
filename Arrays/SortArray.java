package Arrays;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
        Arrays.sort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
