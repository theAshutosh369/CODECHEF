package CODECHEF.CONTESTS.SEP_LONG;

import java.util.*;

public class E {
    public static void main ( String[] args ) {


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }

            for (int i = 0; i < n; i++)
            {
                b[i] = s.nextInt();
            }
            ArrayList<Long> arr = new ArrayList<>();

            long c=0;
            for (int i = 0; i < n; i++)
            {
                int k = a[i];
                int l = b[i];

                for (int j = 0; j < n; j++) {
                    if( a[j]<k || b[j]<l ) c++;
                }
                arr.add(c);
                c=0;
            }

            Collections.sort(arr);
            for ( int i = arr.size()-1 ; i>=0 ; i-- )
            {
                long m = arr.get( arr.size()-1 );
                if( m == arr.get(i)){
                    c++;
                }
            }
            System.out.println( c );

        }
        s.close();
        //-------------------------------------------


    }
}
