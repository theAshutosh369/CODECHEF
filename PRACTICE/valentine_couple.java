package codechef.practice;

import java.util.*;

public class valentine_couple {
    public static void main(String[] args) {
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

            Arrays.sort(a);
            Arrays.sort(b);
            int max = Integer.MIN_VALUE;
            for ( int st =0 , en = n-1 ; st<n ; st++ , en-- )
            {
                if( max < a[st]+b[en])
                {
                    max = a[st]+b[en];
                }
            }

            System.out.println(max);
        }


    }
}
