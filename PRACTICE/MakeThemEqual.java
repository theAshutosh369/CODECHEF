package CODECHEF.PRACTICE;

import java.util.*;

public class MakeThemEqual {
    static Scanner s = new Scanner(System.in);

    static void AshutoshKaUniqueAnswer () {
        int n = s.nextInt();
        int arr[] = new int[n];
        int mx = 0 ;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            mx = Math.max( mx , arr[i] );
        }

        int ans= 0 ;
        for (int i = 0; i < n; i++) {
            ans = Math.max( ans , mx-arr[i] );
        }
        System.out.println( ans );

    }

    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            AshutoshKaUniqueAnswer();
        }
        s.close();


    }
}

