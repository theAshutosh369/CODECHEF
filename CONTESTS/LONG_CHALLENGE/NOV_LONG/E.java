package NOV_LONG;

import java.util.*;

public class E {

    static long module = 998244353;
    static Scanner scnakrbhai = new Scanner(System.in);

    static void ashutosh(){
        int sakhya = scnakrbhai.nextInt();
        int ganu[] = new int[sakhya];

        long uttr = 0;
        for (int i = 0; i < sakhya; i++)
        {
            ganu[i] = scnakrbhai.nextInt();
            uttr = ( uttr + ganu[i] ) % module  ;
        }

        long temp =  uttr*(uttr-1);
        System.out.println( temp%module );
    }
    public static void main ( String[] args ) {

        int testcase  = scnakrbhai.nextInt();
        for (int i = 0; i < testcase; i++) {
            ashutosh();
        }

    }
}
