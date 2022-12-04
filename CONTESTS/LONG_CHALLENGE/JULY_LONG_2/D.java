package CODECHEF.CONTESTS.JULY_LONG_2;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int teooeo = scan.nextInt();
        for (int t = 0; t < teooeo; t++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            if( a%b==0 ) System.out.println(-1);
            else {
                int mm;
                if( n%a==0 ) mm=n;
                else {
                    mm= (n/a+1)*a;
                }
                while ( mm >= n) {
                    if ( mm % b != 0)
                    {
                        System.out.println(mm);
                        break;
                    }
                    mm+=a;


                }
            }

        }


    }
}
