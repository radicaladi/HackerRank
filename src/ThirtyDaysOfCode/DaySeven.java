package ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/*
    Given an array, A, of N integers, print N's elements in reverse order as a single line of space-separated numbers.
 */

public class DaySeven {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();

        Collections.reverse(arr); // reverse the array
        for(Integer r : arr) {              // enhanced-for through each element and print each on same line with space separation
            System.out.print(r + " ");
        }
    }
}
