package CODECHEF.CONTESTS.lunchtime;

import java.util.*;

public class a {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            Map<Integer,Integer> mp = new TreeMap<>();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=s.nextInt();
                if( mp.containsKey(arr[i]))
                {
                    mp.put( arr[i] , mp.get(arr[i])+1 );
                }
                else {
                    mp.put( arr[i] , 1);
                }
            }

            boolean f = true;
            for ( Map.Entry<Integer,Integer> e : mp.entrySet())
            {
                if( (n&1)==0 )
                {

                    if( e.getValue()>(n/2)){
                        f=false;
                    }
                }
                else {

                    if(e.getValue()>(n/2 +1 ) ) {
                        f=false;
                    }
                }
            }
            if( f ) System.out.println("YES");
            else System.out.println("NO");

        }
        s.close();
        //-------------------------------------------


    }
}
