
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;


public class Sumuntilzero{
    public static void main(String[] args) {
        Scanner number =new Scanner(System.in);
        int n,sum=0;
        
        do{
            System.out.println("keep entering a number please");
            n=number.nextInt();
            if(n==0)
            break;
             sum=sum+n;

        }while(n!=0);
        System.out.println("sum= "+ sum);
   number.close(); }        

    
}