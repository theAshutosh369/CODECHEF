package CODECHEF.CONTESTS.starters_47;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n =s.nextInt();
            if( n==1 || n==3 || n==5 )
            {
                System.out.println("NO");
            }
            else System.out.println("YES");

        }
        s.close();
        //-------------------------------------------


    }
}
