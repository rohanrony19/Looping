//Print numbers from 1 to N
import java.util.Scanner;

public class Egg{
    public static void main(String[] args) {
        int number,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        number=sc.nextInt();

        for(i=1;i<=number;i++){
            System.out.println(i);

        }
    }
}