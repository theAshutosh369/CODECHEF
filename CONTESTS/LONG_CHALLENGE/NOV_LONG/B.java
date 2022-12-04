package NOV_LONG;

import java.util.*;

public class B {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a = s.nextInt();
          int b = s.nextInt();
          int x = s.nextInt();
          int y = s.nextInt();

          if( b>=(a-y) &&  b<=(a+x)) System.out.println("YES");
          else System.out.println("NO");

        }
        s.close();
        //-------------------------------------------


    }
}
