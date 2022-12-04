package codechef;

import java.util.Scanner;

public class Codechef {

    static long gcd ( long x , long y )
    {
       while(y%x!=0)
       {
           long m = y%x;
           y=x;
           x=m;
       }
       return x;
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int z = 1; z <= T; z++)
        {
            long p = s.nextLong();
            long q = s.nextLong();

            if(p==1 || q==1) System.out.println(-1);
            else if( gcd(p,q)==1) System.out.println(1);
            else System.out.println(0);
        }




    }
}
