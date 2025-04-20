//Count the even and odd numbers from 1 to 100
public class Nail {
    public static void main(String[] args) {
        int evencount=0;
        int oddcount=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                evencount++;
            }else{
                oddcount++;
            }
           
        }
        System.out.println("Number of even numbers from 1 to 100:"+evencount);
        System.out.println("Number of even numbers from 1 to 100:"+oddcount);

    }
    
}
