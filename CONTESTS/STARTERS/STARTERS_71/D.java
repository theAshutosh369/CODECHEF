package CODECHEF.CONTESTS.STARTERS.STARTERS_71;
import java.util.*;

public class D {
    static Scanner s = new Scanner(System.in);

    static void AshutoshKaUniqueAnswer () {
        int n = s.nextInt();
        String s1 = s.next();
        String s2 = s1;

        StringBuilder t = new StringBuilder( s1 );
        t =  t.reverse();
        s1 = t.toString();

        int dp[][] = new int[n+1][n+1];
        for (int i = 1; i <n+1 ; i++) {
            for (int j = 1; j <n+1; j++) {
                if( s2.charAt( i-1)==s1.charAt(j-1) ) {
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max( dp[i-1][j] , dp[i][j-1] );
                }
            }
        }

        int ans = dp[n][n];
        System.out.println( ans/2 );



    }

    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            AshutoshKaUniqueAnswer();
        }
        s.close();
        //-------------------------------------------
    }
}

