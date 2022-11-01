package codechef.JUNE_LONG;

import java.util.*;

public class ii_subscriptions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n =s.nextInt();
            int x =s.nextInt();

            if( n%6==0 )
            {
                System.out.println( (n/6) *x);
            }
            else
            {
                System.out.println( (n/6) *x + x );
            }


        }
        s.close();
        //-------------------------------------------


    }
}
