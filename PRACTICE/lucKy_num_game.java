package CODECHEF.PRACTICE;

import java.util.*;

public class lucKy_num_game {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int H = s.nextInt();
            int M = s.nextInt();

            int temp =60*H+M;

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                int h =s.nextInt();
                int m =s.nextInt();
                arr[i] = h*60+m;
            }

            int first = arr[0];
            for (int i = 0; i < n; i++) {
                if( temp<= arr[i] ){
                    first = Math.min( first , arr[i]-temp );
                }
                else {

                    first= Math.min( first , arr[i]+ 1440-temp );
                }
            }

            System.out.println( first/60 + " "+ first%60 );
        }
        s.close();
        //-------------------------------------------


    }
}
//
//10
//5 2 2
//1 2 3 4 5
//5 3 2
//1 2 3 4 5
//5 2 4
//1 2 3 4 5
