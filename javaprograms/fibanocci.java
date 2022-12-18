import java.util.Scanner;

public class fibanocci {
    public static void main(String[] args) {
        int ft = 0, st = 1, nt, n, i = 1;
        Scanner num = new Scanner(System.in);
        System.out.print("enter a number");
        n = num.nextInt();
        while (i <= n) {
            System.out.print(ft + " ");
            nt = ft + st;
            ft = st;
            st = nt;
            i++;
        }
        num.close();

    }
}
