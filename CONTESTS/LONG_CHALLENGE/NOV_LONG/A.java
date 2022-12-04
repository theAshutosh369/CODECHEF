package NOV_LONG;

import java.util.*;

public class A {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int m = s.nextInt();
            int n = s.nextInt();
            if( m>n ) System.out.println("YES");
            else System.out.println("NO");

        }
        s.close();
        //-------------------------------------------


    }
}
