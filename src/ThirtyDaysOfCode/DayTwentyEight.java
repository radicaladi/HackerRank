package ThirtyDaysOfCode;

import java.io.IOException;
import java.util.*;

//TODO:
//Consider a database table, Emails, which has the attributes First Name and Email ID.
// Given N rows of data simulating the Emails table, print an alphabetically-ordered list of people
// whose email address ends in @gmail.com

//Print an alphabetically-ordered list of first names for every user with a gmail account.
//Each name must be printed on a new line.

public class DayTwentyEight {
    public static void main(String[] args) throws IOException {
        int n;
        Scanner sc = new Scanner(System.in);
        String name;
        String email;
        ArrayList<String> list = new ArrayList<>();

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            name = sc.next();
            email = sc.next();

            if (email.contains("@gmail.com")) {
                list.add(name);
            }
        }
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        };
    }
}
