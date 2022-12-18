
import java.util.Scanner; 
public class Simpleinterest {
    public static void main(String[] args) {
       
       float p,t,r,si;
       Scanner n=new Scanner(System.in);
       System.out.println("Enter principle,time and rate of interest");
       p=n.nextFloat();
       t=n.nextFloat();
       r=n.nextFloat();
       si=(p*t*r)/100;
       System.out.println("the simple interest is "+ si);
       n.close();



    }
}