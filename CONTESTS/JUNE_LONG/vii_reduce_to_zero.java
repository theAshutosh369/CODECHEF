package codechef.JUNE_LONG;

import java.util.*;

public class vii_reduce_to_zero {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            long a = s.nextLong();
            long b = s.nextLong();
            long min , max ;
            if(a>b) {
                max = a ;
                min = b;
            }
            else {
                max = b;
                min = a;
            }

            if( ( a==0 && b!=0 ) || ( b==0 && a!=0 ) )
            {
                System.out.println( -1 );
            }
            else if( min==max )
            {
                System.out.println( a );
            }
            else if( max-min <= min )
            {
                System.out.println( 1 + max);
            }
            else
            {
                long c=0;
                while( min < max )
                {
                    min=min*2;
                    c++;
                }
                if( min>=max)
                {
                    c--;
                }
                System.out.println( c + 1 + max );
            }
        }
        s.close();
        //-------------------------------------------






    }
}


/*
3 48 = 52
6 10  = 11
2 6 = 8
3 8 = 10
111 103 = 112
34 35 = 36

 */
