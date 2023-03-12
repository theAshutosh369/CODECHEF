package CODECHEF.PRACTICE;

import java.util.*;

public class a_good_set {
    static Scanner s = new Scanner(System.in);

    static void AshutoshKaUniqueAnswer () {
        int n = s.nextInt();
        int st = 1;
        for (int i = 0; i < n ; i++) {
            System.out.print( st + " ");
            st+=2;
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

