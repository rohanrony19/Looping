package Arrays;

import java.util.Scanner;

public class SearchElement {
   public static void main(String[] args) {
        int[] arr = {10, 20, 30,40,50,60};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index : " + i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Not found");
    } 
}
