package CODECHEF.CONTESTS.starters_43;

import java.util.*;

public class iv_ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n =s.nextInt();
            int k =s.nextInt();
            int m=1;
            int arr[] = new int[n+1];
            for (int i = 1; i <n+1; i++)
            {
                arr[i]=m;
                if(i%5==0)
                {
                    m++;
                }
            }

            int brr[] = new int[n+1];
            for (int i = k+1; i < n+1; i++) {
                brr[i]=arr[i-1];
            }

            int ans=0;
            for (int i = k+1; i < n+1; i++)
            {
                if( arr[i]!=brr[i])
                {
                    ans++;
                }
            }
            System.out.println(ans);

        }
        s.close();
        //-------------------------------------------


    }
}
