package CODECHEF.CONTESTS.SEP_LONG;

import java.util.*;

public class B {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            float a = s.nextInt();
            float b = s.nextInt();
            float c = s.nextInt();
            float d = s.nextInt();


            if( a/b > c/d ) System.out.println("Alice");
            else if ( a/b == c/d ) System.out.println("Equal");
            else System.out.println("Bob");


        }
        s.close();
        //-------------------------------------------


    }
}
