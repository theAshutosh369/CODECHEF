package CODECHEF.CONTESTS.JULY_LONG;

import java.util.Scanner;

public class iii_third {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++)
        {
            int n = s.nextInt();
            int x = s.nextInt();
            if( x>=n ) System.out.println(0);
            else if( (n-x)%4==0 )
                System.out.println( (n-x)/4);
            else System.out.println( (n-x)/4 +1);


        }


    }
}
