package STARTERS_66;

import java.util.*;

public class C {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();

            int l =  a*(c-1) ;
            int r =  b+(a*c) ;

            if( d%r  == 0 ) {
                System.out.println("YES");
            }
            else if( d%(r-l)>0 ){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
        s.close();
        //-------------------------------------------


    }
}
