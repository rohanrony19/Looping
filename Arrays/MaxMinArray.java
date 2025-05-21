package Arrays;

// Find Maximum and Minimum
public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {7,3,9,2};
        int max = arr[0];
        int min = arr[3];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
    
}
