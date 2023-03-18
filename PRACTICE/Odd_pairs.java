package CODECHEF.PRACTICE;

import java.util.*;

public class Odd_pairs {
    static Scanner s = new Scanner(System.in);

    static void AshutoshKaUniqueAnswer () {
        int n = s.nextInt();
        System.out.println( n*n/2 );

    }

    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            AshutoshKaUniqueAnswer();
        }
        s.close();


    }
}

