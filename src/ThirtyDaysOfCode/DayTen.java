package ThirtyDaysOfCode;

// Given a base- 10 integer, n, convert it to binary (base-2).
// Then find and print the base- 10 integer denoting the maximum number of consecutive 1's in n's binary representation.
// When working with different bases, it is common to show the base as a subscript.

import java.util.Scanner;

public class DayTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // convert to binary and split into strings of consecutive ones
        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(
                String s :groupings)

        {
            if (max < s.length()) {
                max = s.length();
            }
        }
        System.out.println(max);
    }
}
