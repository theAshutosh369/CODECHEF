package CODECHEF.CONTESTS.JULY_LONG;

import java.util.Scanner;

public class iv_journey_of_knight {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++)
        {
            int x1 = s.nextInt();
            int y1 = s.nextInt();

            int x2 = s.nextInt();
            int y2 = s.nextInt();

            if( ((x2-x1)+(y2-y1)&1) ==0 )
            {
                System.out.println("YES");
            }
            else System.out.println("NO");


        }
    }
}
