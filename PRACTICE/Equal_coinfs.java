package CODECHEF.PRACTICE;

import java.util.*;

public class


Equal_coinfs {
    static Scanner s = new Scanner(System.in);

    static void AshutoshKaUniqueAnswer () {
        int x = s.nextInt();
        int y = s.nextInt();

        if( (x+ 2*y)%2==0 ) System.out.println("YES");
        else System.out.println("NO");

    }

    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            AshutoshKaUniqueAnswer();
        }
        s.close();


    }
}

