package CODECHEF.CONTESTS.starters_61;

import java.util.*;

public class A {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if( a+b%2!=0 || a+c%2!=0 || b+c%2!=0 )
            {
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
