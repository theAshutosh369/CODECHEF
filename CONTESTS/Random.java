package CODECHEF.CONTESTS;

import java.sql.SQLOutput;
import java.util.*;

public class Random {


    public static void main ( String[] args ) {


        long n = 100 ;
        for (int k = 0; k <= n; k++)
        {

            System.out.println("Pair for "+k + " : ");
            for (long i = 0; i <=k; i++)
            {
                for (long j = 0; j <=k ; j++)
                {
                    if( (i*i + j*j) == k )
                    {
                        System.out.println( i+" "+j);
                        break;
                    }
                }
            }


        }


    }
}
