package CODECHEF.CONTESTS.starters_62;

import java.util.*;

public class A {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            System.out.println( Math.max( a , Math.max(b ,c )) - Math.min( a , Math.min(b , c)));
        }
        s.close();
        //-------------------------------------------


    }
}
