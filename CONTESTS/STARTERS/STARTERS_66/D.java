package STARTERS_66;

import java.util.*;

public class D {
    static Scanner s = new Scanner(System.in);

    static void ashutosh_ka_answer()
    {
        int n = s.nextInt();
        int l =0 , h = n-1 , ans = 0;
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }

        while( l<h )
        {
            if( array[l]== array[h])
            {
                l++;
                h--;
            }
            else if( array[l]>array[h] )
            {
                array[l] = array[l] - array[h];
                h--;
                ans++;
            }
            else {
                array[h] = array[h]-array[l];
                l++;
                ans++;
            }

        }

        System.out.println(ans);

    }
    public static void main ( String[] args ) {
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
           ashutosh_ka_answer();
        }
        s.close();
        //-------------------------------------------


    }
}
