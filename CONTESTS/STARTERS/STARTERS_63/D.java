package com.company.STARTERS_63;

import java.util.*;

public class D {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int count[] = new int[n+2];
//            Map<Integer , Integer> mp = new TreeMap<>();
//
//          for (int i = 0; i < n; i++) {
//            arr[i] = s.nextInt();
//            mp.put( arr[i] , mp.getOrDefault( arr[i] , 0 ) +1 );
//          }
//            System.out.println(mp);
//
//
//          int max = 0;
//          for (Map.Entry<Integer,Integer> e : mp.entrySet() )
//          {
//              if( e.getKey()%2==0 && mp.containsKey(e.getKey()+1 ) )
//              {
//                  System.out.println(mp.get(e.getKey()+1));
//                  max = Math.max( max , e.getValue()+ mp.get(e.getKey()+1)  );
//              }
//          }
//
//            System.out.println( n-max );

            for (int i = 0; i < n; i++) {
                arr[i] =s.nextInt();
                count[ arr[i] ]++;
            }


//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//            for (int i = 0; i < n+2; i++) {
//                System.out.print(count[i]+" ");
//            }
//            System.out.println();
            int ans  =0 ;
            int realans = 0;
            for (int i = 1; i < n+1; i++)
            {
                realans = Math.max( realans , count[i]);
                int m = i^(i+1);
                if( m<=1 )
                {
                    ans = Math.max( ans ,  count[i]+count[i+1]);
                }
            }
            System.out.println( n- Math.max(ans , realans));
        }
        s.close();
        //-------------------------------------------


    }
}
