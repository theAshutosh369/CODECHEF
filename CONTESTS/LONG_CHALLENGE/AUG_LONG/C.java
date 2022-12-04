package CODECHEF.CONTESTS.AUGUST_LONG;

import java.util.*;

public class C {
    public static void main ( String[] args ) {

        Scanner scann= new Scanner(System.in);
        int t = scann.nextInt();
        for (int test = 0; test < t; test++) {
            int n = scann.nextInt();
            int[] psdj = new int[n-1];
            for (int i = 0; i < n-1; i++) {
                psdj[i] = scann.nextInt();
            }

            int prefix[] = new int[n-1];
            prefix[0] = psdj[0];
            for (int i = 1; i < n-1; i++)
            {
                prefix[i] = psdj[i]+prefix[i-1];

            }



            int a=psdj[0];
            int b=psdj[0];
            for (int i = 0; i < n-1; i++) {
                if( a< prefix[i]) {
                    b = b + prefix[i] - a;
                    a = a + prefix[i] - a;
                }
                b=b+psdj[i];
                a=a+psdj[i];
            }
            System.out.println(b);

        }

    }
}
