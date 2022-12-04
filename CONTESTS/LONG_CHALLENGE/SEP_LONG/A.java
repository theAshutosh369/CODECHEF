package CODECHEF.CONTESTS.SEP_LONG;

import java.util.*;

public class A {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int w = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            System.out.println( w+ (x-y )*z);

        }
        s.close();
        //-------------------------------------------


    }
}
