package ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayFive {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        // Given an integer, n, print its first 10 multiples.
        // Each multiple  (where 1 <= i <= 10) should be printed on a new line in the form:
        // n x i = result.

        for (int i = 1; i <= 10; i++) {
            int result = (n * i);
            System.out.printf("%d x %d = %d\n", n, i, result );
        }
    }
}
