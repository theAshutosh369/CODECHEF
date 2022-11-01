package codechef.practice;

import java.lang.reflect.Array;
import java.util.*;

public class hotel_byteLandia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

          for (int i = 0; i < n; i++)
          {
            a[i] = s.nextInt();
            if( a[i]<min ) min = a[i];
          }

          for (int i = 0; i < n; i++)
          {
            b[i] = s.nextInt();
            if( b[i]>max ) max = b[i];
          }

          int[] arr = new int[max-min+1];
          Arrays.fill(arr,0);
          for (int i = 0; i < n ; i++)
          {
              for (int j = a[i]; j <b[i] ; j++)
              {
                  arr[j-min] +=1;
              }
          }

            Arrays.sort(arr);
            System.out.println(arr[max-min]);


        }
        s.close();
        //-------------------------------------------


    }
}
