//Find the LCM of two numbers
public class Vape {
    public static void main(String[] args) {
        int a = 15, b = 20;
        int max = (a > b) ? a : b;

        for (;; max++) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM: " + max);
                break;
            }
        }

    }

}
