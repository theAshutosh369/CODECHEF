package STARTERS_64;

import java.util.*;

public class E
{
    public static void main ( String[] args )
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            if( n<2000) System.out.println("NO");
            else System.out.println("YES");

        }
        s.close();
        //-------------------------------------------


    }
}
