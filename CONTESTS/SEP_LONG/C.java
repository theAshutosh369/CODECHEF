package CODECHEF.CONTESTS.SEP_LONG;

import java.util.*;

public class C {
    public static void main ( String[] args ) {


        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int t = 0; t < test; t++) {
            int n = scan.nextInt();
            int[] vish = new int[n];
            Map<Integer,Integer> mappppp = new TreeMap<>();
            for (int i = 0; i < n; i++)
            {
                vish[i] = scan.nextInt();
                if( !mappppp.containsKey(vish[i]) )
                {
                    mappppp.put( vish[i] , 1 );
                }
                else {
                    mappppp.put( vish[i] , mappppp.get(vish[i])+1 );
                }
            }

            long res= 0;
            for ( Map.Entry<Integer,Integer> e : mappppp.entrySet() )
            {
                long k = e.getValue() ;
                if( k>=2 ) res = res + ( k*(k-1)/2 ) ;
            }
            System.out.println(res);

        }




    }
}
