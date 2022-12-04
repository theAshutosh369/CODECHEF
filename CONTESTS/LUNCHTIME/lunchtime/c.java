package CODECHEF.CONTESTS.lunchtime;

import java.util.*;

public class c
{
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int q = s.nextInt();

            int[] arr = new int[n];


            ArrayList<Integer> st = new ArrayList<>();
          for (int i = 0; i < n; i++)
            {
              arr[i] = s.nextInt();
              if( i>=1 && arr[i-1]> arr[i] )
              {
                    st.add( arr[i-1]-arr[i]);
              }
            }

            for (int k = 0; k < q; k++)
            {
              int i = s.nextInt();
              int x = s.nextInt();

              arr[i-1] = x;
              int m = i-1;

              System.out.println( st );
              if( m==0 && arr[m]>arr[m+1] )
              {
                  st.remove(m-1);
                  st.add(m-1 , arr[m]-arr[m+1]);
              }
              else if( m== n-1 && arr[m-1]>arr[m])
              {
                  st.remove(m-1);
                  st.add(m-1 , arr[m-1]-arr[m]);
              }
              else {
                  st.remove(m-1);
                  st.remove(m-1);
                  st.add( arr[m-1]- arr[m]);
                  st.add( arr[m]- arr[m+1]);

              }



              System.out.println( Collections.max(st) );


            }


        }
        s.close();
        //-------------------------------------------


    }
}
