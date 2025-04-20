//Sum of even and odd numbers from 1 to 100
public class Ox {
    public static void main(String[] args) {
        int evennum=0;
        int oddnum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                evennum+=i;
            }else{
                oddnum+=i;
            }
        }
        System.out.println(evennum);
        System.out.println(oddnum);

    }
    
}
