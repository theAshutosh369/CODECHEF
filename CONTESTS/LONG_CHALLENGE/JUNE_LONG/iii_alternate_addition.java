package codechef.JUNE_LONG;

import java.util.*;

public class iii_alternate_addition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a = s.nextInt();
            int b = s.nextInt();

            a=a+2;

            if( (b-a)%3==0 ) System.out.println("NO");
            else System.out.println("YES");

        }
        s.close();
        //-------------------------------------------


    }
}
