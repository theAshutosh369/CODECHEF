package CODECHEF.CONTESTS.starters_61;

import java.util.*;

public class F {

    static long res =0;
    static void soln( int x , int y , int i , int n , int dp[][] , int[] arr , int[] brr )
    {
        if( i==n+1 )
        {
            res = Math.max( res , Math.min(x ,y));
            return;
        }
        if( dp[i][x] >= y  && dp[i][x]!=0 )
        {
            return;
        }

        dp[i][x] = y;
        soln( x+arr[i] , y , i+1 , n , dp , arr , brr );
        soln( x , y+brr[i] , i+1 , n , dp , arr , brr );

    }
    public static void main ( String[] args )
    {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            long res = 0;
            int[] arr = new int[n+1];
            int[] brr = new int[n+1];
            int[][] dp = new int[101][20001];

            for (int i = 1; i <=n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 1; i <=n; i++) {
                brr[i] = s.nextInt();
            }
            soln(0 , 0 , 1 , n , dp , arr , brr);
            System.out.println( res );
        }
        s.close();


    }
}
