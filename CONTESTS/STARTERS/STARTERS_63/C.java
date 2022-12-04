package com.company.STARTERS_63;

import java.util.*;

public class C {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int m = s.nextInt();
            if( 2*n > 5*m ) System.out.println("Chocolate");
            else if( 2*n == 5*m ) System.out.println("Either");
            else System.out.println("Candy");

        }
        s.close();
        //-------------------------------------------


    }
}
