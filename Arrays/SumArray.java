package Arrays;

// Sum of All Elements
public class SumArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int sum = 0;

        for (int num = 0; num < arr.length; num++) {
            sum = sum + arr[num];
            
        }
        // for (int num : arr) {
        //     sum += num;
        // }
        System.out.println("Sum = " + sum);
    }
    
}
