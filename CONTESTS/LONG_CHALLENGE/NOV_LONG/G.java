package NOV_LONG;

import java.util.*;

public class G {
    static long sum( long n )
    {
        return n*(n+1)/2;
    }
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {

            long n = s.nextInt();
            long k = s.nextInt();
            long l = s.nextInt();

            long ans =0;

            if( (k+l)<=n ) {
                ans = (k*l) ;

                ans = ans + sum(n-1)- sum( k+l-1 );
            }
            else {
                long diff = (k+l) - n ;
                k = k - diff ;
                l = l - diff  ;
                ans = k*l;
            }

            System.out.println(ans );


        }
        s.close();
        //-------------------------------------------

    }
}
