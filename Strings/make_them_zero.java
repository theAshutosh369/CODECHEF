package codechef.Strings;

import java.util.*;

public class make_them_zero {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int test = 1;test <= T; test++)
        {
            int n = s.nextInt();
            Set<Integer> st = new HashSet<>();
            for (int i = 0; i < n; i++)
            {
                st.add(s.nextInt());
            }

            Set<Integer> ans = new HashSet<>();
            for ( Integer i : st)
            {
                if( i!=0 && ( i & i-1)==0 )
                {
                    ans.add(i);
                }
                else
                {
                    while( i!=0 )
                    {
                        int k = 1<<(int)(Math.log(i)/Math.log(2));
                            ans.add(k);
                        i=i-k;
                    }
                }
            }

            System.out.println( ans.size() );

        }
        s.close();

    }
}
