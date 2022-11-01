package CODECHEF.CONTESTS.starters_62;

import java.util.*;

public class C {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int x = s.nextInt();
          int y = s.nextInt();

            System.out.println( (x/y) + (x%y));

        }
        s.close();
        //-------------------------------------------


    }
}
