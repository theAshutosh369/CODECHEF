package STARTERS_64;

import java.util.*;

public class D {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            if( (arr[0]==arr[n-2] && arr[0]!=arr[n-1] ) || (arr[0]!=arr[n-1] && arr[1]==arr[n-1] ) ) System.out.println("YES");
            else if( arr[0]==arr[n-1])
            {
                int b=0;
                for (int i = 1; i < n-1; i++) {
                    if( arr[i]!=arr[0] ){
                        b++;
                        System.out.println("YES");
                        break;
                    }
                }
                if( b==0 ) System.out.println("NO");
            }
            else System.out.println("NO");
        }
        s.close();
        //-------------------------------------------


    }
}
