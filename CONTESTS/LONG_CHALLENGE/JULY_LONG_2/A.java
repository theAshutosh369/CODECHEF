package CODECHEF.CONTESTS.JULY_LONG_2;

import java.util.*;

public class A
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int x = s.nextInt();
            int y = s.nextInt();
            if( y>=x) System.out.println(x);
            else System.out.println(y);

        }
        s.close();
        //-------------------------------------------


    }
}
