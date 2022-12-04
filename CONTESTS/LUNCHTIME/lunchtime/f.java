package CODECHEF.CONTESTS.lunchtime;

import java.util.*;

public class f {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {

            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i <n; i++)
            {
                arr[i] = s.nextInt();
            }

            long ans=0;
            for(int i=n-1;i>0;i--){
                if( arr[i]>0 )
                {
                    arr[i-1]= arr[i-1]-arr[i]/2;
                    arr[i]=arr[i]%2;
                }
            }

            for (int i = n-1; i>=1; i--) {
                if( arr[i]>0 && arr[i-1]>0 )
                {
                    arr[i]-=2;
                    arr[i-1]=arr[i-1]-1;
                }
            }
            for(int i =0;i<n;i++){
                ans = ans + Math.abs(arr[i]);
            }

            System.out.println(ans);
        }
        s.close();
        //-------------------------------------------

    }
}
