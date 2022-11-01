package CODECHEF.CONTESTS.AUGUST_LONG;

import java.util.*;

public class B {


    static Scanner s = new Scanner(System.in);
    static void ans( )
    {
        int a = s.nextInt();
        int b = s.nextInt();
        if( a<=b )
        {
            while (a<b)
            {
                a= a<<1;
            }
        }
        else {
            while (b<a)
            {
                b=b<<1;
            }
        }

        if( a==b ) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main ( String[] args ) {
        int t = s.nextInt();
        while (t-->0){
          ans();
        }
    }


}
