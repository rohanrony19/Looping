//List all divisors of a number
public class Watch {
    public static void main(String[] args) {
        int num = 28;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

    }

}
