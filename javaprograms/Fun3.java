
import java.util.Scanner;

public class Fun3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter your age please");
        int age = n.nextInt();
        boolean c = voting(age);
        System.out.println("the person is eligible " + c);
        n.close();
    }

    static boolean voting(int age) {
        if (age >= 18)
            return true;
        else
            return false;
    }
}
