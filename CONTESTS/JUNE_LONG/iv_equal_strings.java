package codechef.JUNE_LONG;

import java.util.*;

public class iv_equal_strings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            String a = s.next();
            String b = s.next();

            Set<Character> st = new HashSet<>();

            for (int i = 0; i < n; i++)
            {
                if( a.charAt(i)!=b.charAt(i))
                {
                    st.add(b.charAt(i));
                }
            }
            System.out.println( st.size());




        }
        s.close();
        //-------------------------------------------


    }
}
