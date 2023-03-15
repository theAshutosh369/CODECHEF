package CODECHEF;

import java.util.*;

public class chef_and_recipes {
    static Scanner s = new Scanner(System.in);

    static int gcd(int a, int b)
    {
        int result = Math.min(a, b); // Find Minimum of a and b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of a and b
    }
    static void AshutoshKaUniqueAnswer () {
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        int g = arr[0];
        for (int i = 1; i < n; i++) {
            g = gcd( g , arr[i] );
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / g ;
            System.out.print( arr[i] + " ");
        }
        System.out.println();


    }

    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            AshutoshKaUniqueAnswer();
        }
        s.close();


    }
}

