import java.util.Scanner;
public class Largesmall {
 public static void main(String[] args) {
    int a,b;
    Scanner n=new Scanner(System.in);
    System.out.println("enter two numbers");
    a=n.nextInt();
    b=n.nextInt();
    if(a>b)
    System.out.println("a is greater "+ a);
    else
    System.out.println("b is greater "+ b);
    n.close();

 }   
}
