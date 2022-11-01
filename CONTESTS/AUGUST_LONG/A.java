package CODECHEF.CONTESTS.AUGUST_LONG;

import java.util.*;

public class A {
    public static void main ( String[] args ) {
        Scanner scanne = new Scanner(System.in);
        int n = scanne.nextInt();
        while(n-->0){
            int value = scanne.nextInt();
            if( value <=100 ) System.out.println(value);
            else if( value<= 1000 ) System.out.println( value-25);
            else if ( value<=5000 ) System.out.println( value-100 );
            else System.out.println(value-500);
        }

    }
}
