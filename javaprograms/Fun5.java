import java.util.Scanner;
public class Fun5 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("give two numbers");
        int a=n.nextInt();
        int b=n.nextInt();
        System.out.println("product is "+pro(a,b));
        n.close();
    }
    static int pro(int a,int b){
    return a*b;}
}
