package Arrays;

// Count Even and Odd
public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        int even = 0;
        int odd = 0;

        for (int i : arr) {
            if(i % 2 == 0){
                even++;
            }else odd++;
            
        }
        System.out.println("Even = " +even);
        System.out.println("Odd = " +odd);
        
    }
    
}
