package CODECHEF.CONTESTS.starters_61;

import java.util.*;

public class D {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int uttr =0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            Stack<Integer> nav  = new Stack<>();


            for (int i = 0; i < n; i++) {
                if( !nav.empty() )
                {

                    if( arr[i] != nav.peek() )
                    {
                        uttr++;
                        nav.pop();
                    }
                    else {
                        nav.push( arr[i] );
                    }
                }
                else {
                    nav.push( arr[i]);

                }
            }
            while ( nav.size()>= 2 )
            {
                int tatpurta = nav.pop();
                if( tatpurta != nav.peek() )
                {
                    uttr++;
                    nav.pop();
                }
                else {


                    nav.pop();
                    nav.push(0);
                }
            }
            System.out.println( uttr );
        }
        s.close();
        //-------------------------------------------


    }
}
