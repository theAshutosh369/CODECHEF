package STARTERS_66;

import java.util.*;

public class B {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();

            int bits = (int)(Math.log(n) / Math.log(2) );
            System.out.println( a*bits + (bits-1)*b);

        }
        s.close();
        //-------------------------------------------


    }
}
