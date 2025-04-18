//Sum and Average of 1 to N
public class Peacock {
    public static void main(String[] args) {
        int total = 0;
        int N = 10;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        System.out.println("Sum = " + total);
        System.out.println("Average = " + (total / (float) N));

    }
}
