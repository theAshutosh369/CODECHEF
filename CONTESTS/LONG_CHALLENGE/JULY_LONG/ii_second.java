package CODECHEF.CONTESTS.JULY_LONG;

import java.util.Scanner;

public class ii_second {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if( a+b+c >= 100 && a>=10 && b>=10 && c>=10 )
                System.out.println("PASS");
            else System.out.println("FAIL");
        }
    }
}
