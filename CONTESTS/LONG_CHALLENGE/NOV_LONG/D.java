package NOV_LONG;

import java.util.*;

public class D {
    public static void main ( String[] args ) {

        long mod = 1000000007;
        long fact[] =  new long[ 1000001 ];

        fact[1]=1;
        for (int i = 2; i < 1000001; i++) {
            fact[i] = ( fact[i-1]%mod * i )%mod ;
        }

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {

            int n = s.nextInt();
            int arr[] = new int[n];

            long ans = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                ans = ans + ( fact[arr[i]] )%mod ;
                ans = ans % mod ;
            }

            System.out.println(ans);

        }
        s.close();
        //-------------------------------------------


    }
}
