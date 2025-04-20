//Find largest digit in a number
public class Yak {
    public static void main(String[] args) {
        int num = 9375, max = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            if (digit > max)
                max = digit;
        }
        System.out.println("Largest digit: " + max);

    }

}
