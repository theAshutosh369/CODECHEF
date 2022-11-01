package CODECHEF.CONTESTS.JULY_LONG_2;

import java.util.*;

public class F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tajsakdn = scan.nextInt();
        for (int t = 0; t < tajsakdn; t++)
        {
            int n = scan.nextInt();
            int m = scan.nextInt();

            if( n>m/2 )
                System.out.println(n + " " + n);
            else if ( m>=2*n && m%n==0 )
                System.out.println(m + " " + n);
            else
            {
                int difference = Integer.MIN_VALUE;
                int ans1=0 ,ans2=0 ;
                int division = m/2;
                if( m>=2*n )
                {
                    division=2*n;
                 }
                for (int i = n; i < division; i++)
                {
                    int lion = m/i;
                    int current_distance = (i*lion)-i;
                    if (current_distance>difference)
                    {
                        difference=current_distance;
                        ans2= i*lion;
                        ans1 = i;
                    }
                }
                System.out.println( ans1 + " "+ ans2);
            }

        }


    }
}
