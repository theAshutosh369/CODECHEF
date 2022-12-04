package CODECHEF.CONTESTS.AUGUST_LONG;

import java.util.*;

public class D {
    public static void main ( String[] args ) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0)
        {
            int m = s.nextInt();
            boolean f = false;
            for (int i = 1; i <= (int)Math.sqrt(m) ; i++) {
                if(   m!=2*i && (m-2*i)%(i+2)==0  ) {
                    f=true;
                    break;
                }
            }
            if (f) System.out.println("YES");
            else System.out.println("NO");
        }


    }
}
