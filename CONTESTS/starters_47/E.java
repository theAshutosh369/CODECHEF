package CODECHEF.CONTESTS.starters_47;

import java.util.*;

public class E {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int[] arr = new int[n];
            int one = 0 ;
            int end = 0;
            for (int i = 0; i < n  ; i++) {
                arr[i]= s.nextInt();
                if( arr[i]==1 ) one=i;
                if( arr[i]==n ) end=i;
            }
            if( one==0 && end==n-1)
            {
                System.out.println(0);
            }
            else {

                if( one < end ){
                    System.out.println( one + n-1 - end );
                }
                else {
                    System.out.println( one + n-1 - end -1 );

                }


            }
        }
        s.close();
        //-------------------------------------------


    }
}
