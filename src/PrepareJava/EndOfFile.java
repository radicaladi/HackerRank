package PrepareJava;

import java.util.Scanner;

// CHALLENGE:
// The challenge here is to read lines of input until you reach EOF, then number and print all lines of content.
// hint: Java's Scanner.hasNext() method is helpful for this problem.
/*
       Sample Input:
                    Hello world
                    I am a file
                    Read me until end-of-file.
       Sample Output:
                    1 Hello world
                    2 I am a file
                    3 Read me until end-of-file.
 */

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(scan.hasNextLine()) {
            i++;
            System.out.printf("%d" + " " + "%s" + "\n", i, scan.nextLine());
        }
        scan.close();
    }
}
