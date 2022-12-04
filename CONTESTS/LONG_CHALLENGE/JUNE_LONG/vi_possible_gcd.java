package codechef.JUNE_LONG;

import java.util.*;

public class vi_possible_gcd {

    static int div(int n)
    {
        int ans = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                if (n / i == i)
                    ans++;

                else
                    ans = ans + 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a =s.nextInt();
            int b =s.nextInt();
            System.out.println( div( Math.abs(a-b)));

        }
        s.close();
        //-------------------------------------------


    }
}
