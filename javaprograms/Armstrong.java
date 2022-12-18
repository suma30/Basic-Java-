
import java.util.Scanner;

//Armstrong number example 1634-> [1^4+ 6^4+ 3^4+ 4^4]
//                         153 -> [1^3+ 5^3+ 3^3]
public class Armstrong {
  public static void main(String args[]) {

    Scanner n = new Scanner(System.in);
    System.out.println("enter two numbers");
    int num1 = n.nextInt();
    int num2 = n.nextInt();
    System.out.println("the armstrong numbers between the given numbers are");

    for (int i = num1 + 1; i < num2; ++i) {
      double sum = 0, count = 0;
      int rem, check = i;
      while (check != 0) {
        check = check / 10;
        ++count;
      }

      check = i;
      while (check != 0) {
        rem = check % 10;
        sum = sum + (Math.pow(rem, count));
        check = check / 10;
      }
      if (sum == i) {
        System.out.print(i + " ");
      }
    }
    n.close();
  }
}