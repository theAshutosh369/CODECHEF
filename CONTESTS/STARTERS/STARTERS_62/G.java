package CODECHEF.CONTESTS.starters_62;

import java.util.*;

public class G {
    static Scanner input = new Scanner(System.in);
    static void Ashutosh_ka_answer()
    {
        int first = 0 , second , third;
        int ank = input.nextInt();
        while ( ank%2==0 )
        {
            first = first + 1;
            ank = ank/2 ;
        }

        if( first%2==1 )
        {
            first = first - 1;
            ank = ank * 2;
        }

        int iterator = 0;
        while( iterator*iterator <= ank )
        {
            second = ank - (iterator*iterator);
            third = (int) Math.sqrt( second );

            if( (third*third) == second )
            {
                int temp = first/2 ;
                int mul = (int)Math.pow( 2 , temp );
                System.out.println( third*mul + " " + iterator*mul );
                return;
            }
            iterator++;
        }
        System.out.println( -1 );

    }
    public static void main ( String[] args ) {
        int t = input.nextInt();
        for (int test = 0; test < t; test++) {
            Ashutosh_ka_answer();

        }

    }

}
