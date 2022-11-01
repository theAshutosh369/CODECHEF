package CODECHEF.CONTESTS.JULY_LONG;

import java.util.Scanner;

public class iv_slow_solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        for (int i = 0; i < test; i++)
        {
            long t =scan.nextInt();
            long  n = scan.nextInt();
            long s = scan.nextInt();

            int count =0;
            long result =0;
            while( s>0 && count<t )
            {
                if( s < n )
                {
                    result = result + ( s*s);
                }else {
                    result = result + ( n*n );
                }

                s = s - n;
                count++;
            }
            System.out.println(result);


        }


    }
}
