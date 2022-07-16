package PrepareJava;

import java.util.Scanner;

// TODO:
// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

public class JavaStringReverse {
    public static void checkPalindrome (String input) {
        StringBuilder n = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            n.append(input.charAt(i));
        }
        if (input.equals(n.toString())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        checkPalindrome(A);

    }
}
