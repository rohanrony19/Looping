//Find smallest digit in a number
public class Zoo {
    public static void main(String[] args) {
        int num = 9375, min = 9;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            if (digit < min)
                min = digit;
        }
        System.out.println("Smallest digit: " + min);

    }

}
