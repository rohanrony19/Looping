package Arrays;

import java.util.Scanner;
// Input and Print Array Elements
public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    }
    

