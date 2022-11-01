package codechef.starter_42;

import java.util.*;

public class iv_divisible_by_3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int Tienn = scan.nextInt();
        for (int t = 1;t <= Tienn; t++)
        {
            int aaa = scan.nextInt();
            int bbb = scan.nextInt();
            int x = aaa%3;
            int y = bbb%3;

            if( aaa%3==0 || bbb%3==0 )
            {
                System.out.println(0);
            }
            else if( aaa==bbb || x==y )
                System.out.println(1);
            else {
                System.out.println(2);
            }


        }


    }
}
