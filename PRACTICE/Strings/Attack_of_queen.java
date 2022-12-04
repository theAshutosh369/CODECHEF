package codechef;

import java.util.*;

public class Attack_of_queen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int m = 1;m <= T; m++)
        {
            int numberofrows = s.nextInt();
            int xposition = s.nextInt();
            int yposition = s.nextInt();
//
//            int ans = 2*(n-1);
//
//          int max = Math.max(x,y) , min = Math.min(x,y);
//          int mm = min-1;
//          int mp = max-1;
//          int pm = n-max;
//          int pp = n-max;
//
//          if( x==1 || x==n || y==1 || y==n )
//          {
//              System.out.println(ans+n-1);
//          }
//          else
//          {
//              System.out.println(ans+mm+mp+pm+pp);
//          }

            System.out.println( 2*(numberofrows-1) + Math.min(xposition-1,yposition-1) + Math.min(xposition-1 , numberofrows-yposition) + Math.min(numberofrows-xposition,yposition-1) + Math.min(numberofrows-xposition , numberofrows-yposition) );

        }
        s.close();



    }
}
