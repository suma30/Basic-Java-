import java .util.Scanner;
public class Fun1 {
    public static void main(String[] args) {
        System.out.println("enter three numbers");
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int c=n.nextInt();
        
        System.out.println("max of three numbers is "+ max(a,b,c));
        
        System.out.println("min of three numbers is "+ min(a,b,c));
        n.close();
}
   static int max(int a,int b,int c)
   {
    if(a>b&&a>c) 
    return a;
    else if(b>c) 
    return b;
    else return c;

   } 
   static int min(int a,int b,int c)
   {
    if(a<b&&a<c) 
    return a;
    else if(b<c) 
    return b;
    else return c;
    } 

}
