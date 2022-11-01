package CODECHEF.CONTESTS.SEP_LONG;

import java.util.*;

public class D {
    public static void main ( String[] args ) {

        Scanner s = new Scanner(System.in);
        int test = s.nextInt();
        for (int t = 0; t < test; t++)
        {
            long n = s.nextInt();

            ArrayList<Long> negative = new ArrayList<>();
            ArrayList<Long> positive = new ArrayList<>();

            for (int i = 0; i < n; i++)
            {
                Long k = s.nextLong();
                if( k>=0  ) positive.add(k);
                else negative.add(k);
            }

            Collections.sort(negative);
            Collections.sort(positive);
            System.out.println(positive);
            System.out.println(negative);

            if( negative.size()==0 )
            {
                Long a = positive.get(0);
                Long b = positive.get( positive.size()-1 );
                System.out.println( a*a + " " + b*b );
            }
            else if( positive.size()==0 )
            {
                Long b = negative.get(0);
                Long a = negative.get( negative.size()-1 );
                System.out.println( a*a + " " + b*b );
            }
            else {
                long a = negative.get(0);
                long b = positive.get(  positive.size()-1 );
                if( Math.abs(a) > b )
                {
                    System.out.println( b*a + " " + a*a );
                }
                else {
                    System.out.println( b*a + " " + b*b );
                }
            }



        }

    }
}
