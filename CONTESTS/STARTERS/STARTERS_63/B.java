package com.company.STARTERS_63;

import java.util.*;

public class B {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
           int n = s.nextInt();

            for (int i = 1; i < n+1; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        s.close();
        //-------------------------------------------


    }
}
