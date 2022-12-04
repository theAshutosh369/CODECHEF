package STARTERS_64;

import java.util.*;

public class A {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                min = Math.min( min , arr[i]);
            }

            int c=0;
            boolean f = true;
            for (int i = 0; i < n; i++) {
                if( arr[i]%min !=0 )
                {
                    f=false;
                    System.out.println(n);
                    break;
                }
                else if( arr[i]!=min && arr[i]%min==0 )
                {
                    c++;
                }
            }

            if( f )
            {
                System.out.println(c);
            }

        }
        s.close();
        //-------------------------------------------


    }
}
