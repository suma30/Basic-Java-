import java.util.Scanner;

public class inr_usd {
    public static void main(String[] args) {
        double inr,usd;
        Scanner n = new Scanner(System.in);
        System.out.println("enter indian rupees");
        inr = n.nextDouble();
        usd=inr/80;
        System.out.println("Value in dollars is "+usd );
        n.close();
    }

}
