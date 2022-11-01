package CODECHEF.CONTESTS.starters_62;

import java.util.*;

public class D {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int q = s.nextInt();
            int[] arr = new int[n];
            int sum =0;

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                sum = sum + arr[i];
            }

            for (int i = 0; i < q; i++) {
                int l = s.nextInt();
                int r = s.nextInt();
                int add = r-l+1;

                if( add%2!=0 )
                {
                    sum = sum + 1;
                }

            }

            System.out.println( sum );

        }
        s.close();
        //-------------------------------------------


    }
}
