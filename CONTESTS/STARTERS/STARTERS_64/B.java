package STARTERS_64;

import java.util.*;

public class B {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int l = s.nextInt();
            String str = s.next();


            String s1 = str.substring(0,l/2);
            String s2 = str.substring(l/2 , l);
            if( s1.equals(s2)) System.out.println("YES");
            else System.out.println("NO");



        }
        s.close();
        //-------------------------------------------


    }
}
