package CODECHEF.CONTESTS.starters_62;

import java.util.*;

public class F {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int uttr= 0;
            int length = s.nextInt();
            String dora = s.next();
            for (int i = 1; i < length; i++) {
                if( dora.charAt(i)=='0' && dora.charAt(i-1)=='1')
                {
                    uttr++;
                }
            }
            System.out.println(uttr);

        }
        s.close();
        //-------------------------------------------


    }
}
