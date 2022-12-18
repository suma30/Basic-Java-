import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        int n1, n2;
        char c;
        System.out.println("enter two numbers");
        Scanner n = new Scanner(System.in);
        
        Scanner c1 = new Scanner(System.in);
        n1 = n.nextInt();
        n2=n.nextInt();
        System.out.println("enter a operator");
         c = c1.next().charAt(0);
        if (c == '+') {
            System.out.println((n1 + n2));

        }
        if (c == '-') {
            System.out.println((n1 - n2));

        }
        if (c == '*') {
            System.out.println((n1 * n2));

        }
        if (c == '/') {
            System.out.println((n1 / n2));

        }
        n.close();
        
        c1.close();

    }
}