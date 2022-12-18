import java.util.Scanner;

 class First {
    public static void main(String[] args) {
        int num;
        System.out.println("enter a number");
        Scanner nu = new Scanner(System.in);
        num = nu.nextInt();
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        nu.close();
    }
}