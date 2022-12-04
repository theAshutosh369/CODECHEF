package STARTERS_64;

import java.util.*;

public class C {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int max =0;
            for (int i = 0; i < n; i++) {
                arr[i]=s.nextInt();
                max = Math.max( max , arr[i] );
            }
            System.out.println(max );

        }
        s.close();
        //-------------------------------------------


    }
}
