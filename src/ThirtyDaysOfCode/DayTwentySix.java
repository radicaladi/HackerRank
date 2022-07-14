package ThirtyDaysOfCode;

import java.util.Scanner;

/* TODO:
Your local library needs your help!
Given the expected and actual return dates for a library book, create a program that calculates the fine (if any).
The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0;).

If the book is returned after the expected return day but still within the same calendar month and year as the expected return date,
fine = 15 * (number of days late).

If the book is returned after the expected return month but still within the same calendar year as the expected return date,
the fine = 500 * (number of months late).

If the book is returned after the calendar year in which it was expected, there is a fixed fine of
fine = 10000.
*/

public class DayTwentySix {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int dayActual = scan.nextInt();
        int monthActual = scan.nextInt();
        int yearActual = scan.nextInt();
        int dayExpected = scan.nextInt();
        int monthExpected = scan.nextInt();
        int yearExpected = scan.nextInt();

        int fine = 0;

        if (yearActual < yearExpected) {
            System.out.println(fine);
        } else {
            if (yearActual > yearExpected) {
                fine = 10000;
            } else if (monthActual > monthExpected) {
                fine = 500 * (monthActual - monthExpected);
            } else if (dayActual > dayExpected) {
                fine = 15 * (dayActual - dayExpected);
            }
        }
        System.out.println(fine);
        scan.close();
    }
}
