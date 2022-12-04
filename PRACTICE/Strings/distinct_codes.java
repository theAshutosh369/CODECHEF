package codechef.Strings;

import java.util.*;

public class distinct_codes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {

            String str = s.next();
            Set<String> st = new HashSet<>();
            for (int i = 0; i < str.length()-1; i++)
            {
                st.add( str.substring(i,i+2) );
            }
            System.out.println(st.size());
        }


    }
}
