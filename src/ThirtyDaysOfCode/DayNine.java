package ThirtyDaysOfCode;

import java.util.Scanner;

public class DayNine {
    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static final Scanner sc = new Scanner(System.in);

    // Complete the factorial function below.
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int a = sc.nextInt();
        System.out.println(factorial(a));
    }
}
