package codechef.Strings;

import java.util.*;

public class buying_sweets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            long r = s.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];
            long[] d = new long[n];


            long minr = Long.MAX_VALUE;
            for (int i = 0; i < n; i++)
            {
                a[i]=s.nextLong();
                if( a[i]<minr )
                {
                    minr = a[i];
                }
            }
            for (int i = 0; i < n; i++) {
                b[i] = s.nextLong();
            }

            long min = Long.MAX_VALUE;
            int ind = -1;
            for (int i = 0; i < n; i++)
            {
                d[i] = a[i]-b[i];
                if( d[i]<min )
                {
                    min = d[i];
                    ind = i;
                }
            }

            long ans = 0;
            while( r>= minr )
            {
                while (r >= a[ind]) {
                    ans++;
                    r = r - d[ind];
                }
                long mind = Long.MAX_VALUE;
                for (int i = 0; i < ind; i++)
                {
                    if( d[i]<mind )
                    {
                        mind = d[i];
                        ind = i;
                    }
                }
            }
            System.out.println(ans);
        }


    }
}
