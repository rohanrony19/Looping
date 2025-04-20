//Find the GCD of two numbers
public class Titan {
    public static void main(String[] args) {
        int a = 36, b = 60, gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);

    }

}
