public class Pascal {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }

    }

}

/*
      1
     1 1
    1 2 1
   1 3 3 1

 */ 
