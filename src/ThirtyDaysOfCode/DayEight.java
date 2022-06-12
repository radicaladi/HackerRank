package ThirtyDaysOfCode;

//Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
// You will then be given an unknown number of names to query your phone book for.
// For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber;
// if an entry for  is not found, print Not found instead.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map <String,Integer> myMap= new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            myMap.put(name,phone);
        }
        while(in.hasNext()){

            String name = in.next();
            if (myMap.containsKey(name)) {
                int phone = myMap.get(name);
                // Write code here
                System.out.println(name + "=" + phone);
            } else System.out.println("Not found");
        }
        in.close();
    }
}
