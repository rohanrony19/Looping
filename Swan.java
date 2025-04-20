//Calculate power (a^b) without using Math.pow:2^5
public class Swan {
    public static void main(String[] args) {
        int base = 2, exp = 5, result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);

    }
}
