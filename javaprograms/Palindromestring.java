import java.util.Scanner;

public class Palindromestring {
    public static void main(String[] args) {
        String s1, s2 = "";
        Scanner s = new Scanner(System.in);
        System.out.println("enter a word");
        s1 = s.nextLine();
        int l = s1.length();
        for (int i = l - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);

        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("given word is palindrome");
        } else {
            System.out.println("given word is not a palindrome");
        }
        s.close();

    }
}
