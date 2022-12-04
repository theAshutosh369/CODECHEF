package codechef;

import java.util.*;

public class Admins_n_shopping {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            long x = s.nextLong();
            long min = Long.MAX_VALUE;

            long arr[] = new long[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = s.nextLong();
                if(arr[i]<min) min=arr[i];
            }

            long ans = (x%min==0) ? x/min : (x/min)+1;
            System.out.println( Math.max(n,ans) );



        }


    }
}
