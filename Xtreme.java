// Find smallest divisor (other than 1) of a number
public class Xtreme {
    public static void main(String[] args) {
        int num = 91;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Smallest divisor: " + i);
                break;
            }
        }

    }

}
