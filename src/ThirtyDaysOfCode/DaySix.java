package ThirtyDaysOfCode;

import java.util.Scanner;

public class DaySix {

    /*
    Given a string, S, of length N that is indexed from 0 to N-1,
    print its even-indexed and odd-indexed characters as
    space-separated strings on a single line (see the Sample below for more detail).
    Sample input:
                    2
                    Hacker
                    Rank
    Sample output:
                    Hce akr
                    Rn ak
    */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String inp;

        // perform this loop for n amount of lines to be scanned
        // example: n = 2 would expect 2 lines of strings to be scanned
        for(int i = 0 ; i < n; i++){
            inp = scan.next(); // store each String line

            // iterate indexes of string by 2 starting at 0. This will print all "even" indexes
            for(int j = 0; j < inp.length(); j+=2){
                System.out.print(inp.charAt(j)); // print even indexes as a sequence
            }

            System.out.print(" "); // space the printed sequences

            // iterate indexes of string by 2 starting at 1. This will print all "odd" indexes
            for(int j = 1; j < inp.length(); j+=2){
                System.out.print(inp.charAt(j)); //print odd indexes as a sequence
            }
            System.out.println(); // print a new line to separate test cases (lines of strings to be scanned)
        }
        scan.close();
    }
}
