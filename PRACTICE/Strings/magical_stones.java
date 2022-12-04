package codechef;

import java.util.*;

public class magical_stones {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int l = s.nextInt();
            int r = s.nextInt();
            int len = 2*n+1;

          long[] arr = new long[len];
          int[] temp = new int[len];
          int value = -n;
          for (int i = 0; i <len ; i++)
          {
              temp[i]=value;
              value++;
          }
//
//            System.out.println("index array");
//            for (int i = 0; i < len; i++) {
//                System.out.print(temp[i]+" ");
//            }
//            System.out.println();

          long prev = 1;
          int j = 1;
          arr[0]=1;
          for (int i = 1; i <= n; i++)
          {
              long curr = ( (prev*(n-i+1))/i ) % ( (long)Math.pow(10,9)+7 ) ;
              arr[j]=0;
              j++;
              arr[j]=curr % ( (long)Math.pow(10,9)+7 );
              j++;
              prev = curr% ( (long)Math.pow(10,9)+7 );
          }

//            System.out.println("stone no array");
//            for (int i = 0; i < len; i++) {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
          int ini = -1;
          int fin = -1;

            for (int i = 0; i < len; i++)
            {
                if( temp[i]==l )
                {
                    ini=i;
                }
                if( temp[i]==r )
                {
                    fin=i;
                }
            }

//            System.out.println("answer");
            for (int i=ini ; i <=fin ; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
        s.close();
        //-------------------------------------------

    }
}
