import java .util.Scanner;
public class Fun24 {
public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    System.out.println("enter a number");
    int num=n.nextInt();
   evenodd(num);
   System.out.println("give two numbers");
   int a=n.nextInt();
   int b=n.nextInt();
   System.out.println("the sum is "+sum(a,b));
    
n.close();
} 
   static void evenodd(int num)
   {
    if(num%2==0)
    System.out.println("the given number is even");
    else
    System.out.println("the given number is even");
   }
static int sum(int a ,int b)
{
    return a+b;
}}