package CODECHEF.CONTESTS.starters_62;

import java.util.*;

public class E {
    public static void main ( String[] args )
    {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a = s.nextInt();
            int b = s.nextInt();

            if( b%a!=0 )
            {
                if( b>2*a ) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("YES");
        }
        s.close();
        //-------------------------------------------


    }
}
