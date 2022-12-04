package codechef;

import java.util.*;

public class Mystical_numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++)
            {
            arr[i] = s.nextLong();
            }

            int q = s.nextInt();
            for(int i = 0; i < q; i++)
            {
                int l =s.nextInt()-1, r=s.nextInt()-1 ;
                long x = s.nextLong();
                long len = (int)(Math.log(x) / Math.log(2) + 1 );
                long num1 = (long)Math.pow(2,len-1);
                long num2 = num1*2 - 1;
                long ans =0;

                for(int j = l; j <=r; j++)
                {
                    if( arr[j]<num1 || arr[j]>num2)
                    {
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
        s.close();
        //-------------------------------------------


    }
}
