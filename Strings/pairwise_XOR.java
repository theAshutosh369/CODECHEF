package codechef;

import java.util.Scanner;

public class pairwise_XOR
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int z = 0; z < t; z++)
        {
            long x = s.nextLong();
            long a = x & (-x);

            boolean b = x%2!=0;

            if( x==a || b)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println( x/2 + " " + a/2 + " " + (x-a)/2);
            }





        }

    }
}
