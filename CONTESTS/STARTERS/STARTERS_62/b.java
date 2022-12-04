package CODECHEF.CONTESTS.starters_62;

import java.util.*;

public class b {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
          int x = s.nextInt();
          int y = s.nextInt();

          if( y%x == 0 ) System.out.println("YES");
          else System.out.println("NO");

        }
        s.close();
        //-------------------------------------------


    }
}
