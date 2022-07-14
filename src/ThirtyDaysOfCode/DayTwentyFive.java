package ThirtyDaysOfCode;

import java.util.Scanner;

// TODO:
// A prime is a natural number greater than that has no positive divisors other than and itself.
// Given a number, n, determine and print whether it is prime or not prime .

public class DayTwentyFive {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i]))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }

    public static boolean isPrime(int number) {

        double numberSqrt = Math.sqrt(number);

        if (number <= 1)
            return false;

        else {
            for (int j = 2; j <= numberSqrt; j++) {
                if (number % j == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
