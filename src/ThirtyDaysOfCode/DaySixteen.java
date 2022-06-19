package ThirtyDaysOfCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaySixteen {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        try{
            int x= Integer.parseInt(S);
            System.out.println(x);
        }catch(Exception e){
            System.out.println("Bad String");
        }
        bufferedReader.close();
    }
}
