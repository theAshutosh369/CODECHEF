package CODECHEF.CONTESTS.JULY_LONG_2;

import java.util.*;

public class C
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t0aai = scan.nextInt();
        for (int t = 0; t < t0aai; t++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int n = scan.nextInt();
            int r = scan.nextInt();

           if( r/y>=n ) {
               System.out.println(0+" "+n);
           }
           else if( r/x < n ){
               System.out.println( -1 );
           }
           else {
               int ans = ( r-(y*n) ) / ( x-y);
               if( (r-(y*n)) % (x-y) !=0 )
               {
                    ans = ans+1;
               }
               System.out.println(  ans + " "+ (n-ans) );
           }

        }


    }
}
