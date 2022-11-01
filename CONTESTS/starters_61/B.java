package CODECHEF.CONTESTS.starters_61;

import java.util.*;

public class B {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            String str = s.next();
            int c =0;
            for (int i = 0; i < n-1; i++) {
                if( str.charAt(i)==str.charAt(i+1 ))
                {
                    c++;
                }
            }
            System.out.println(c);

        }
        s.close();
        //-------------------------------------------


    }
}
