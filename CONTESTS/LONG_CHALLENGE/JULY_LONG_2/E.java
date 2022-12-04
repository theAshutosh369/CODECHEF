package CODECHEF.CONTESTS.JULY_LONG_2;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ajd = scan.nextInt();
        for (int t = 0; t < ajd; t++) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n  ; i++) {
                arr[i] = scan.nextInt();
            }

            long res =0;
            int[] ans = new int[n];
            for (int i = n-1; i>=0  ; i--)
            {
               if( i==n-1)
               {
                   if( arr[i]==1 ) ans[i]=1;
                   else ans[i]=0;
               }
               else {
                   if( arr[i]==1 ) ans[i]=ans[i+1]+1;
                   else ans[i]=0;
               }
                res=res+ans[i];
            }

            System.out.println(res);

        }


    }
}
