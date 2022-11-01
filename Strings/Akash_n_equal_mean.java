package codechef.Strings;

import java.util.*;

public class Akash_n_equal_mean {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n =s.nextInt();
            int[] arr = new int[n];
            double sum =0;
            for (int i = 0; i < n; i++)
            {
                arr[i]=s.nextInt();
                sum+=arr[i];
            }
            double avg = sum /n;
            avg=avg*2;
            if( avg!= (int)avg) System.out.println(0);

            else
            {
                long res =0;
                Map<Integer, Integer> m = new HashMap<>();
                int ran = (int) avg;
                for (int i = 0; i < n; i++)
                {
                    if( m.containsKey(ran-arr[i]) ) res=res+ m.get(ran-arr[i]);
                    else m.put(arr[i] , m.getOrDefault(arr[i],0)+1);
                }
                System.out.println(res);
            }
        }


    }
}
