package com.company.STARTERS_63;

import java.util.*;

public class F {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            String one = s.next();
            String two = s.next();

            int ans = 0;
            for (int i = 0; i < n; i++) {
                char a = one.charAt(i);
                char b = one.charAt(i);

                int diff = Math.abs( b-a ) ;

                if( b>a  )
                {
                    int d = ('z'-b)+('`'-a);
                    if( d > (b-a) )
                    {
                        ans = ans + (b-a);
                    }
                    else {
                        ans = ans - d;
                    }
                }
                else {

                }

            }

            System.out.println(ans );

        }
        s.close();
        //-------------------------------------------


    }
}
