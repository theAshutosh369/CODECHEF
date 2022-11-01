package CODECHEF.CONTESTS.starters_61;

import java.util.*;

public class E {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            long uttr = 0 , c =0 ;
            ArrayList<Integer> list = new ArrayList<>();

            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            list.add(1);
            for (int i = 1; i < n-1; i++)
            {
                if( (arr[i]>arr[i-1])  &&  (arr[i]>arr[i+1] )  )
                {
                    list.add(i+1);
                }
            }

            list.add( n  );
            for (int i = 1; i <list.size(); i++) {
                c = list.get(i) - list.get(i-1 ) +1 ;
                uttr = uttr + ( c*(c+1)/2 );
            }

            uttr = uttr - (list.size()-2);
            System.out.println( uttr );
        }
        s.close();
        //-------------------------------------------


    }
}
